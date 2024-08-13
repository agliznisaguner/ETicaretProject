package com.turktrust.eticaret.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turktrust.eticaret.business.abstracts.FavoriService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Favoriler;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/api/favori")
public class FavoriController {
private FavoriService favoriService;
	
	@Autowired
	public FavoriController(FavoriService favoriService) {
		super();
		this.favoriService = favoriService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Favoriler>> getAll(){
		return this.favoriService.getAll();
		}
	
	@PostMapping("/add")
	public Result add (@RequestBody Favoriler favori) {
		return this.favoriService.add(favori);
		
	}

}
