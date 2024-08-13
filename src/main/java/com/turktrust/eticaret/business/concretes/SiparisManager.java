package com.turktrust.eticaret.business.concretes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turktrust.eticaret.business.abstracts.SiparisService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.core.utilities.results.SuccessDataResult;
import com.turktrust.eticaret.core.utilities.results.SuccessResult;
import com.turktrust.eticaret.dataAccess.abstracts.SiparisDao;
import com.turktrust.eticaret.entities.concretes.Siparisler;

@Service
public class SiparisManager implements SiparisService {

	private SiparisDao siparisDao;

	@Autowired
	public SiparisManager(SiparisDao siparisDao) {
		this.siparisDao = siparisDao;
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