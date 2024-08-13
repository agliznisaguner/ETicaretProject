package com.turktrust.eticaret.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turktrust.eticaret.business.abstracts.UrunService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.core.utilities.results.SuccessDataResult;
import com.turktrust.eticaret.core.utilities.results.SuccessResult;
import com.turktrust.eticaret.dataAccess.abstracts.UrunDao;
import com.turktrust.eticaret.entities.concretes.Urunler;

@Service
public class UrunManager implements UrunService {

	private UrunDao urunDao;
	@Autowired
	public UrunManager(UrunDao urunDao) {
		super();
		this.urunDao = urunDao;
	}

	@Override
	public DataResult<List<Urunler>> getAll() {
		return new SuccessDataResult<List<Urunler>>(this.urunDao.findAll(),"Data listelendi.");
		
	}

	@Override
	public Result add(Urunler urun) {
		this.urunDao.save(urun);
		return new SuccessResult("Ürün eklendi.");
	}
}
