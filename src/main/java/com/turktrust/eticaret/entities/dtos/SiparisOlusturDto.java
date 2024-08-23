package com.turktrust.eticaret.entities.dtos;

public class SiparisOlusturDto {
	
	private int MusteriId;

	public SiparisOlusturDto(int musteriId) {
		super();
		MusteriId = musteriId;
	}

	public SiparisOlusturDto() {
	}

	public int getMusteriId() {
		return MusteriId;
	}

	public void setMusteriId(int musteriId) {
		MusteriId = musteriId;
	}

}
