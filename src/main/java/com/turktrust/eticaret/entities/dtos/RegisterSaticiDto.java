package com.turktrust.eticaret.entities.dtos;

public class RegisterSaticiDto {

	private String saticiFirmaAdi;

	public RegisterSaticiDto(String saticiFirmaAdi) {
		super();
		this.saticiFirmaAdi = saticiFirmaAdi;
	}

	public RegisterSaticiDto() {
	}

	public String getSaticiFirmaAdi() {
		return saticiFirmaAdi;
	}

	public void setSaticiFirmaAdi(String saticiFirmaAdi) {
		this.saticiFirmaAdi = saticiFirmaAdi;
	}

}
