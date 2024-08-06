package com.turktrust.eticaret.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
	
	public Saticilar(int id, String saticiFirmaAdi) {
		super();
		this.id = id;
		Satici_Firma_Adi = saticiFirmaAdi;
	}

	public Saticilar() {}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSaticiFirmaAdi() {
		return Satici_Firma_Adi;
	}

	public void setSaticiFirmaAdi(String saticiFirmaAdi) {
		Satici_Firma_Adi = saticiFirmaAdi;
	}
	
	

}
