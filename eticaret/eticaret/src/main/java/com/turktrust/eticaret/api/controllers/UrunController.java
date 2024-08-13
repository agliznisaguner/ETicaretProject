package com.turktrust.eticaret.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turktrust.eticaret.business.abstracts.UrunService;
import com.turktrust.eticaret.entities.concretes.Urunler;


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
	public List<Urunler> getAll(){
		return this.urunService.getAll();
		}
	
	

}
