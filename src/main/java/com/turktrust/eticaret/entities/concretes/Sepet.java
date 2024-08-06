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
@Table(name="Sepet")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sepet {
	
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Musteri_Id")
	private int Musteri_Id;

	public Sepet(int id, int musteriId) {
		super();
		this.id = id;
		Musteri_Id = musteriId;
	}

	public Sepet() {}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMusteriId() {
		return Musteri_Id;
	}

	public void setMusteriId(int musteriId) {
		Musteri_Id = musteriId;
	}
}
