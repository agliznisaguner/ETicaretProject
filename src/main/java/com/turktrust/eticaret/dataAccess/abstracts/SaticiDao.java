package com.turktrust.eticaret.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import com.turktrust.eticaret.entities.concretes.Saticilar;

public interface SaticiDao extends JpaRepository<Saticilar, Integer>{
	 
		Saticilar getBySaticiFirmaAdi(String saticiAdi);
		
	    Saticilar getBySaticiFirmaAdiAndUrunId(String saticiFirmaAdi, int urunId);
	    
	    Saticilar getBySaticiFirmaAdiOrUrunId(String saticiFirmaAdi, int urunId);
	    
	    
	

}
