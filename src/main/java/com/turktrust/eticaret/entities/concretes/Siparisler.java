package com.turktrust.eticaret.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 

@Entity
@Table(name="Siparisler")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Siparisler {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="Musteri_Id", referencedColumnName = "Id")
	private Musteriler musteri;
	
	@Column(name="Siparis_Detay")
	private String Siparis_Detay;
	
	@OneToMany
	private List<Urunler> urunler;

	public Siparisler(int id, Musteriler musteriId, String siparisDetay, List<Urunler> urunler) {
		super();
		this.id = id;
		musteri = musteriId;
		Siparis_Detay = siparisDetay;
		this.urunler = urunler;
	}

	public Siparisler() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Musteriler getMusteriId() {
		return musteri;
	}

	public void setMusteriId(Musteriler musteriId) {
		musteri = musteriId;
	}

	public String getSiparisDetay() {
		return Siparis_Detay;
	}

	public void setSiparisDetay(String siparisDetay) {
		Siparis_Detay = siparisDetay;
	}

	public List<Urunler> getUrunler() {
		return urunler;
	}

	public void setUrunler(List<Urunler> urunler) {
		this.urunler = urunler;
	}


}
