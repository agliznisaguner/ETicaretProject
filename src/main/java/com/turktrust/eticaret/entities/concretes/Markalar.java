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
	private int marka_id;
	
	@Column(name="marka_adi")
	private String marka_adi;
	
	@OneToMany(mappedBy = "marka")
	private List<Urunler> urun;

	public Markalar(int id, String marka_Adi) {
		super();
		this.marka_id = id;
		this.marka_adi = marka_Adi;
	}

	public Markalar() {}
	
	public int getId() {
		return marka_id;
	}

	public void setId(int id) {
		this.marka_id = id;
	}

	public String getMarka_Adi() {
		return marka_adi;
	}

	public void setMarka_Adi(String markaAdi) {
		this.marka_adi = markaAdi;
	}

}
