package com.turktrust.eticaret.entities.dtos;

public class GetKisiDto {

	private String ad;
	private String soyad;
	private String email;

	public GetKisiDto(String ad, String soyad, String email) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.email = email;
	}

	public GetKisiDto() {
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
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
