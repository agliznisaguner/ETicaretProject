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
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="markalar")
public class Markalar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="marka_id",nullable = false)
	private int markaId;
	
	@Column(name="marka_adi")
	private String markaAdi;
	
	@OneToMany(mappedBy = "marka")
	private List<Urunler> urun;

	public Markalar(int id, String marka_Adi) {
		super();
		this.markaId = id;
		this.markaAdi = marka_Adi;
	}

	public Markalar() {}
	
	public int getId() {
		return markaId;
	}

	public void setId(int id) {
		this.markaId = id;
	}

	public String getMarka_Adi() {
		return markaAdi;
	}

	public void setMarka_Adi(String markaAdi) {
		this.markaAdi = markaAdi;
	}

}
