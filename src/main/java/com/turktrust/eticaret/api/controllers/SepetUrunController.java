package com.turktrust.eticaret.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.turktrust.eticaret.business.abstracts.SepetUrunService;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.dtos.AddUrunToMusteriSepetDto;

@RestController
@RequestMapping("/api/Sepet_Urun")
public class SepetUrunController {

	private SepetUrunService sepet_UrunService;

	@Autowired
	public SepetUrunController(SepetUrunService sepet_UrunService) {
		this.sepet_UrunService = sepet_UrunService;
	}

	@PostMapping("/MusteriSepetUrunAdd")
	public Result MusteriSepetUrunAdd(@RequestBody AddUrunToMusteriSepetDto musteriSepetUrunAddDto) {
		return sepet_UrunService.addUrunToSepet(musteriSepetUrunAddDto);
	}

}
