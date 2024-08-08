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
@Table(name="Markalar")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Markalar {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Marka_Adi")
	private String Marka_Adi;
	
	@OneToMany
	private List<Urunler> urunler;

	public Markalar(int id, String markaAdi) {
		super();
		this.id = id;
		Marka_Adi = markaAdi;
	}

	public Markalar() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarkaAdi() {
		return Marka_Adi;
	}

	public void setMarkaAdi(String markaAdi) {
		Marka_Adi = markaAdi;
	}

}
