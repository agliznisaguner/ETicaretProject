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
@Table(name="markalar")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Markalar {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="marka_adi")
	private String marka_adi;
	
	@OneToMany(mappedBy = "marka")
	private List<Urunler> urunler;

	public Markalar(int id, String markaAdi) {
		super();
		this.id = id;
		this.marka_adi = markaAdi;
	}

	public Markalar() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarkaAdi() {
		return marka_adi;
	}

	public void setMarkaAdi(String markaAdi) {
		this.marka_adi = markaAdi;
	}

}
