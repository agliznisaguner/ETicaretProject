package com.turktrust.eticaret.business.abstracts;

import java.util.List;

import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Kisiler;

public interface KisiService {


	DataResult<List<Kisiler>> getAll(); 
    Result add(Kisiler kisi);
}
