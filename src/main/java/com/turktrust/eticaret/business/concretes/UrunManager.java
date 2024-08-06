package com.turktrust.eticaret.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turktrust.eticaret.business.abstracts.UrunService;
import com.turktrust.eticaret.dataAccess.abstracts.UrunDao;
import com.turktrust.eticaret.entities.concretes.Urunler;

@Service
public class UrunManager implements UrunService {

	private UrunDao urunDao;
	@Autowired
	public UrunManager(UrunDao urunDao) {
		super();
		this.urunDao = urunDao;
	}

	@Override
	public List<Urunler> getAll() {
		// TODO Auto-generated method stub
		return this.urunDao.findAll();
	}
}
