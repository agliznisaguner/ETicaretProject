package com.turktrust.eticaret.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turktrust.eticaret.entities.concretes.Markalar;

public interface MarkaDao extends JpaRepository<Markalar, Integer> {

	Markalar getByMarkaAdi(String markaAdi);
	
	Markalar getByMarkaAdiOrUrunId(String markaAdi,int urunId);
	
	List<Markalar> getByUrunIdIn(List<Integer> urunler);
	
	
	
}
