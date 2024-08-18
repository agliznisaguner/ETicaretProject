package com.turktrust.eticaret.business.concretes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turktrust.eticaret.business.abstracts.SepetService;
import com.turktrust.eticaret.core.utilities.mapping.ModelMapperService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.core.utilities.results.SuccessDataResult;
import com.turktrust.eticaret.core.utilities.results.SuccessResult;
import com.turktrust.eticaret.dataAccess.abstracts.SepetDao;
import com.turktrust.eticaret.dataAccess.abstracts.SiparisDao;
import com.turktrust.eticaret.entities.concretes.Sepet;
import com.turktrust.eticaret.entities.dtos.SepetUrunGetDto;
import com.turktrust.eticaret.entities.dtos.UrunDetayDto;

@Service
public class SepetManager implements SepetService {

	private SepetDao sepetDao;
	private ModelMapperService modelMapperService;

	@Autowired
	public SepetManager(SepetDao sepetDao, ModelMapperService modelMapperService) {
		super();
		this.sepetDao = sepetDao;
		this.modelMapperService = modelMapperService;
	}	

	@Override
	public DataResult<List<Sepet>> getAll() {
		return new SuccessDataResult<List<Sepet>>(this.sepetDao.findAll(), "Sepetler listelendi.");
	}

	@Override
	public Result add(Sepet sepet) {
		this.sepetDao.save(sepet);
		return new SuccessResult("Sepet eklendi.");
	}

}