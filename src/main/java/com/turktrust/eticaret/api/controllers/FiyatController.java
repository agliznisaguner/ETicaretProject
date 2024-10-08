package com.turktrust.eticaret.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turktrust.eticaret.business.abstracts.FiyatService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Fiyat;
import com.turktrust.eticaret.entities.dtos.AddFiyatDto;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/fiyat")
public class FiyatController {

	private FiyatService fiyatService;

	@Autowired
	public FiyatController(FiyatService fiyatService) {

		this.fiyatService = fiyatService;
	}

	@GetMapping("/getAll")
	public DataResult<List<Fiyat>> getAll() {
		return this.fiyatService.getAll();
	}

	@PostMapping("/add")
	public Result addFromFiyatAddDto(@RequestBody AddFiyatDto fiyatAddDto) {
		Result result = fiyatService.addFromFiyatAddDto(fiyatAddDto);
		return result;
	}

}
