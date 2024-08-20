package com.turktrust.eticaret.entities.dtos;

public class SiparisOlusturDto {
	private int MusteriId;
	private int AdresId;
	
	public SiparisOlusturDto(int musteriId, int adres) {
		super();
		MusteriId = musteriId;
		AdresId = adres;
	}

	public int getMusteriId() {
		return MusteriId;
	}

	public void setMusteriId(int musteriId) {
		MusteriId = musteriId;
	}

	public int getAdres() {
		return AdresId;
	}

	public void setAdres(int adres) {
		AdresId = adres;
	}
	
	
	

}
