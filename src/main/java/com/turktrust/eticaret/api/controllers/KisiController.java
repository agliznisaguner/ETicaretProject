package com.turktrust.eticaret.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turktrust.eticaret.business.abstracts.KisiService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Kisiler;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/kisiler")
public class KisiController  {

	private KisiService kisiService;
	
	@Autowired
	public KisiController(KisiService kisiService) {
		super();
		this.kisiService = kisiService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Kisiler>> getAll(){
		return this.kisiService.getAll();
		}
	@PostMapping("/add")
	public Result add (@RequestBody Kisiler kisi) {
		return this.kisiService.add(kisi);
		
	}


}
