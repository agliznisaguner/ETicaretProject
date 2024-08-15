package com.turktrust.eticaret.business.abstracts;

import java.util.List;

import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Saticilar;

public interface SaticiService {

	DataResult<List<Saticilar>> getAll(); 
	DataResult<List<Saticilar>> getAll(int pageNo, int pageSize);
    Result add(Saticilar satici);
    
    DataResult<Saticilar> getBySaticiFirmaAdi(String saticiFirmaAdi);
	
    DataResult<Saticilar> getBySaticiFirmaAdiAndUrunId(String saticiFirmaAdi, int urunId);
    
    DataResult<Saticilar> getBySaticiFirmaAdiOrUrunId(String saticiFirmaAdi, int urunId);

    
}
