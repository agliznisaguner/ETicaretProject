package com.turktrust.eticaret.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "adres")
public class Adres {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "adres_id", nullable = false)
	private int adresId;

	@ManyToOne
	@JoinColumn(name = "musteri_id", referencedColumnName = "musteri_id")
	private Musteriler musteri;

	@Column(name = "adres")
	private String adres;

	public Adres(int id, Musteriler musteriId, String adres) {
		super();
		this.adresId = id;
		this.musteri = musteriId;
		this.adres = adres;
	}

	public Adres() {
	}

	public int getId() {
		return adresId;
	}

	public void setId(int id) {
		this.adresId = id;
	}

	public Musteriler getMusteriId() {
		return musteri;
	}

	public void setMusteriId(Musteriler musteriId) {
		musteri = musteriId;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

}
