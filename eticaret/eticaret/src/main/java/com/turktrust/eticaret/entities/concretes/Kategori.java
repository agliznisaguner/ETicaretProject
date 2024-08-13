package com.turktrust.eticaret.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 

@Entity
@Table(name="kategori")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Kategori {

	@Id
	@GeneratedValue
	@Column(name="kategori_id")
	private int kategoriId;
	
	@Column(name="kategori_adi")
	private String kategori_adi;
	
	@OneToMany(mappedBy = "kategori")
	private List<Urunler> urunler;


	public Kategori(int kategoriId, String kategori_Adi, List<Urunler> urunlers) {
		super();
		this.kategoriId = kategoriId;
		this.kategori_adi = kategori_Adi;
		this.urunler = urunlers;
	}

	public Kategori() {}
	
	public int getId() {
		return kategoriId;
	}

	public void setId(int kategoriId) {
		this.kategoriId = kategoriId;
	}

	public void setKategoriAdi(String kategoriAdi) {
		this.kategori_adi = kategoriAdi;
	}

	public String getKategori_Adi() {
		return kategori_adi;
	}

	public List<Urunler> getUrunler() {
		return urunler;
	}

	public void setUrunler(List<Urunler> urunler) {
		this.urunler = urunler;
	}
}
