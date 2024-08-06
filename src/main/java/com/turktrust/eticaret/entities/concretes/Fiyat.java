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
@Table(name="Fiyat")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Fiyat {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Urun_Id")
	private int Urun_Id;
	
	@Column(name="Urun_Fiyat")
	private int Urun_Fiyat;

	public Fiyat(int id, int urunId, int urunFiyat) {
		super();
		this.id = id;
		Urun_Id = urunId;
		Urun_Fiyat = urunFiyat;
	}

	public Fiyat() {}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUrunId() {
		return Urun_Id;
	}

	public void setUrunId(int urunId) {
		Urun_Id = urunId;
	}

	public int getUrunFiyat() {
		return Urun_Fiyat;
	}

	public void setUrunFiyat(int urunFiyat) {
		Urun_Fiyat = urunFiyat;
	}
	
}
