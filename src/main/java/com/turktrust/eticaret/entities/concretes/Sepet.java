package com.turktrust.eticaret.entities.concretes;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 

@Entity
@Table(name="Sepet")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sepet {
	
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@OneToMany
	private List<Urunler> urunler;
	
	//bi-directional mapping
	@OneToOne
	private Musteriler musteri;

	public Sepet() {}

	public Sepet(int id, List<Urunler> urunler, Musteriler musteri) {
		super();
		this.id = id;
		this.urunler = urunler;
		this.musteri = musteri;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Urunler> getUrunler() {
		return urunler;
	}

	public void setUrunler(List<Urunler> urunler) {
		this.urunler = urunler;
	}

	public Musteriler getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteriler musteri) {
		this.musteri = musteri;
	}
	
	
}
