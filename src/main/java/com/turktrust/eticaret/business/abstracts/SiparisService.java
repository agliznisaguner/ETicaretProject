package com.turktrust.eticaret.business.abstracts;
import java.util.List;

import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Siparisler;
import com.turktrust.eticaret.entities.dtos.SiparisOlusturDto;

public interface SiparisService {
	
	DataResult<List<Siparisler>> getAll();
	Result add(Siparisler siparis);
	Result siparisOlustur(SiparisOlusturDto siparisOlusturDto);
}