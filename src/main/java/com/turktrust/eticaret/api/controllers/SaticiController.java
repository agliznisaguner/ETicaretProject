package com.turktrust.eticaret.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turktrust.eticaret.business.abstracts.SaticiService;
import com.turktrust.eticaret.core.utilities.results.DataResult;
import com.turktrust.eticaret.core.utilities.results.Result;
import com.turktrust.eticaret.entities.concretes.Saticilar;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/satici")
public class SaticiController {

	private SaticiService saticiService;
	
	@Autowired
	public SaticiController(SaticiService saticiService) {
		super();
		this.saticiService = saticiService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Saticilar>> getAll(){
		return this.saticiService.getAll();
		}
	@PostMapping("/add")
	public Result add (@RequestBody Saticilar satici) {
		return this.saticiService.add(satici);
		
	}
	@GetMapping("/getBySaticiAdi")
    public DataResult<Saticilar> getBySaticiFirmaAdi(@RequestParam String saticiFirmaAdi) {
        return this.saticiService.getBySaticiFirmaAdi(saticiFirmaAdi);
    }

	@GetMapping("/getAllByPage")
	public DataResult<List<Saticilar>> getAll(int pageNo, int pageSize) {
	    return this.saticiService.getAll(pageNo, pageSize);
	}
	@GetMapping("/getBySaticiFirmaAdiAndUrunId")
	public DataResult<Saticilar> getBySaticiFirmaAdiAndUrunId(@RequestParam("saticiFirmaAdi") String saticiFirmaAdi, @RequestParam("urunId") int urunId) {
	    return this.saticiService.getBySaticiFirmaAdiAndUrunId(saticiFirmaAdi, urunId);
	}

	@GetMapping("/getBySaticiFirmaAdiOrUrunId")
	public DataResult<Saticilar> getBySaticiFirmaAdiOrUrunId(@RequestParam("saticiFirmaAdi") String saticiFirmaAdi, @RequestParam("urunId") int urunId) {
	    return this.saticiService.getBySaticiFirmaAdiOrUrunId(saticiFirmaAdi, urunId);
	}


}
