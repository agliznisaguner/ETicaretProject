package com.turktrust.eticaret.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turktrust.eticaret.business.abstracts.AdresService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Adres;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/adres")
public class AdresController {
private AdresService adresService;
	
	@Autowired
	public AdresController(AdresService urunService) {
		super();
		this.adresService = urunService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Adres>> getAll(){
		return this.adresService.getAll();
		}
	@PostMapping("/add")
	public Result add (@RequestBody Adres adres) {
		return this.adresService.add(adres);
		
	}
	@PutMapping("/update")
	public Result update(@RequestBody Adres adres) {
		return this.adresService.update(adres);
	}
	@DeleteMapping("/delete")
	public Result delete(@RequestBody Adres adres) {
		return this.adresService.delete(adres);
	}

}
