package com.turktrust.eticaret.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.turktrust.eticaret.business.abstracts.MusteriService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.entities.concretes.Musteriler;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/musteri")
public class MusteriController {

	private MusteriService musteriService;

	@Autowired
	public MusteriController(MusteriService musteriService) {
		this.musteriService = musteriService;
	}

	@GetMapping("/getAll")
	public DataResult<List<Musteriler>> getAll() {
		return this.musteriService.getAll();
	}

	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody Musteriler musteriler) {
		return ResponseEntity.ok(this.musteriService.add(musteriler));

	}

}
