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
@Table(name="saticilar")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Saticilar {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;

	@Column(name="satici_firma_adi")
	private String satici_firma_adi;
	
	@OneToMany(mappedBy = "satici")
	private List<Urunler> urunler;
	
	public Saticilar(int id, String satici_Firma_Adi, List<Urunler> urunler) {
		super();
		this.id = id;
		this.satici_firma_adi = satici_Firma_Adi;
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
		return satici_firma_adi;
	}
	public void setSatici_Firma_Adi(String satici_Firma_Adi) {
		this.satici_firma_adi = satici_Firma_Adi;
	}
	public List<Urunler> getUrunler() {
		return urunler;
	}
	public void setUrunler(List<Urunler> urunler) {
		this.urunler = urunler;
	}
	
	

}
