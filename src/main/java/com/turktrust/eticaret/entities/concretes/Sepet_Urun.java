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
@Table(name = "sepet_urun")
public class Sepet_Urun {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sepet_urun_id", nullable = false)
	private int sepetUrunId;

	@ManyToOne
	@JoinColumn(name = "sepet_id", referencedColumnName = "sepet_id")
	private Sepet sepet;

	@ManyToOne
	@JoinColumn(name = "urun_id", referencedColumnName = "urun_id")
	private Urunler urun;

	public Sepet_Urun(int id, Sepet sepet, Urunler urun) {
		super();
		this.sepetUrunId = id;
		this.sepet = sepet;
		this.urun = urun;
	}

	public Sepet_Urun() {
	}

	public int getId() {
		return sepetUrunId;
	}

	public void setId(int id) {
		this.sepetUrunId = id;
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
