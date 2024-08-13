package com.turktrust.eticaret.business.abstracts;

import java.util.List;

import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Markalar;

public interface MarkaService {


	DataResult<List<Markalar>> getAll(); 
    Result add(Markalar marka);
}
