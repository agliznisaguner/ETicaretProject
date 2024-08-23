package com.turktrust.eticaret.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "favoriler")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Favoriler {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "favori_id", nullable = false)
	private int favoriId;

	@ManyToOne
	@JoinColumn(name = "urun_id", referencedColumnName = "urun_id")
	private Urunler urun;

	@ManyToOne
	@JoinColumn(name = "musteri_id")
	private Musteriler musteri;

	public Favoriler(int id, Urunler urun, Musteriler musteri) {
		super();
		this.favoriId = id;
		this.urun = urun;
		this.musteri = musteri;
	}

	public Favoriler() {
	}

	public int getId() {
		return favoriId;
	}

	public void setId(int id) {
		this.favoriId = id;
	}

	public Urunler getUrun() {
		return urun;
	}

	public void setUrun(Urunler urun) {
		this.urun = urun;
	}

	public Musteriler getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteriler musteri) {
		this.musteri = musteri;
	}

}
