package com.turktrust.eticaret.api.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.turktrust.eticaret.business.abstracts.SiparisService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Siparisler;

@RestController
@RequestMapping("/api/siparis")
public class SiparisController {

	private SiparisService siparisService;

	@Autowired
	public SiparisController(SiparisService siparisService) {
		this.siparisService = siparisService;
	}

	@GetMapping("/getAll")
	public DataResult<List<Siparisler>> getAll() {
		return this.siparisService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Siparisler siparis) {
		return this.siparisService.add(siparis);
	}
}
