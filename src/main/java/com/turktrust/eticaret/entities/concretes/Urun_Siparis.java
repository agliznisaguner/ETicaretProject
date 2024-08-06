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

public class Urun_Siparis {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "Siparis_Id",referencedColumnName = "Id")
	private int Siparis_Id;
	
	@ManyToOne
	@JoinColumn(name = "Urun_Id", referencedColumnName = "Id")
	private int Urun_Id;

	public Urun_Siparis(int id, int siparis_Id, int urun_Id) {
		super();
		this.id = id;
		Siparis_Id = siparis_Id;
		Urun_Id = urun_Id;
	}
	public Urun_Siparis() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSiparis_Id() {
		return Siparis_Id;
	}

	public void setSiparis_Id(int siparis_Id) {
		Siparis_Id = siparis_Id;
	}

	public int getUrun_Id() {
		return Urun_Id;
	}

	public void setUrun_Id(int urun_Id) {
		Urun_Id = urun_Id;
	}

}
