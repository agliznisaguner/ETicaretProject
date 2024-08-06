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
@Table(name="Favoriler")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Favoriler {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Urun_Id")
	private int Urun_Id;
	
	@Column(name="Musteri_Id")
	private int Musteri_Id;

	public Favoriler(int id, int urunId, int musteriId) {
		super();
		this.id = id;
		Urun_Id = urunId;
		Musteri_Id = musteriId;
	}

	public Favoriler() {}
	
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

	public int getMusteriId() {
		return Musteri_Id;
	}

	public void setMusteriId(int musteriId) {
		Musteri_Id = musteriId;
	}
}
