package com.turktrust.eticaret.entities.dtos;

public class UpdateKisiDto {

	private String soyad;
	private String email;

	public UpdateKisiDto(String soyad, String email) {
		super();
		this.soyad = soyad;
		this.email = email;
	}

	public UpdateKisiDto() {
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
