package com.turktrust.eticaret.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="Musteriler")
public class Musteriler{

	public Musteriler(int id, int musteriNo, int siparisId) {
		super();
		this.id = id;
		Musteri_No = musteriNo;
		Siparis_Id = siparisId;
	}

	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Musteri_No")
	private int Musteri_No;
	
	@Column(name="Siparis_Id")
	private int Siparis_Id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMusteriNo() {
		return Musteri_No;
	}

	public void setMusteriNo(int musteriNo) {
		Musteri_No = musteriNo;
	}

	public int getSiparisId() {
		return Siparis_Id;
	}

	public void setSiparisId(int siparisId) {
		Siparis_Id = siparisId;
	}

}
