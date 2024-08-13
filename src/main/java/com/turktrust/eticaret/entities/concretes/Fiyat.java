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
@Table(name="fiyat")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Fiyat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="fiyat_id",nullable = false)
	private int fiyat_id;
	
	@ManyToOne
	@JoinColumn(name="urun_id",referencedColumnName = "urun_id")
	private Urunler urun;
	
	@Column(name="urun_fiyat")
	private int urun_fiyat;

	public Fiyat(int id, Urunler urun, int urun_Fiyat) {
		super();
		this.fiyat_id = id;
		this.urun = urun;
		this.urun_fiyat = urun_Fiyat;
	}
	public Fiyat() {}
	public int getId() {
		return fiyat_id;
	}

	public void setId(int id) {
		this.fiyat_id = id;
	}
	public Urunler getUrun() {
		return urun;
	}
	public void setUrun(Urunler urun) {
		this.urun = urun;
	}
	public int getUrun_Fiyat() {
		return urun_fiyat;
	}
	public void setUrun_Fiyat(int urun_Fiyat) {
		this.urun_fiyat = urun_Fiyat;
	}

	
	
}
