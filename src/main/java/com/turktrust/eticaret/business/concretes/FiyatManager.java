package com.turktrust.eticaret.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turktrust.eticaret.business.abstracts.FiyatService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.core.utilities.results.SuccessDataResult;
import com.turktrust.eticaret.core.utilities.results.SuccessResult;
import com.turktrust.eticaret.dataAccess.abstracts.FiyatDao;
import com.turktrust.eticaret.entities.concretes.Fiyat;

@Service
public class FiyatManager implements FiyatService{
	
	private FiyatDao fiyatDao;
	@Autowired
	public FiyatManager(FiyatDao fiyatDao) {
		super();
		this.fiyatDao = fiyatDao;
	}

	@Override
	public DataResult<List<Fiyat>> getAll() {
		return new SuccessDataResult<List<Fiyat>>(this.fiyatDao.findAll(),"Data listelendi.");
	}

	@Override
	public Result add(Fiyat fiyat) {
		this.fiyatDao.save(fiyat);
		return new SuccessResult("Fiyat eklendi.");
	}
	

}
