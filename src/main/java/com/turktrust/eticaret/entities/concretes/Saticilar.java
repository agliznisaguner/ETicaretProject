package com.turktrust.eticaret.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Saticilar")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Saticilar {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;

	@Column(name="Satici_Firma_Adi")
	private String Satici_Firma_Adi;
	
	@OneToMany
	private List<Urunler> urunler;
	
	public Saticilar(int id, String satici_Firma_Adi, List<Urunler> urunler) {
		super();
		this.id = id;
		Satici_Firma_Adi = satici_Firma_Adi;
		this.urunler = urunler;
	}
	public Saticilar() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSatici_Firma_Adi() {
		return Satici_Firma_Adi;
	}
	public void setSatici_Firma_Adi(String satici_Firma_Adi) {
		Satici_Firma_Adi = satici_Firma_Adi;
	}
	public List<Urunler> getUrunler() {
		return urunler;
	}
	public void setUrunler(List<Urunler> urunler) {
		this.urunler = urunler;
	}
	
	

}
