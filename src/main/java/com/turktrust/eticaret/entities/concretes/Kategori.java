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

	public Kategori(int id, String kategoriAdi) {
		super();
		this.id = id;
		Kategori_Adi = kategoriAdi;
	}

	public Kategori() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKategoriAdi() {
		return Kategori_Adi;
	}

	public void setKategoriAdi(String kategoriAdi) {
		Kategori_Adi = kategoriAdi;
	}
}
