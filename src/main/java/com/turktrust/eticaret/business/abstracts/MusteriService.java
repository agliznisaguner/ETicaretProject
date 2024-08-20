package com.turktrust.eticaret.business.abstracts;

import java.util.List;

import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Musteriler;
import com.turktrust.eticaret.entities.concretes.Urunler;
import com.turktrust.eticaret.entities.dtos.SepetUrunGetDto;
import com.turktrust.eticaret.entities.dtos.UrunDetayDto;

public interface MusteriService {
	
	DataResult<List<Musteriler>> getAll(); 
    Result add(Musteriler musteri);
    DataResult<Musteriler> findByEmail(String email);
    DataResult<List<UrunDetayDto>> getUrunFromSepetByMusteri(SepetUrunGetDto sepetUrunGetDto);
    

}
