package com.turktrust.eticaret.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.turktrust.eticaret.business.abstracts.UrunService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.core.utilities.results.SuccessDataResult;
import com.turktrust.eticaret.core.utilities.results.SuccessResult;
import com.turktrust.eticaret.dataAccess.abstracts.UrunDao;
import com.turktrust.eticaret.entities.concretes.Urunler;
import com.turktrust.eticaret.entities.dtos.UrunWithKategoriDto;

@Service
public class UrunManager implements UrunService {

	private UrunDao urunDao;
	@Autowired
	public UrunManager(UrunDao urunDao) {
		super();
		this.urunDao = urunDao;
	}
	@Override
	public DataResult<List<Urunler>> getAll() {
		return new SuccessDataResult<List<Urunler>>(this.urunDao.findAll(),"Data listelendi.");
		
	}
	@Override
	public Result add(Urunler urun) {
		this.urunDao.save(urun);
		return new SuccessResult("Ürün eklendi.");
	}

	@Override
	public DataResult<Urunler> getByUrunAdi(String urunAdi) {
		return new SuccessDataResult<Urunler>(this.urunDao.getByUrunAdi(urunAdi),"Data listelendi.");
	}

	@Override
	public DataResult<Urunler> getByUrunAdiAndKategoriId(String urunAdi, int kategoriId) {
		return new SuccessDataResult<Urunler>(this.urunDao.getByUrunAdiAndKategoriId(urunAdi,kategoriId),"Data listelendi.");
	}

	@Override
	public DataResult<List<Urunler>> getByUrunAdiOrKategoriId(String urunAdi, int kategoriId) {
		return new SuccessDataResult<List<Urunler>>(this.urunDao.getByUrunAdiOrKategoriId(urunAdi, kategoriId),"Data listelendi.");
	}

	@Override
	public DataResult<List<Urunler>> getByKategoriIdIn(List<Integer> categories) {
		return new SuccessDataResult<List<Urunler>>(this.urunDao.getByKategoriIdIn(categories),"Data listelendi.");
	}

	@Override
	public DataResult<List<Urunler>> getByUrunAdiContains(String urunAdi) {
		return new SuccessDataResult<List<Urunler>>(this.urunDao.getByUrunAdiContains(urunAdi),"Data listelendi.");
	}

	@Override
	public DataResult<List<Urunler>> getByUrunAdiStartsWith(String urunAdi) {
		return new SuccessDataResult<List<Urunler>>(this.urunDao.getByUrunAdiStartsWith(urunAdi),"Data listelendi.");
	}
	@Override
	public DataResult<List<Urunler>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		return new SuccessDataResult<List<Urunler>>(this.urunDao.findAll(pageable).getContent());
	}
	@Override
	public DataResult<List<Urunler>> getByMarka_MarkaAdiIn(List<String> markaAdi) {
		
		return new SuccessDataResult<List<Urunler>>(this.urunDao.getByMarka_MarkaAdiIn(markaAdi),"Data listelendi.");
	}
	@Override
	public DataResult<List<Urunler>> getBySatici_SaticiFirmaAdiIn(List<String> saticiFirmaAdi) {
	    return new SuccessDataResult<List<Urunler>>(this.urunDao.getBySatici_SaticiFirmaAdiIn(saticiFirmaAdi), "Data listelendi.");
	}
	@Override
	public DataResult<List<UrunWithKategoriDto>> getUrunWithKategoriDetails() {
		return new SuccessDataResult<List<UrunWithKategoriDto>>(this.urunDao.getUrunWithKategoriDetails(),"Data listelendi");
	}


	//@Override
	//public DataResult<List<Urunler>> GetByNameAndCategory(String urun_adi, int kategori_id) {
		//return new SuccessDataResult<List<Urunler>>(this.urunDao.GetByUrun_adiAndKategori(urun_adi,kategori_id),"Data listelendi.");
	//}
}
