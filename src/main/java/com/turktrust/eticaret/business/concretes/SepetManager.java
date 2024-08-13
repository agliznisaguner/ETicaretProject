package com.turktrust.eticaret.business.concretes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turktrust.eticaret.business.abstracts.SepetService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.core.utilities.results.SuccessDataResult;
import com.turktrust.eticaret.core.utilities.results.SuccessResult;
import com.turktrust.eticaret.dataAccess.abstracts.SepetDao;
import com.turktrust.eticaret.entities.concretes.Sepet;

@Service
public class SepetManager implements SepetService {

	private SepetDao sepetDao;

	@Autowired
	public SepetManager(SepetDao sepetDao) {
		this.sepetDao = sepetDao;
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