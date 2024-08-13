package com.turktrust.eticaret.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="musteri_id",nullable = false)
	private int musteri_id;
	
	@Column(name="musteri_no")
	private int musteri_no;
	
	@OneToMany(mappedBy = "musteri")
	private List<Adres> adres;
	
	@OneToMany(mappedBy = "musteri")
	private List<Siparisler> siparis;
	
	@OneToMany(mappedBy = "musteri")
	private List<Sepet> sepet;
	
	@OneToMany(mappedBy= "musteri")
	private List<Favoriler> favori;
	
	public Musteriler(int id, int musteri_No, List<Adres> adresler, List<Siparisler> siparisler, List<Sepet> sepetler) {
		super();
		this.musteri_id = id;
		this.musteri_no = musteri_No;
		this.adres = adresler;
		this.siparis = siparisler;
		this.sepet = sepetler;
	}

	public int getId() {
		return musteri_id;
	}

	public void setId(int id) {
		this.musteri_id = id;
	}

	public int getMusteri_No() {
		return musteri_no;
	}

	public void setMusteri_No(int musteri_No) {
		this.musteri_no = musteri_No;
	}

	public List<Adres> getAdresler() {
		return adres;
	}

	public void setAdresler(List<Adres> adresler) {
		this.adres = adresler;
	}

	public List<Siparisler> getSiparisler() {
		return siparis;
	}

	public void setSiparisler(List<Siparisler> siparisler) {
		this.siparis = siparisler;
	}

	public List<Sepet> getSepet() {
		return sepet;
	}

	public void setSepet(List<Sepet> sepetler) {
		this.sepet = sepetler;
	}


}
