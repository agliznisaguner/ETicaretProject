package com.turktrust.eticaret.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Table(name="Urunler")
public class Urunler {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Satici_Id")
	private int Satici_Id;
	
	@Column(name="Stok_Sayisi")
	private int Stok_Sayisi;
	
	@Column(name="Marka_Id")
	private int Marka_Id;
	
	@Column(name="Kategori_Id")
	private int Kategori_Id;
	
	@Column(name="Kategori_Adi")
	private String Kategori_Adi;

	@Column(name="Urun_Adi")
	private String Urun_Adi;

	public Urunler(int id, int saticiId, int stokSayisi, int markaId, int kategoriId) {
		super();
		this.id = id;
		Satici_Id = saticiId;
		Stok_Sayisi = stokSayisi;
		Marka_Id = markaId;
		Kategori_Id = kategoriId;
	}
	public Urunler() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSaticiId() {
		return Satici_Id;
	}

	public void setSaticiId(int saticiId) {
		Satici_Id = saticiId;
	}

	public int getStokSayisi() {
		return Stok_Sayisi;
	}

	public void setStokSayisi(int stokSayisi) {
		Stok_Sayisi = stokSayisi;
	}

	public int getMarkaId() {
		return Marka_Id;
	}

	public void setMarkaId(int markaId) {
		Marka_Id = markaId;
	}

	public int getKategoriId() {
		return Kategori_Id;
	}

	public void setKategoriId(int kategoriId) {
		Kategori_Id = kategoriId;
	}
	public String getKategoriAdi() {
		return Kategori_Adi;
	}

	public void setKategoriAdi(String kategoriAdi) {
		Kategori_Adi = kategoriAdi;
	}

	public String getUrunAdi() {
		return Urun_Adi;
	}

	public void setUrunAdi(String urunAdi) {
		Urun_Adi = urunAdi;
	}

	


}
