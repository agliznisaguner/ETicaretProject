package com.turktrust.eticaret.business.abstracts;

import java.util.List;

import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Fiyat;

public interface FiyatService {

	DataResult<List<Fiyat>> getAll(); 
    Result add(Fiyat fiyat);

}
