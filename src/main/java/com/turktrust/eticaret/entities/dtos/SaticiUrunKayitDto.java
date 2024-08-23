package com.turktrust.eticaret.entities.dtos;

public class SaticiUrunKayitDto {

	private String urunAdi;
	private int stokSayisi;
	private int saticiId;
	private int markaId;
	private int kategoriId;
	private int fiyatId;

	public SaticiUrunKayitDto(String urunAdi, int stokSayisi, int saticiId, int markaId, int kategoriId, int fiyat) {
		super();
		this.urunAdi = urunAdi;
		this.stokSayisi = stokSayisi;
		this.saticiId = saticiId;
		this.markaId = markaId;
		this.kategoriId = kategoriId;
		this.fiyatId = fiyat;
	}

	public SaticiUrunKayitDto() {
	}

	public String getUrunAdi() {
		return urunAdi;
	}

	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
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

	public int getMarkaId() {
		return markaId;
	}

	public void setMarkaId(int markaId) {
		this.markaId = markaId;
	}

	public int getKategoriId() {
		return kategoriId;
	}

	public void setKategoriId(int kategoriId) {
		this.kategoriId = kategoriId;
	}

	public int getFiyatId() {
		return fiyatId;
	}

	public void setFiyatId(int fiyatId) {
		this.fiyatId = fiyatId;
	}

}
