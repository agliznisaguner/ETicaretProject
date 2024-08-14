package com.turktrust.eticaret.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 

@Entity
@Table(name="siparisler")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Siparisler {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="siparis_id",nullable = false)
	private int siparisId;
	
	@ManyToOne
	@JoinColumn(name="musteri_id",referencedColumnName = "musteri_id")
	private Musteriler musteri;
	
	@Column(name="siparis_detay")
	private String siparisDetay;
	
	@ManyToMany
	@JoinTable(name="urun_siparis", 
	joinColumns = @JoinColumn(name="siparis_id"), 
	inverseJoinColumns =@JoinColumn(name="urun_id") )
	private List<Urunler> urun;

	public Siparisler(int id, Musteriler musteriId, String siparisDetay, List<Urunler> urunler) {
		super();
		this.siparisId = id;
		musteri = musteriId;
		this.siparisDetay = siparisDetay;
		this.urun = urunler;
	}

	public Siparisler() {}

	public int getId() {
		return siparisId;
	}

	public void setId(int id) {
		this.siparisId = id;
	}

	public Musteriler getMusteriId() {
		return musteri;
	}

	public void setMusteriId(Musteriler musteriId) {
		musteri = musteriId;
	}

	public String getSiparisDetay() {
		return this.siparisDetay;
	}

	public void setSiparisDetay(String siparisDetay) {
		this.siparisDetay = siparisDetay;
	}

	public List<Urunler> getUrunler() {
		return urun;
	}

	public void setUrunler(List<Urunler> urunler) {
		this.urun = urunler;
	}


}
