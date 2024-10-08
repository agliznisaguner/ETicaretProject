package com.turktrust.eticaret.business.abstracts;

import java.util.List;

import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Urunler;
import com.turktrust.eticaret.entities.dtos.RegisterUrunFromSaticiDto;
import com.turktrust.eticaret.entities.dtos.UpdateUrunFromSaticiDto;
import com.turktrust.eticaret.entities.dtos.GetUrunWithKategoriDto;

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

	DataResult<List<GetUrunWithKategoriDto>> getUrunWithKategori();

	Result addUrunForSatici(RegisterUrunFromSaticiDto saticiUrunKayitDto);

	Result saticiUrunUpdate(UpdateUrunFromSaticiDto saticiUrunUpdateDto, int saticiId, int urunId);


}
