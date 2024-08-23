package com.turktrust.eticaret.entities.dtos;

//data transfer object
public class GetUrunWithKategoriDto {

	private int id;
	private String urunAdi;
	private String kategoriAdi;

	public GetUrunWithKategoriDto(int id, String urunAdi, String kategoriAdi) {
		super();
		this.id = id;
		this.urunAdi = urunAdi;
		this.kategoriAdi = kategoriAdi;
	}

	public GetUrunWithKategoriDto() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrunAdi() {
		return urunAdi;
	}

	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}

	public String getKategoriAdi() {
		return kategoriAdi;
	}

	public void setKategoriAdi(String kategoriAdi) {
		this.kategoriAdi = kategoriAdi;
	}

}
