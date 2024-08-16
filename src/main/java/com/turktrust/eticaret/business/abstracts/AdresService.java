package com.turktrust.eticaret.business.abstracts;

import java.util.List;

import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Adres;

public interface AdresService {
	
	DataResult<List<Adres>> getAll(); 
    Result add(Adres adres);
    Result delete(Adres adres);
    Result update(Adres adres);

}
