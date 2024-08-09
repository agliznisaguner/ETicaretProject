package com.turktrust.eticaret.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 

@Entity
@Table(name="favoriler")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Favoriler {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="urun_id",referencedColumnName = "id")
	private Urunler urun;
	
	@ManyToOne
	@JoinColumn(name="musteri_id",referencedColumnName = "id")
	private Musteriler musteri;

	public Favoriler(int id, Urunler urun, Musteriler musteri) {
		super();
		this.id = id;
		this.urun = urun;
		this.musteri = musteri;
	}

	public Favoriler() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
