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
@Table(name="Siparisler")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Siparisler {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="MusteriId")
	private int MusteriId;
	
	@Column(name="SiparisDetay")
	private String SiparisDetay;

	public Siparisler(int id, int musteriId, String siparisDetay) {
		super();
		this.id = id;
		MusteriId = musteriId;
		SiparisDetay = siparisDetay;
	}
	public Siparisler() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMusteriId() {
		return MusteriId;
	}

	public void setMusteriId(int musteriId) {
		MusteriId = musteriId;
	}

	public String getSiparisDetay() {
		return SiparisDetay;
	}

	public void setSiparisDetay(String siparisDetay) {
		SiparisDetay = siparisDetay;
	}

}
