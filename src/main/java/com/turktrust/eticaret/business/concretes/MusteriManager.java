package com.turktrust.eticaret.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turktrust.eticaret.business.abstracts.MusteriService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.core.utilities.results.SuccessDataResult;
import com.turktrust.eticaret.core.utilities.results.SuccessResult;
import com.turktrust.eticaret.dataAccess.abstracts.MusteriDao;
import com.turktrust.eticaret.entities.concretes.Musteriler;

@Service
public class MusteriManager implements MusteriService{


	private MusteriDao musteriDao;
	@Autowired
	public MusteriManager(MusteriDao musteriDao) {
		super();
		this.musteriDao = musteriDao;
	}

	@Override
	public DataResult<List<Musteriler>> getAll() {
		return new SuccessDataResult<List<Musteriler>>(this.musteriDao.findAll(),"Data listelendi.");
		
	}

	@Override
	public Result add(Musteriler musteri) {
		this.musteriDao.save(musteri);
		return new SuccessResult("Musteri eklendi.");
	}
}
