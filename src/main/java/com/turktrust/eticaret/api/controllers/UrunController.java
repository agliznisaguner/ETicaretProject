package com.turktrust.eticaret.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turktrust.eticaret.business.abstracts.UrunService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Urunler;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/urunler")
public class UrunController {

	private UrunService urunService;
	
	@Autowired
	public UrunController(UrunService urunService) {
		super();
		this.urunService = urunService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Urunler>> getAll(){
		return this.urunService.getAll();
		}
	@PostMapping("/add")
	public Result add (@RequestBody Urunler urun) {
		return this.urunService.add(urun);
		
	}
	@GetMapping("/getByUrunAdi")
	public DataResult<Urunler> getByUrunAdi(@RequestParam String urunAdi){
		return this.urunService.getByUrunAdi(urunAdi);
	}
	@GetMapping("/getByUrunAdiAndKategoriId")
	public DataResult<Urunler>getByUrunAdiAndKategoriId(@RequestParam("urunAdi") String urunAdi, @RequestParam("kategoriId") int kategoriId){
		return this.urunService.getByUrunAdiAndKategoriId(urunAdi, kategoriId);
	}
	@GetMapping("/getByUrunAdiContains")
	public DataResult<List<Urunler>> getByUrunAdiContains(@RequestParam String urunAdi){
		return this.urunService.getByUrunAdiContains(urunAdi);
		
	}
	@GetMapping("/getAllByPage")
	DataResult<List<Urunler>> getAll(int pageNo, int pageSize){
		return this.urunService.getAll(pageNo, pageSize);
	}

}
