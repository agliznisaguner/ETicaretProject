package com.turktrust.eticaret.business.abstracts;

import java.util.List;

import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Musteriler;
import com.turktrust.eticaret.entities.dtos.GetUrunFromSepetDto;
import com.turktrust.eticaret.entities.dtos.UrunDetailsDto;

public interface MusteriService {

	DataResult<List<Musteriler>> getAll();

	Result add(Musteriler musteri);

	DataResult<Musteriler> findByEmail(String email);

	DataResult<List<UrunDetailsDto>> getUrunFromSepetByMusteri(GetUrunFromSepetDto sepetUrunGetDto);

}
