package com.turktrust.eticaret.entities.concretes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","urunler"})
public class Kategori {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="kategori_id",nullable = false)
	private int kategoriId;
	
	@Column(name="kategori_adi")
	private String kategoriAdi;
	
	@JsonIgnore
	@OneToMany(mappedBy = "kategori")
	private List<Urunler> urun;


	public Kategori(int kategoriId, String kategori_Adi, List<Urunler> urunlers) {
		super();
		this.kategoriId = kategoriId;
		this.kategoriAdi = kategori_Adi;
		this.urun = urunlers;
	}

	public Kategori() {}
	
	public int getId() {
		return kategoriId;
	}

	public void setId(int kategoriId) {
		this.kategoriId = kategoriId;
	}

	public void setKategori_Adi(String kategoriAdi) {
		this.kategoriAdi = kategoriAdi;
	}

	public String getKategori_Adi() {
		return kategoriAdi;
	}

	public List<Urunler> getUrunler() {
		return urun;
	}

	public void setUrunler(List<Urunler> urunler) {
		this.urun = urunler;
	}
}
