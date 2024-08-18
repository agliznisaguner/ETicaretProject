package com.turktrust.eticaret.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turktrust.eticaret.business.abstracts.AdresService;
import com.turktrust.eticaret.core.utilities.mapping.ModelMapperService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.core.utilities.results.SuccessDataResult;
import com.turktrust.eticaret.core.utilities.results.SuccessResult;
import com.turktrust.eticaret.dataAccess.abstracts.AdresDao;
import com.turktrust.eticaret.entities.concretes.Adres;

@Service
public class AdresManager implements AdresService{
	
	private AdresDao adresDao;
	private ModelMapperService modelMapperService;
	@Autowired
	public AdresManager(AdresDao adresDao, ModelMapperService modelMapperService) {
		super();
		this.adresDao = adresDao;
		this.modelMapperService = modelMapperService;
	}
	
	@Override
	public DataResult<List<Adres>> getAll() {
		return new SuccessDataResult<List<Adres>>(this.adresDao.findAll(),"Data listelendi.");
		
	}

	@Override
	public Result add(Adres adres){
		this.adresDao.save(adres);
		return new SuccessResult("Adres eklendi.");
	}

	@Override
	public Result delete(Adres adres) {
		this.adresDao.delete(adres);
		return new SuccessResult("Adres Silindi");
	}

	@Override
	public Result update(Adres adres) {
		this.adresDao.save(adres);
		return new SuccessResult("Adres Güncellendi");
	}

}

