package com.turktrust.eticaret.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.turktrust.eticaret.business.abstracts.UrunService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Urunler;
import com.turktrust.eticaret.entities.dtos.SaticiUrunKayitDto;
import com.turktrust.eticaret.entities.dtos.SaticiUrunUpdateDto;
import com.turktrust.eticaret.entities.dtos.UrunWithKategoriDto;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/urunler")
public class UrunController {

	private UrunService urunService;

	@Autowired
	public UrunController(UrunService urunService) {
		this.urunService = urunService;
	}

	@GetMapping("/getAll")
	public DataResult<List<Urunler>> getAll() {
		return this.urunService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Urunler urun) {
		return this.urunService.add(urun);

	}

	@GetMapping("/getByUrunAdi")
	public DataResult<Urunler> getByUrunAdi(@RequestParam String urunAdi) {
		return this.urunService.getByUrunAdi(urunAdi);
	}

	@GetMapping("/getByUrunAdiAndKategoriId")
	public DataResult<Urunler> getByUrunAdiAndKategoriId(@RequestParam("urunAdi") String urunAdi,
			@RequestParam("kategoriId") int kategoriId) {
		return this.urunService.getByUrunAdiAndKategoriId(urunAdi, kategoriId);
	}

	@GetMapping("/getByKategoriIdIn")
	public DataResult<List<Urunler>> getByKategoriIdIn(@RequestParam List<Integer> categories) {
		return this.urunService.getByKategoriIdIn(categories);
	}

	@GetMapping("/getByUrunAdiContains")
	public DataResult<List<Urunler>> getByUrunAdiContains(@RequestParam String urunAdi) {
		return this.urunService.getByUrunAdiContains(urunAdi);
	}

	@GetMapping("/getAllByPage")
	DataResult<List<Urunler>> getAll(int pageNo, int pageSize) {
		return this.urunService.getAll(pageNo, pageSize);
	}

	@GetMapping("/getByMarka_MarkaAdiIn")
	public DataResult<List<Urunler>> getByMarka_MarkaAdiIn(@RequestParam List<String> markaAdi) {
		return this.urunService.getByMarka_MarkaAdiIn(markaAdi);
	}

	@GetMapping("/getBySatici_SaticiFirmaAdiIn")
	public DataResult<List<Urunler>> getBySatici_SaticiFirmaAdiIn(@RequestParam List<String> saticiFirmaAdi) {
		return this.urunService.getBySatici_SaticiFirmaAdiIn(saticiFirmaAdi);
	}

	@GetMapping("/getUrunWithKategoriDetails")
	public DataResult<List<UrunWithKategoriDto>> getUrunWithKategoriDetails() {
		return this.urunService.getUrunWithKategoriDetails();
	}

	@PostMapping("/addUrunForSatici")
	public Result addUrunForSatici(@RequestBody SaticiUrunKayitDto saticiUrunKayitDto) {
		return this.urunService.addUrunForSatici(saticiUrunKayitDto);
	}

	@PutMapping("/updateUrunForSatici")
	public Result saticiUrunUpdate(@RequestBody SaticiUrunUpdateDto saticiUrunUpdateDto, int saticiId, int urunId) {
		return this.urunService.saticiUrunUpdate(saticiUrunUpdateDto, saticiId, urunId);
	}

}
