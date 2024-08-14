package com.turktrust.eticaret.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turktrust.eticaret.entities.concretes.Saticilar;

public interface SaticiDao extends JpaRepository<Saticilar, Integer>{
	 
		Saticilar getBySaticiFirmaAdi(String saticiAdi);
		
	   
	

}
