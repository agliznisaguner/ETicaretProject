package com.turktrust.eticaret.business.abstracts;

import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.dtos.AddUrunToMusteriSepetDto;

public interface SepetUrunService {

	public Result addUrunToSepet(AddUrunToMusteriSepetDto musteriSepetUrunAddDto);
}
