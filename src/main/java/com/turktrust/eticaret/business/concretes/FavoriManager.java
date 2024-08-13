package com.turktrust.eticaret.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turktrust.eticaret.business.abstracts.FavoriService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.core.utilities.results.SuccessDataResult;
import com.turktrust.eticaret.core.utilities.results.SuccessResult;
import com.turktrust.eticaret.dataAccess.abstracts.FavoriDao;
import com.turktrust.eticaret.entities.concretes.Favoriler;


@Service
public class FavoriManager implements FavoriService{
	
	private FavoriDao favoriDao;
	@Autowired
	public FavoriManager(FavoriDao favoriDao) {
		super();
		this.favoriDao = favoriDao;
	}

	@Override
	public DataResult<List<Favoriler>> getAll() {
		return new SuccessDataResult<List<Favoriler>>(this.favoriDao.findAll(),"Data listelendi.");
		
	}

	@Override
	public Result add(Favoriler favori) {
		this.favoriDao.save(favori);
		return new SuccessResult("Favori eklendi.");
	}

}
