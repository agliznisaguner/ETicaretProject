package com.turktrust.eticaret.business.abstracts;

import java.util.List;

import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Urunler;
import com.turktrust.eticaret.entities.dtos.SaticiUrunKayitDto;
import com.turktrust.eticaret.entities.dtos.SaticiUrunUpdateDto;
import com.turktrust.eticaret.entities.dtos.UrunWithKategoriDto;

public interface UrunService {
	
	DataResult<List<Urunler>> getAll(); 
	DataResult<List<Urunler>> getAll(int pageNo, int pageSize); 
    Result add(Urunler urun);
    DataResult<Urunler> getById(int id);
    
    DataResult<Urunler> getByUrunAdi(String urunAdi);
	
    DataResult<Urunler> getByUrunAdiAndKategoriId(String urunAdi, int kategoriId);
	
    DataResult<List<Urunler>> getByUrunAdiOrKategoriId(String urunAdi, int kategoriId);
	
    DataResult<List<Urunler>> getByKategoriIdIn(List<Integer> categories);
	
    DataResult<List<Urunler>> getByUrunAdiContains(String urunAdi);
	
    DataResult<List<Urunler>> getByUrunAdiStartsWith(String urunAdi);
    
    DataResult<List<Urunler>> getByMarka_MarkaAdiIn(List<String> markaAdi);
    
    DataResult<List<Urunler>> getBySatici_SaticiFirmaAdiIn(List<String> saticiFirmaAdi);

    DataResult<List<UrunWithKategoriDto>> getUrunWithKategoriDetails();
	
    Result addUrunForSatici(SaticiUrunKayitDto saticiUrunKayitDto);
    
    Result saticiUrunUpdate(SaticiUrunUpdateDto saticiUrunUpdateDto,int saticiId, int urunId);
    //DataResult<List<Urunler>> GetByNameAndCategory(String urun_adi, int kategori_id);

}
