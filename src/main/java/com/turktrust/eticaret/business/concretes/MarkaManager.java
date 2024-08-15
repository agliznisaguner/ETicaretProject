package com.turktrust.eticaret.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turktrust.eticaret.business.abstracts.MarkaService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.core.utilities.results.SuccessDataResult;
import com.turktrust.eticaret.core.utilities.results.SuccessResult;
import com.turktrust.eticaret.dataAccess.abstracts.MarkaDao;
import com.turktrust.eticaret.entities.concretes.Markalar;

@Service
public class MarkaManager implements MarkaService {


	private MarkaDao markaDao;
	@Autowired
	public MarkaManager(MarkaDao markaDao) {
		super();
		this.markaDao = markaDao;
	}
	@Override
	public DataResult<List<Markalar>> getAll() {
		return new SuccessDataResult<List<Markalar>>(this.markaDao.findAll(),"Data listelendi.");
	}

	@Override
	public Result add(Markalar marka) {
		this.markaDao.save(marka);
		return new SuccessResult("Ürün eklendi.");
	}
	
	 @Override
	    public DataResult<Markalar> getByMarkaAdi(String markaAdi) {
	        return new SuccessDataResult<Markalar>(this.markaDao.getByMarkaAdi(markaAdi), "Marka adı ile arama tamamlandı.");
	    }

	    @Override
	    public DataResult<Markalar> getByMarkaAdiOrUrunId(String markaAdi, int urunId) {
	        return new SuccessDataResult<Markalar>(this.markaDao.getByMarkaAdiOrUrunId(markaAdi, urunId), "Marka adı veya ürün adı ile arama tamamlandı.");
	    }

	    @Override
	    public DataResult<List<Markalar>> getByUrunIdIn(List<Integer> urunler) {
	        return new SuccessDataResult<List<Markalar>>(this.markaDao.getByUrunIdIn(urunler), "Ürün adı listesi ile arama tamamlandı.");
	    }

}
