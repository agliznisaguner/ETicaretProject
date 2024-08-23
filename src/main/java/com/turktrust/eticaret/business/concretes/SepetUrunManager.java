package com.turktrust.eticaret.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.turktrust.eticaret.business.abstracts.SepetUrunService;
import com.turktrust.eticaret.core.utilities.mapping.ModelMapperService;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.core.utilities.results.SuccessResult;
import com.turktrust.eticaret.dataAccess.abstracts.MusteriDao;
import com.turktrust.eticaret.dataAccess.abstracts.SepetDao;
import com.turktrust.eticaret.dataAccess.abstracts.SepetUrunDao;
import com.turktrust.eticaret.dataAccess.abstracts.UrunDao;
import com.turktrust.eticaret.entities.concretes.Musteriler;
import com.turktrust.eticaret.entities.concretes.Sepet;
import com.turktrust.eticaret.entities.concretes.Sepet_Urun;
import com.turktrust.eticaret.entities.concretes.Urunler;
import com.turktrust.eticaret.entities.dtos.AddUrunToMusteriSepetDto;

@Service
public class SepetUrunManager implements SepetUrunService {
	private SepetUrunDao sepetUrunDao;
	private SepetDao sepetDao;
	private UrunDao urunDao;
	private MusteriDao musteriDao;
	private ModelMapperService modelMapperService;

	@Autowired
	public SepetUrunManager(SepetUrunDao sepetUrunDao, SepetDao sepetDao, UrunDao urunDao, MusteriDao musteriDao,
			ModelMapperService modelMapperService) {
		super();
		this.sepetUrunDao = sepetUrunDao;
		this.sepetDao = sepetDao;
		this.urunDao = urunDao;
		this.musteriDao = musteriDao;
		this.modelMapperService = modelMapperService;
	}

	@Override
	@Transactional
	public Result addUrunToSepet(AddUrunToMusteriSepetDto musteriSepetUrunAddDto) {
		int musteriId = musteriSepetUrunAddDto.getMusteriId();
		int urunId = musteriSepetUrunAddDto.getUrunId();

		Musteriler musteri = musteriDao.findById(musteriId);
		if (musteri == null) {
			throw new IllegalArgumentException("Müşteri bulunamadı.");
		}
		Urunler urun = urunDao.findById(urunId).orElseThrow(() -> new IllegalArgumentException("Ürün bulunamadı."));

		List<Sepet> sepetler = sepetDao.findByMusteri_MusteriId(musteriId);
		Sepet sepet;
		if (sepetler.isEmpty()) {
			sepet = new Sepet();
			sepet.setMusteri(musteri);
			sepetDao.save(sepet);
		} else {
			sepet = sepetler.get(0);
		}

		Sepet_Urun sepetUrun = modelMapperService.forDto().map(musteriSepetUrunAddDto, Sepet_Urun.class);
		sepetUrun.setSepet(sepet);
		sepetUrun.setUrun(urun);
		sepetUrunDao.save(sepetUrun);

		return new SuccessResult("Ürün sepete eklendi.");
	}
}
