package com.turktrust.eticaret.entities.concretes;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 

@Entity
@Table(name="sepet")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sepet {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="urunler_id")
	private Urunler urunler;
	
	//bi-directional mapping
	@OneToOne
	@JoinColumn(name = "musteri_id",insertable = false,updatable = false)
	private Musteriler musteri;

	public Sepet() {}

	public Sepet(int id, Urunler urunler, Musteriler musteri) {
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

	public Urunler getUrunler() {
		return urunler;
	}

	public void setUrunler(Urunler urunler) {
		this.urunler = urunler;
	}

	public Musteriler getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteriler musteri) {
		this.musteri = musteri;
	}
	
	
}
