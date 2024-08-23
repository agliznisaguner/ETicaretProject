package com.turktrust.eticaret.entities.dtos;

public class FiyatAddDto {

	private int fiyatId;
	private int urunId;
	private int urunFiyat;

	public int getFiyatId() {
		return fiyatId;
	}

	public void setFiyatId(int fiyatId) {
		this.fiyatId = fiyatId;
	}

	public int getUrunId() {
		return urunId;
	}

	public void setUrunId(int urunId) {
		this.urunId = urunId;
	}

	public int getUrunFiyat() {
		return urunFiyat;
	}

	public void setUrunFiyat(int urunFiyat) {
		this.urunFiyat = urunFiyat;
	}

	public FiyatAddDto(int fiyatId, int urunId, int urunFiyat) {
		super();
		this.fiyatId = fiyatId;
		this.urunId = urunId;
		this.urunFiyat = urunFiyat;
	}

	public FiyatAddDto() {
	}

}
