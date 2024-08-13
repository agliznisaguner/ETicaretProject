package com.turktrust.eticaret.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="kategori_id",nullable = false)
	private int kategori_id;
	
	@Column(name="kategori_adi")
	private String kategori_adi;
	
	@OneToMany(mappedBy = "kategori")
	private List<Urunler> urun;


	public Kategori(int kategoriId, String kategori_Adi, List<Urunler> urunlers) {
		super();
		this.kategori_id = kategoriId;
		this.kategori_adi = kategori_Adi;
		this.urun = urunlers;
	}

	public Kategori() {}
	
	public int getId() {
		return kategori_id;
	}

	public void setId(int kategoriId) {
		this.kategori_id = kategoriId;
	}

	public void setKategori_Adi(String kategoriAdi) {
		this.kategori_adi = kategoriAdi;
	}

	public String getKategori_Adi() {
		return kategori_adi;
	}

	public List<Urunler> getUrunler() {
		return urun;
	}

	public void setUrunler(List<Urunler> urunler) {
		this.urun = urunler;
	}
}
