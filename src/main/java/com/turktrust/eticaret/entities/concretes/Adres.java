package com.turktrust.eticaret.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Adres")
public class Adres {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="Musteri_Id",referencedColumnName = "Id")
	private Musteriler musteri;
	
	@Column(name="Adres")
	private String Adres;

	public Adres(int id, Musteriler musteriId, String adres) {
		super();
		this.id = id;
		musteri = musteriId;
		Adres = adres;
	}
	public Adres() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Musteriler getMusteriId() {
		return musteri;
	}

	public void setMusteriId(Musteriler musteriId) {
		musteri = musteriId;
	}

	public String getAdres() {
		return Adres;
	}

	public void setAdres(String adres) {
		Adres = adres;
	}

}
