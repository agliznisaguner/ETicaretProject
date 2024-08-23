package com.turktrust.eticaret.entities.dtos;

public class SaticiUrunUpdateDto {

	private int saticiId;
	private int fiyat;
	private int stokSayisi;

	public SaticiUrunUpdateDto(int fiyat, int stokSayisi, int saticiId) {
		super();
		this.fiyat = fiyat;
		this.stokSayisi = stokSayisi;
		this.saticiId = saticiId;
	}

	public SaticiUrunUpdateDto() {
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	public int getStokSayisi() {
		return stokSayisi;
	}

	public void setStokSayisi(int stokSayisi) {
		this.stokSayisi = stokSayisi;
	}

	public int getSaticiId() {
		return saticiId;
	}

	public void setSaticiId(int saticiId) {
		this.saticiId = saticiId;
	}

}
