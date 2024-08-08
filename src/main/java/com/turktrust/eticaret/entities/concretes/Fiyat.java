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
@Table(name="Fiyat")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Fiyat {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="Urun_Id",referencedColumnName = "Id" )
	private Urunler urun;
	
	@Column(name="Urun_Fiyat")
	private int Urun_Fiyat;

	public Fiyat(int id, Urunler urun, int urun_Fiyat) {
		super();
		this.id = id;
		this.urun = urun;
		Urun_Fiyat = urun_Fiyat;
	}
	public Fiyat() {}
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
	public int getUrun_Fiyat() {
		return Urun_Fiyat;
	}
	public void setUrun_Fiyat(int urun_Fiyat) {
		Urun_Fiyat = urun_Fiyat;
	}

	
	
}
