package com.turktrust.eticaret.business.abstracts;

import java.util.List;

import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Kisiler;
import com.turktrust.eticaret.entities.dtos.GetKisiDto;
import com.turktrust.eticaret.entities.dtos.RegisterKisiDto;
import com.turktrust.eticaret.entities.dtos.UpdateKisiDto;

public interface KisiService {

	DataResult<List<Kisiler>> getAll();

	Result add(Kisiler kisi);

	Result addFromDto(RegisterKisiDto dto);

	Result updateFromDto(int id, UpdateKisiDto dto);

	DataResult<List<GetKisiDto>> getAllKisiler();
}
