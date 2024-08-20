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
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
	private int musteriId;
	
	@Column(name="musteri_no")
	private int musteriNo;
	
	@OneToMany(mappedBy = "musteri")
	private List<Adres> adres;
	
	@OneToMany(mappedBy = "musteri")
	private List<Siparisler> siparis;
	
	@OneToMany(mappedBy = "musteri")
	private List<Sepet> sepet;
	
	@OneToMany(mappedBy= "musteri")
	private List<Favoriler> favori;
	
	@Column(name = "email", unique = true, nullable = false)
	@Email
	@NotBlank
	@NotNull
	private String email;
	
	@Column(name = "password", nullable = false)
	@NotBlank
	@NotNull
	private String password;
	

	public Musteriler(int musteriId, int musteriNo, List<Adres> adres, List<Siparisler> siparis, List<Sepet> sepet,
			List<Favoriler> favori, String email, String password) {
		super();
		this.musteriId = musteriId;
		this.musteriNo = musteriNo;
		this.adres = adres;
		this.siparis = siparis;
		this.sepet = sepet;
		this.favori = favori;
		this.email = email;
		this.password = password;
	}
	public Musteriler() {}

	public int getId() {
		return musteriId;
	}

	public void setId(int id) {
		this.musteriId = id;
	}

	public int getMusteri_No() {
		return musteriNo;
	}

	public void setMusteri_No(int musteri_No) {
		this.musteriNo = musteri_No;
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

	public List<Siparisler> getSiparis() {
		return siparis;
	}

	public void setSiparis(List<Siparisler> siparis) {
		this.siparis = siparis;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	


}
