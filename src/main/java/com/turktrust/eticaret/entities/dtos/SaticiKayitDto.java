package com.turktrust.eticaret.entities.dtos;

public class SaticiKayitDto {
	  private String saticiFirmaAdi;

	public SaticiKayitDto(String saticiFirmaAdi) {
		super();
		this.saticiFirmaAdi = saticiFirmaAdi;
	}
	public SaticiKayitDto() {}
	public String getSaticiFirmaAdi() {
		return saticiFirmaAdi;
	}
	public void setSaticiFirmaAdi(String saticiFirmaAdi) {
		this.saticiFirmaAdi = saticiFirmaAdi;
	}

}
