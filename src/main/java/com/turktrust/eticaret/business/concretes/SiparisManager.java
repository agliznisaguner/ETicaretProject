package com.turktrust.eticaret.business.concretes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turktrust.eticaret.business.abstracts.SiparisService;
import com.turktrust.eticaret.core.utilities.mapping.ModelMapperService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.core.utilities.results.SuccessDataResult;
import com.turktrust.eticaret.core.utilities.results.SuccessResult;
import com.turktrust.eticaret.dataAccess.abstracts.SiparisDao;
import com.turktrust.eticaret.entities.concretes.Siparisler;

@Service
public class SiparisManager implements SiparisService {

	private SiparisDao siparisDao;
	private ModelMapperService modelMapperService;

	@Autowired
	public SiparisManager(SiparisDao siparisDao, ModelMapperService modelMapperService) {
		super();
		this.siparisDao = siparisDao;
		this.modelMapperService = modelMapperService;
	}
	

	@Override
	public DataResult<List<Siparisler>> getAll() {
		return new SuccessDataResult<List<Siparisler>>(this.siparisDao.findAll(), "Siparişler listelendi.");
	}

	@Override
	public Result add(Siparisler siparis) {
		this.siparisDao.save(siparis);
		return new SuccessResult("Sipariş eklendi.");
	}
}