package com.turktrust.eticaret.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
	
	@JoinColumn(name = "Sepet_Id", referencedColumnName = "Id")
	private int Sepet_Id;
	
	@JoinColumn(name = "Urun_Id", referencedColumnName = "Id")
	private int Urun_Id;
	
	public Sepet_Urun(int id, int sepet_Id, int urun_Id) {
		super();
		this.id = id;
		Sepet_Id = sepet_Id;
		Urun_Id = urun_Id;
	}
	public Sepet_Urun() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSepet_Id() {
		return Sepet_Id;
	}

	public void setSepet_Id(int sepet_Id) {
		Sepet_Id = sepet_Id;
	}

	public int getUrun_Id() {
		return Urun_Id;
	}

	public void setUrun_Id(int urun_Id) {
		Urun_Id = urun_Id;
	}

}
