package com.turktrust.eticaret.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turktrust.eticaret.business.abstracts.MusteriService;
import com.turktrust.eticaret.core.utilities.mapping.ModelMapperService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.core.utilities.results.SuccessDataResult;
import com.turktrust.eticaret.core.utilities.results.SuccessResult;
import com.turktrust.eticaret.dataAccess.abstracts.MusteriDao;
import com.turktrust.eticaret.entities.concretes.Musteriler;
import com.turktrust.eticaret.entities.concretes.Urunler;
import com.turktrust.eticaret.entities.dtos.GetUrunFromSepetDto;
import com.turktrust.eticaret.entities.dtos.UrunDetailsDto;

@Service
public class MusteriManager implements MusteriService {

	private MusteriDao musteriDao;
	private ModelMapperService modelMapperService;

	@Autowired
	public MusteriManager(MusteriDao musteriDao, ModelMapperService modelMapperService) {
		super();
		this.musteriDao = musteriDao;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public DataResult<List<Musteriler>> getAll() {
		return new SuccessDataResult<List<Musteriler>>(this.musteriDao.findAll(), "Data listelendi.");

	}

	@Override
	public Result add(Musteriler musteri) {
		this.musteriDao.save(musteri);
		return new SuccessResult("Musteri eklendi.");
	}

	@Override
	public DataResult<Musteriler> findByEmail(String email) {
		return new SuccessDataResult<Musteriler>(this.musteriDao.findByEmail(email), "Musteri listelendi.");
	}

	@Override
	public DataResult<List<UrunDetailsDto>> getUrunFromSepetByMusteri(GetUrunFromSepetDto sepetUrunGetDto) {

		return new SuccessDataResult<List<UrunDetailsDto>>(sepetUrunGetDto.getUrunler(), "Urunler Listelendi.");
	}
}
