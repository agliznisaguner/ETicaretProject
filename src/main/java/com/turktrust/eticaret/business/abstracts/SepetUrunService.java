package com.turktrust.eticaret.business.abstracts;

import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.dtos.MusteriSepetUrunAddDto;

public interface SepetUrunService {

	public Result addUrunToSepet(MusteriSepetUrunAddDto musteriSepetUrunAddDto);
}
