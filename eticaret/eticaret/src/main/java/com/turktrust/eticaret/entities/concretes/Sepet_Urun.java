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
@Table(name="sepet_urun")
public class Sepet_Urun {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "sepet_id", referencedColumnName = "id")
	private Sepet sepet;
	
	@ManyToOne
	@JoinColumn(name = "urun_id", referencedColumnName = "id")
	private Urunler urun;
	
	public Sepet_Urun(int id, Sepet sepet, Urunler urun) {
		super();
		this.id = id;
		this.sepet = sepet;
		this.urun = urun;
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
		return urun;
	}

	public void setUrun(Urunler urun) {
		this.urun = urun;
	}

	

}
