package com.turktrust.eticaret.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turktrust.eticaret.business.abstracts.KisiService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Kisiler;
import com.turktrust.eticaret.entities.dtos.GetKisiDto;
import com.turktrust.eticaret.entities.dtos.RegisterKisiDto;
import com.turktrust.eticaret.entities.dtos.UpdateKisiDto;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/kisi")
public class KisiController {

	private KisiService kisiService;

	@Autowired
	public KisiController(KisiService kisiService) {
		this.kisiService = kisiService;
	}

	@GetMapping("/getAll")
	public DataResult<List<Kisiler>> getAll() {
		return this.kisiService.getAll();
	}

	@PostMapping("/add")
	public ResponseEntity<String> addKisi(@RequestBody RegisterKisiDto dto) {
		Result result = kisiService.addFromDto(dto);
		if (result.isSuccess()) {
			return ResponseEntity.ok(result.getMessage());
		}
		return ResponseEntity.badRequest().body(result.getMessage());
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateKisi(@PathVariable int id, @RequestBody UpdateKisiDto dto) {
		Result result = kisiService.updateFromDto(id, dto);
		if (result.isSuccess()) {
			return ResponseEntity.ok(result.getMessage());
		}
		return ResponseEntity.badRequest().body(result.getMessage());
	}

	@GetMapping("/getKisi")
	public ResponseEntity<DataResult<List<GetKisiDto>>> getAllKisiler() {
		DataResult<List<GetKisiDto>> result = kisiService.getAllKisiler();
		if (result.isSuccess()) {
			return ResponseEntity.ok(result);
		}
		return ResponseEntity.badRequest().body(result);
	}

}
