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
@Table(name="Urun_Siparis")
public class Urun_Siparis {

	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "Siparis_Id",referencedColumnName = "Id")
	private Siparisler siparisler;
	
	@ManyToOne
	@JoinColumn(name = "Urunler_Id",referencedColumnName = "Id")
	private Urunler urunler;
		

	public Urun_Siparis(int id, Siparisler siparisler, Urunler urunler) {
		super();
		this.id = id;
		this.siparisler = siparisler;
		this.urunler = urunler;
	}

	public Urun_Siparis() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Siparisler getSiparisler() {
		return siparisler;
	}

	public void setSiparisler(Siparisler siparisler) {
		this.siparisler = siparisler;
	}

	public Urunler getUrunler() {
		return urunler;
	}

	public void setUrunler(Urunler urunler) {
		this.urunler = urunler;
	}


	

	

}
