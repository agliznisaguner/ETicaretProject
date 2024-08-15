package com.turktrust.eticaret.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.turktrust.eticaret.business.abstracts.SaticiService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.core.utilities.results.SuccessDataResult;
import com.turktrust.eticaret.core.utilities.results.SuccessResult;
import com.turktrust.eticaret.dataAccess.abstracts.SaticiDao;
import com.turktrust.eticaret.entities.concretes.Saticilar;

@Service
public class SaticiManager implements SaticiService{

	private SaticiDao saticiDao;
	@Autowired
	public SaticiManager(SaticiDao saticiDao) {
		super();
		this.saticiDao = saticiDao;
	}

	@Override
	public DataResult<List<Saticilar>> getAll() {
		return new SuccessDataResult<List<Saticilar>>(this.saticiDao.findAll(),"Data listelendi.");
		
	}

	@Override
	public Result add(Saticilar satici) {
		this.saticiDao.save(satici);
		return new SuccessResult("Satıcı eklendi.");
	}

	@Override
    public DataResult<Saticilar> getBySaticiFirmaAdi(String saticiFirmaAdi) {
        return new SuccessDataResult<Saticilar>(this.saticiDao.getBySaticiFirmaAdi(saticiFirmaAdi), "Data listelendi.");
    }


    @Override
    public DataResult<List<Saticilar>> getAll(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo-1, pageSize);
        return new SuccessDataResult<List<Saticilar>>(this.saticiDao.findAll(pageable).getContent());
    }

	@Override
	public DataResult<Saticilar> getBySaticiFirmaAdiAndUrunId(String saticiFirmaAdi, int urunId) {
		return new SuccessDataResult<Saticilar>(this.saticiDao.getBySaticiFirmaAdiAndUrunId(saticiFirmaAdi, urunId), "Data listelendi.");
	}

	@Override
	public DataResult<Saticilar> getBySaticiFirmaAdiOrUrunId(String saticiFirmaAdi, int urunId) {
		return new SuccessDataResult<Saticilar>(this.saticiDao.getBySaticiFirmaAdiOrUrunId(saticiFirmaAdi, urunId), "Data listelendi.");
	}


}
