package com.turktrust.eticaret.api.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.turktrust.eticaret.business.abstracts.SepetService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Sepet;
import com.turktrust.eticaret.entities.dtos.SepetUrunGetDto;

@RestController
@RequestMapping("/api/sepet")
public class SepetController {

	private SepetService sepetService;

	@Autowired
	public SepetController(SepetService sepetService) {
		this.sepetService = sepetService;
	}

	@GetMapping("/getAll")
	public DataResult<List<Sepet>> getAll() {
		return this.sepetService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Sepet sepet) {
		return this.sepetService.add(sepet);
	}
}