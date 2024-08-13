package com.turktrust.eticaret.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turktrust.eticaret.business.abstracts.MarkaService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Markalar;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/marka")
public class MarkaController {
	

	private MarkaService markaService;
	
	@Autowired
	public MarkaController(MarkaService markaService) {
		super();
		this.markaService = markaService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Markalar>> getAll(){
		return this.markaService.getAll();
		}
	
	@PostMapping("/add")
	public Result add (@RequestBody Markalar marka) {
		return this.markaService.add(marka);
		
	}

}
