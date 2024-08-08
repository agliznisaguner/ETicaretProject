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
@Table(name="Favoriler")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Favoriler {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="Urun_Id",referencedColumnName = "Id")
	private Urunler Urun;
	
	@ManyToOne
	@JoinColumn(name="Musteri_Id",referencedColumnName = "Id")
	private Musteriler Musteri;

	public Favoriler(int id, Urunler urun, Musteriler musteri) {
		super();
		this.id = id;
		Urun = urun;
		Musteri = musteri;
	}

	public Favoriler() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Urunler getUrun() {
		return Urun;
	}

	public void setUrun(Urunler urun) {
		Urun = urun;
	}

	public Musteriler getMusteri() {
		return Musteri;
	}

	public void setMusteri(Musteriler musteri) {
		Musteri = musteri;
	}

}
