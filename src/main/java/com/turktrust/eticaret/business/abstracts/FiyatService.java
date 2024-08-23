package com.turktrust.eticaret.business.abstracts;

import java.util.List;

import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Fiyat;
import com.turktrust.eticaret.entities.dtos.AddFiyatDto;

public interface FiyatService {

	DataResult<List<Fiyat>> getAll();

	Result addFromFiyatAddDto(AddFiyatDto fiyatAddDto);

}
