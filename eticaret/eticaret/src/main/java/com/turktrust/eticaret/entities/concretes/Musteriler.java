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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="musteriler")
public class Musteriler{
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="musteri_no")
	private int musteri_no;
	
	@OneToMany(mappedBy = "musteri")
	private List<Adres> adresler;
	
	@OneToMany(mappedBy = "musteri")
	private List<Siparisler> siparisler;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sepet_id",insertable = false,updatable = false)
	private Sepet sepet;
	
	public Musteriler(int id, int musteri_No, List<Adres> adresler, List<Siparisler> siparisler, Sepet sepet) {
		super();
		this.id = id;
		this.musteri_no = musteri_No;
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

	public int getMusteri_No() {
		return musteri_no;
	}

	public void setMusteri_No(int musteri_No) {
		this.musteri_no = musteri_No;
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
