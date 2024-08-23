package com.turktrust.eticaret.business.abstracts;

import java.util.List;

import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Saticilar;
import com.turktrust.eticaret.entities.dtos.RegisterSaticiDto;

public interface SaticiService {

	DataResult<List<Saticilar>> getAll();

	DataResult<List<Saticilar>> getAll(int pageNo, int pageSize);

	Result add(Saticilar satici);

	Result addFromDto(RegisterSaticiDto saticiKayitDto);

	DataResult<Saticilar> getById(int id);

	DataResult<Saticilar> getBySaticiFirmaAdi(String saticiFirmaAdi);

	DataResult<Saticilar> getBySaticiFirmaAdiAndUrunId(String saticiFirmaAdi, int urunId);

	DataResult<Saticilar> getBySaticiFirmaAdiOrUrunId(String saticiFirmaAdi, int urunId);

}
