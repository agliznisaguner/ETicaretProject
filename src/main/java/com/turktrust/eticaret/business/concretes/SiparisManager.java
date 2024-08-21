package com.turktrust.eticaret.business.concretes;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turktrust.eticaret.business.abstracts.SiparisService;
import com.turktrust.eticaret.core.utilities.mapping.ModelMapperService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.ErrorResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.core.utilities.results.SuccessDataResult;
import com.turktrust.eticaret.core.utilities.results.SuccessResult;
import com.turktrust.eticaret.dataAccess.abstracts.AdresDao;
import com.turktrust.eticaret.dataAccess.abstracts.MusteriDao;
import com.turktrust.eticaret.dataAccess.abstracts.SepetDao;
import com.turktrust.eticaret.dataAccess.abstracts.SiparisDao;
import com.turktrust.eticaret.dataAccess.abstracts.UrunDao;
import com.turktrust.eticaret.entities.concretes.Adres;
import com.turktrust.eticaret.entities.concretes.Sepet;
import com.turktrust.eticaret.entities.concretes.Siparisler;
import com.turktrust.eticaret.entities.concretes.Urunler;
import com.turktrust.eticaret.entities.dtos.SiparisOlusturDto;

@Service
public class SiparisManager implements SiparisService {

	private SiparisDao siparisDao;
	private ModelMapperService modelMapperService;
	private UrunDao urunDao;
	private SepetDao sepetDao;
	private AdresDao adresDao;
	private MusteriDao musteriDao;

	@Autowired
	public SiparisManager(SiparisDao siparisDao, ModelMapperService modelMapperService, UrunDao urundao,SepetDao sepetDao, AdresDao adresDao) {
		super();
		this.siparisDao = siparisDao;
		this.modelMapperService = modelMapperService;
		this.sepetDao = sepetDao;
		this.urunDao = urundao;
		this.adresDao = adresDao;
	}
	
	@Override
	public DataResult<List<Siparisler>> getAll() {
		return new SuccessDataResult<List<Siparisler>>(this.siparisDao.findAll(), "Siparişler listelendi.");
	}

	@Override
	public Result add(Siparisler siparis) {
		this.siparisDao.save(siparis);
		return new SuccessResult("Sipariş eklendi.");
	}
	@Override
	public Result siparisOlustur(SiparisOlusturDto siparisOlusturDto) {
        int musteriId = siparisOlusturDto.getMusteriId();

        List<Sepet> sepetler = sepetDao.findByMusteri_MusteriId(musteriId);
        
        if (sepetler.isEmpty()) {
            return new ErrorResult("Sepet bulunamadı.");
        }

        Sepet sepet = sepetler.get(0); 
        List<Urunler> urunler = sepet.getUrun();

        if (urunler.isEmpty()) {
            return new ErrorResult("Sepet boş.");
        }

        Siparisler siparis = new Siparisler();
        siparis.setMusteriId(sepet.getMusteri());

        double toplamFiyat = urunler.stream()
            .mapToInt(urun -> urun.getFiyatlar().get(0).getUrun_Fiyat())
            .sum();
        
        Adres adres = adresDao.findByMusteri_musteriId(musteriId);
        if(adres==null) { 
        	return new ErrorResult("Adres yok.");}
        String adresDetay = adres.getAdres();
        siparis.setSiparisDetay("Toplam Fiyat: " + toplamFiyat + ". " + " Müşteri adresi: "+ adresDetay);
 
        siparisDao.save(siparis);

        for (Urunler urun : urunler) {
        	if(urun.getStok_Sayisi()<=0) return new ErrorResult("Ürün stoğu yetersiz. Lütfen ürünü sepetten çıkardıktan sonra tekrar deneyin.");
            urun.setStok_Sayisi(urun.getStok_Sayisi() - 1);
            urunDao.save(urun);
        }
        
        sepet.getUrun().clear();
        sepetDao.save(sepet);

        return new SuccessResult("Sipariş oluşturuldu.");
    }
}