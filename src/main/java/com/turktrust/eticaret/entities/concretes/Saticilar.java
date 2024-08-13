package com.turktrust.eticaret.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="saticilar")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Saticilar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="satici_id",nullable = false)
	private int satici_id;

	@Column(name="satici_firma_adi")
	private String satici_firma_adi;
	
	@OneToMany(mappedBy = "satici")
	private List<Urunler> urun;
	
	public Saticilar(int id, String satici_Firma_Adi, List<Urunler> urunler) {
		super();
		this.satici_id = id;
		this.satici_firma_adi = satici_Firma_Adi;
		this.urun = urunler;
	}
	public Saticilar() {}
	
	public int getId() {
		return satici_id;
	}

	public void setId(int id) {
		this.satici_id = id;
	}

	public String getSatici_Firma_Adi() {
		return satici_firma_adi;
	}
	public void setSatici_Firma_Adi(String satici_Firma_Adi) {
		this.satici_firma_adi = satici_Firma_Adi;
	}
	public List<Urunler> getUrunler() {
		return urun;
	}
	public void setUrunler(List<Urunler> urunler) {
		this.urun = urunler;
	}
	
	

}
