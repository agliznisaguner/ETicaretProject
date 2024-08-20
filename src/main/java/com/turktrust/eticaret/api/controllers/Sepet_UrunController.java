package com.turktrust.eticaret.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.turktrust.eticaret.business.abstracts.Sepet_UrunService;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.dtos.MusteriSepetUrunAddDto;

@RestController
@RequestMapping("/api/Sepet_Urun")
public class Sepet_UrunController {
	
	private Sepet_UrunService sepet_UrunService;
	
	@Autowired
	public Sepet_UrunController(Sepet_UrunService sepet_UrunService) {
		this.sepet_UrunService = sepet_UrunService;
	}
	@PostMapping("/MusteriSepetUrunAdd")
	public Result MusteriSepetUrunAdd(@RequestBody MusteriSepetUrunAddDto musteriSepetUrunAddDto) {
		return sepet_UrunService.addUrunToSepet(musteriSepetUrunAddDto);
	}

}
