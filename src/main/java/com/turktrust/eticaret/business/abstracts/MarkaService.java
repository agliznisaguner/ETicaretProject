package com.turktrust.eticaret.business.abstracts;

import java.util.List;

import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Markalar;

public interface MarkaService {


	DataResult<List<Markalar>> getAll(); 
    Result add(Markalar marka);
    
    DataResult<Markalar> getByMarkaAdi(String markaAdi);
    
    DataResult<Markalar> getByMarkaAdiOrUrunId(String markaAdi, int urunAdi);
    
    DataResult<List<Markalar>> getByUrunIdIn(List<Integer> urunler);
}
