package com.turktrust.eticaret.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.turktrust.eticaret.business.abstracts.UrunService;
import com.turktrust.eticaret.core.utilities.mapping.ModelMapperService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.core.utilities.results.SuccessDataResult;
import com.turktrust.eticaret.core.utilities.results.SuccessResult;
import com.turktrust.eticaret.dataAccess.abstracts.FiyatDao;
import com.turktrust.eticaret.dataAccess.abstracts.KategoriDao;
import com.turktrust.eticaret.dataAccess.abstracts.MarkaDao;
import com.turktrust.eticaret.dataAccess.abstracts.SaticiDao;
import com.turktrust.eticaret.dataAccess.abstracts.UrunDao;
import com.turktrust.eticaret.entities.concretes.Fiyat;
import com.turktrust.eticaret.entities.concretes.Saticilar;
import com.turktrust.eticaret.entities.concretes.Urunler;
import com.turktrust.eticaret.entities.dtos.SaticiUrunKayitDto;
import com.turktrust.eticaret.entities.dtos.SaticiUrunUpdateDto;
import com.turktrust.eticaret.entities.dtos.UrunWithKategoriDto;

import jakarta.transaction.Transactional;

@Service
public class UrunManager implements UrunService {

	private UrunDao urunDao;
	private ModelMapperService modelMapperService;
	private FiyatDao fiyatDao;
	private SaticiDao saticiDao;
    private MarkaDao markaDao;
    private KategoriDao kategoriDao;

	@Autowired
	 public UrunManager(UrunDao urunDao, ModelMapperService modelMapperService, SaticiDao saticiDao, MarkaDao markaDao, KategoriDao kategoriDao,FiyatDao fiyatDao) {
        this.urunDao = urunDao;
        this.modelMapperService = modelMapperService;
        this.saticiDao = saticiDao;
        this.markaDao = markaDao;
        this.kategoriDao = kategoriDao;
        this.fiyatDao =fiyatDao;
    }
	@Override
	public DataResult<List<Urunler>> getAll() {
		return new SuccessDataResult<List<Urunler>>(this.urunDao.findAll(),"Data listelendi.");
		
	}
	@Override
	public Result add(Urunler urun) {
		 urunDao.save(urun);
	        return new SuccessResult("Ürün eklendi.");
	}

	@Override
	public DataResult<Urunler> getByUrunAdi(String urunAdi) {
		return new SuccessDataResult<Urunler>(this.urunDao.getByUrunAdi(urunAdi),"Data listelendi.");
	}

	@Override
	public DataResult<Urunler> getByUrunAdiAndKategoriId(String urunAdi, int kategoriId) {
		return new SuccessDataResult<Urunler>(this.urunDao.getByUrunAdiAndKategoriId(urunAdi,kategoriId),"Data listelendi.");
	}

	@Override
	public DataResult<List<Urunler>> getByUrunAdiOrKategoriId(String urunAdi, int kategoriId) {
		return new SuccessDataResult<List<Urunler>>(this.urunDao.getByUrunAdiOrKategoriId(urunAdi, kategoriId),"Data listelendi.");
	}

	@Override
	public DataResult<List<Urunler>> getByKategoriIdIn(List<Integer> categories) {
		return new SuccessDataResult<List<Urunler>>(this.urunDao.getByKategoriIdIn(categories),"Data listelendi.");
	}

	@Override
	public DataResult<List<Urunler>> getByUrunAdiContains(String urunAdi) {
		return new SuccessDataResult<List<Urunler>>(this.urunDao.getByUrunAdiContains(urunAdi),"Data listelendi.");
	}

	@Override
	public DataResult<List<Urunler>> getByUrunAdiStartsWith(String urunAdi) {
		return new SuccessDataResult<List<Urunler>>(this.urunDao.getByUrunAdiStartsWith(urunAdi),"Data listelendi.");
	}
	@Override
	public DataResult<List<Urunler>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		return new SuccessDataResult<List<Urunler>>(this.urunDao.findAll(pageable).getContent());
	}
	@Override
	public DataResult<List<Urunler>> getByMarka_MarkaAdiIn(List<String> markaAdi) {
		
		return new SuccessDataResult<List<Urunler>>(this.urunDao.getByMarka_MarkaAdiIn(markaAdi),"Data listelendi.");
	}
	@Override
	public DataResult<List<Urunler>> getBySatici_SaticiFirmaAdiIn(List<String> saticiFirmaAdi) {
	    return new SuccessDataResult<List<Urunler>>(this.urunDao.getBySatici_SaticiFirmaAdiIn(saticiFirmaAdi), "Data listelendi.");
	}
	@Override
	public DataResult<List<UrunWithKategoriDto>> getUrunWithKategoriDetails() {
		return new SuccessDataResult<List<UrunWithKategoriDto>>(this.urunDao.getUrunWithKategoriDetails(),"Data listelendi");
	}
	@Override
    public DataResult<Urunler> getById(int id) {
        Urunler urun = urunDao.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Ürün bulunamadı."));
        return new SuccessDataResult<>(urun, "Ürün getirildi.");
    }
	 @Override
	 @Transactional
	    public Result addUrunForSatici(SaticiUrunKayitDto saticiUrunKayitDto) {
	        Urunler urun = modelMapperService.forDto().map(saticiUrunKayitDto, Urunler.class);
	        urun.setFiyatlar((List<Fiyat>) fiyatDao.findById(saticiUrunKayitDto.getFiyatId()).orElseThrow(()-> new IllegalArgumentException("Fiyat Bulunamadı")));
	        urun.setSatici(saticiDao.findById(saticiUrunKayitDto.getSaticiId()).orElseThrow(() -> new IllegalArgumentException("Satıcı bulunamadı.")));
	        urun.setMarka(markaDao.findById(saticiUrunKayitDto.getMarkaId()).orElseThrow(() -> new IllegalArgumentException("Marka bulunamadı.")));
	        urun.setKategori(kategoriDao.findById(saticiUrunKayitDto.getKategoriId()).orElseThrow(() -> new IllegalArgumentException("Kategori bulunamadı.")));
	        urunDao.save(urun);
	        
	        
	        return new SuccessResult("Ürün eklendi.");
	    }
	@Override
	@Transactional
	public Result saticiUrunUpdate(SaticiUrunUpdateDto saticiUrunUpdateDto, int saticiId, int urunId) {
		 Saticilar existingSatici = saticiDao.findById(saticiId)
		            .orElseThrow(() -> new IllegalArgumentException("Satıcı bulunamadı."));
		    
		    Urunler existingUrun = urunDao.findById(urunId)
		            .orElseThrow(() -> new IllegalArgumentException("Ürün bulunamadı."));

		    if (!existingUrun.getSatici().equals(existingSatici)) {
		        throw new IllegalArgumentException("Bu ürün bu satıcıya ait değil.");
		    }
		    existingUrun.setStok_Sayisi(saticiUrunUpdateDto.getStokSayisi());

		    Fiyat yeniFiyat = new Fiyat();
		    yeniFiyat.setUrun(existingUrun);
		    yeniFiyat.setUrun_Fiyat(saticiUrunUpdateDto.getFiyat());
		    existingUrun.getFiyatlar().add(0, yeniFiyat); 

		    urunDao.save(existingUrun);

		    return new SuccessResult("Ürün başarıyla güncellendi.");
		
	
	}
	


	//@Override
	//public DataResult<List<Urunler>> GetByNameAndCategory(String urun_adi, int kategori_id) {
		//return new SuccessDataResult<List<Urunler>>(this.urunDao.GetByUrun_adiAndKategori(urun_adi,kategori_id),"Data listelendi.");
	//}
}
