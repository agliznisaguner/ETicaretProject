package com.turktrust.eticaret.entities.concretes;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="Musteriler")
public class Musteriler{
	
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Musteri_No")
	private int Musteri_No;
	
	@OneToMany
	private List<Adres> adresler;
	
	@OneToMany
	private List<Siparisler> siparisler;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Sepet_Id")
	private Sepet sepet;
	
	public Musteriler(int id, int musteri_No, List<Adres> adresler, List<Siparisler> siparisler, Sepet sepet) {
		super();
		this.id = id;
		Musteri_No = musteri_No;
		this.adresler = adresler;
		this.siparisler = siparisler;
		this.sepet = sepet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMusteriNo() {
		return Musteri_No;
	}

	public void setMusteriNo(int musteriNo) {
		Musteri_No = musteriNo;
	}

	public int getMusteri_No() {
		return Musteri_No;
	}

	public void setMusteri_No(int musteri_No) {
		Musteri_No = musteri_No;
	}

	public List<Adres> getAdresler() {
		return adresler;
	}

	public void setAdresler(List<Adres> adresler) {
		this.adresler = adresler;
	}

	public List<Siparisler> getSiparisler() {
		return siparisler;
	}

	public void setSiparisler(List<Siparisler> siparisler) {
		this.siparisler = siparisler;
	}

	public Sepet getSepet() {
		return sepet;
	}

	public void setSepet(Sepet sepet) {
		this.sepet = sepet;
	}


}
