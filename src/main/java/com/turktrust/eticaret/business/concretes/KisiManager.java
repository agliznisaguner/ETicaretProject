package com.turktrust.eticaret.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turktrust.eticaret.business.abstracts.KisiService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.core.utilities.results.SuccessDataResult;
import com.turktrust.eticaret.core.utilities.results.SuccessResult;
import com.turktrust.eticaret.dataAccess.abstracts.KisiDao;
import com.turktrust.eticaret.entities.concretes.Kisiler;

@Service
public class KisiManager implements KisiService{

	
	private KisiDao kisiDao;
	@Autowired
	public KisiManager(KisiDao kisiDao) {
		super();
		this.kisiDao = kisiDao;
	}

	@Override
	public DataResult<List<Kisiler>> getAll() {
		return new SuccessDataResult<List<Kisiler>>(this.kisiDao.findAll(),"Data listelendi.");
	}

	@Override
	public Result add(Kisiler kisi) {
		this.kisiDao.save(kisi);
		return new SuccessResult("Kişi eklendi.");
	}

}
