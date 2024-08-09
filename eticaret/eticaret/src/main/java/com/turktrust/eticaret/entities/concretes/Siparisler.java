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
@Table(name="siparisler")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Siparisler {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="musteri_id", referencedColumnName = "id")
	private Musteriler musteri;
	
	@Column(name="siparis_detay")
	private String siparis_detay;
	
	@OneToMany(mappedBy = "siparisler")
	private List<Urunler> urunler;

	public Siparisler(int id, Musteriler musteriId, String siparisDetay, List<Urunler> urunler) {
		super();
		this.id = id;
		musteri = musteriId;
		this.siparis_detay = siparisDetay;
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
		return this.siparis_detay;
	}

	public void setSiparisDetay(String siparisDetay) {
		siparis_detay = siparisDetay;
	}

	public List<Urunler> getUrunler() {
		return urunler;
	}

	public void setUrunler(List<Urunler> urunler) {
		this.urunler = urunler;
	}


}
