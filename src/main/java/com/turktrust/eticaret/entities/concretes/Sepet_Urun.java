package com.turktrust.eticaret.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="Sepet_Urun")
public class Sepet_Urun {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "Sepet_Id", referencedColumnName = "Id")
	private Sepet sepet;
	
	@ManyToOne
	@JoinColumn(name = "Urun_Id", referencedColumnName = "Id")
	private Urunler Urun;
	
	public Sepet_Urun(int id, Sepet sepet, Urunler urun) {
		super();
		this.id = id;
		this.sepet = sepet;
		Urun = urun;
	}

	public Sepet_Urun() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Sepet getSepet() {
		return sepet;
	}

	public void setSepet(Sepet sepet) {
		this.sepet = sepet;
	}

	public Urunler getUrun() {
		return Urun;
	}

	public void setUrun(Urunler urun) {
		Urun = urun;
	}

	

}
