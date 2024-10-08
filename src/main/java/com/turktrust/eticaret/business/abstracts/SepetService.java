package com.turktrust.eticaret.business.abstracts;

import java.util.List;

import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Sepet;
import com.turktrust.eticaret.entities.dtos.GetUrunFromSepetDto;

public interface SepetService {
	DataResult<List<Sepet>> getAll();

	Result add(Sepet sepet);

	public GetUrunFromSepetDto getSepetUrunler(int sepetId);

}
