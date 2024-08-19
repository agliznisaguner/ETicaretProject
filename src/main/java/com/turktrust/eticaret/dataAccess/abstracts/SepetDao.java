package com.turktrust.eticaret.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turktrust.eticaret.entities.concretes.Sepet;

public interface SepetDao extends JpaRepository<Sepet, Integer> {
	

	
}
