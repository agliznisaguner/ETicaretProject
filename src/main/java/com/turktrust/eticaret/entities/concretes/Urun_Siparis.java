package com.turktrust.eticaret.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name = "urun_siparis")
public class Urun_Siparis {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "urun_siparis_id", nullable = false)
	private int urunSiparisId;

	@ManyToOne
	@JoinColumn(name = "siparis_id", referencedColumnName = "siparis_id")
	private Siparisler siparis;

	@ManyToOne
	@JoinColumn(name = "urun_id	", referencedColumnName = "urun_id")
	private Urunler urun;

	public Urun_Siparis(int id, Siparisler siparisler, Urunler urunler) {
		super();
		this.urunSiparisId = id;
		this.siparis = siparisler;
		this.urun = urunler;
	}

	public Urun_Siparis() {
	}

	public int getId() {
		return urunSiparisId;
	}

	public void setId(int id) {
		this.urunSiparisId = id;
	}

	public Siparisler getSiparisler() {
		return siparis;
	}

	public void setSiparisler(Siparisler siparisler) {
		this.siparis = siparisler;
	}

	public Urunler getUrunler() {
		return urun;
	}

	public void setUrunler(Urunler urunler) {
		this.urun = urunler;
	}

}
