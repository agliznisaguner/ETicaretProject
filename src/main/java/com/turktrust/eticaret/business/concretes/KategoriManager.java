package com.turktrust.eticaret.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turktrust.eticaret.business.abstracts.KategoriService;
import com.turktrust.eticaret.core.utilities.mapping.ModelMapperService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.core.utilities.results.SuccessDataResult;
import com.turktrust.eticaret.core.utilities.results.SuccessResult;
import com.turktrust.eticaret.dataAccess.abstracts.KategoriDao;
import com.turktrust.eticaret.entities.concretes.Kategori;

@Service
public class KategoriManager implements KategoriService {

	private KategoriDao kategoriDao;
	private ModelMapperService modelMapperService;

	@Autowired
	public KategoriManager(KategoriDao kategoriDao, ModelMapperService modelMapperService) {
		super();
		this.kategoriDao = kategoriDao;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public DataResult<List<Kategori>> getAll() {
		return new SuccessDataResult<List<Kategori>>(this.kategoriDao.findAll(), "Data listelendi.");
	}

	@Override
	public Result add(Kategori kategori) {
		this.kategoriDao.save(kategori);
		return new SuccessResult("Kategori eklendi.");
	}

}
