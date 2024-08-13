package com.turktrust.eticaret.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turktrust.eticaret.business.abstracts.KategoriService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Kategori;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/kategori")
public class KategoriController {
	
private KategoriService kategoriService;
	
	@Autowired
	public KategoriController(KategoriService kategoriService) {
		super();
		this.kategoriService = kategoriService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Kategori>> getAll(){
		return this.kategoriService.getAll();
		}
	@PostMapping("/add")
	public Result add (@RequestBody Kategori kategori) {
		return this.kategoriService.add(kategori);
		
	}

}
