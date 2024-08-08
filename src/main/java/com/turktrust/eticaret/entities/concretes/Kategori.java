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
@Table(name="Kategoriler")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Kategori {

	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Kategori_Adi")
	private String Kategori_Adi;
	
	@OneToMany
	private List<Urunler> urunler;


	public Kategori(int id, String kategori_Adi, List<Urunler> urunler) {
		super();
		this.id = id;
		Kategori_Adi = kategori_Adi;
		this.urunler = urunler;
	}

	public Kategori() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setKategoriAdi(String kategoriAdi) {
		Kategori_Adi = kategoriAdi;
	}

	public String getKategori_Adi() {
		return Kategori_Adi;
	}

	public List<Urunler> getUrunler() {
		return urunler;
	}

	public void setUrunler(List<Urunler> urunler) {
		this.urunler = urunler;
	}
}
