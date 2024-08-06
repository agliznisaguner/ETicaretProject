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
@Table(name="Adres")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Adres {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Musteri_Id")
	private int Musteri_Id;
	
	@Column(name="Adres")
	private String Adres;

	public Adres(int id, int musteriId, String adres) {
		super();
		this.id = id;
		Musteri_Id = musteriId;
		Adres = adres;
	}
	public Adres() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMusteriId() {
		return Musteri_Id;
	}

	public void setMusteriId(int musteriId) {
		Musteri_Id = musteriId;
	}

	public String getAdres() {
		return Adres;
	}

	public void setAdres(String adres) {
		Adres = adres;
	}

}
