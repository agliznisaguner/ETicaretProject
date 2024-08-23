package com.turktrust.eticaret.business.abstracts;

import java.util.List;

import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Kisiler;
import com.turktrust.eticaret.entities.dtos.KisiGetDto;
import com.turktrust.eticaret.entities.dtos.KisiMusteriKayitDto;
import com.turktrust.eticaret.entities.dtos.KisiMusteriUpdateDto;

public interface KisiService {

	DataResult<List<Kisiler>> getAll();

	Result add(Kisiler kisi);

	Result addFromDto(KisiMusteriKayitDto dto);

	Result updateFromDto(int id, KisiMusteriUpdateDto dto);

	DataResult<List<KisiGetDto>> getAllKisiler();
}
