package com.turktrust.eticaret.business.abstracts;

import java.util.List;

import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Kategori;
import com.turktrust.eticaret.entities.concretes.Urunler;

public interface UrunService {
	
	DataResult<List<Urunler>> getAll(); 
	DataResult<List<Urunler>> getAll(int pageNo, int pageSize); 
    Result add(Urunler urun);
    
    DataResult<Urunler> getByUrunAdi(String urunAdi);
	
    DataResult<Urunler> getByUrunAdiAndKategoriId(String urunAdi, int kategoriId);
	
    DataResult<List<Urunler>> getByUrunAdiOrKategoriId(String urunAdi, int kategoriId);
	
    DataResult<List<Urunler>> getByKategoriIdIn(List<Integer> categories);
	
    DataResult<List<Urunler>> getByUrunAdiContains(String urunAdi);
	
    DataResult<List<Urunler>> getByUrunAdiStartsWith(String urunAdi);
	
    //DataResult<List<Urunler>> GetByNameAndCategory(String urun_adi, int kategori_id);

}
