package com.turktrust.eticaret.entities.concretes;

import java.util.List;

import org.springframework.context.annotation.Lazy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="urunler")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Urunler {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="urun_id",nullable = false)
	private int urunId;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="satici_id",referencedColumnName = "satici_id")
	private Saticilar satici;
	
	@Column(name="stok_sayisi")
	private int stokSayisi;
	
	@ManyToOne
	@JoinColumn(name="marka_id",referencedColumnName = "marka_id")
	private Markalar marka;
	
	@ManyToOne
	@JoinColumn(name="kategori_id",referencedColumnName = "kategori_id")
	private Kategori kategori;
	

	@Column(name="urun_adi")
	private String urunAdi;
	
	@OneToMany(mappedBy = "urun")
	private List<Fiyat> fiyat;
	
	@OneToMany(mappedBy = "urun")
	private List<Favoriler> favori;
	
	@ManyToMany(mappedBy = "urun")
	private List<Sepet> sepet;
	
	@ManyToMany(mappedBy = "urun")
	private List<Siparisler> siparis;

	public Urunler(int id, Saticilar satici, int stok_Sayisi, Markalar marka,Kategori kategori,  String urun_Adi, List<Siparisler> siparisler, List<Fiyat> fiyatlar) {
		super();
		this.urunId = id;
		this.satici = satici;
		this.stokSayisi = stok_Sayisi;
		this.marka = marka;
		this.kategori = kategori;
		this.urunAdi = urun_Adi;
		this.siparis = siparisler;
		this.fiyat = fiyatlar;
	}

	public Urunler() {}

	public int getId() {
		return urunId;
	}

	public void setId(int id) {
		this.urunId = id;
	}

	public Saticilar getSatici() {
		return satici;
	}

	public void setSatici(Saticilar satici) {
		this.satici = satici;
	}

	public int getStok_Sayisi() {
		return stokSayisi;
	}

	public void setStok_Sayisi(int stok_Sayisi) {
		this.stokSayisi = stok_Sayisi;
	}

	public Markalar getMarka() {
		return marka;
	}

	public void setMarka(Markalar marka) {
		this.marka = marka;
	}

	public Kategori getKategori() {
		return kategori;
	}

	public void setKategori(Kategori kategori) {
		this.kategori = kategori;
	}

	public String getUrun_Adi() {
		return urunAdi;
	}

	public void setUrun_Adi(String urun_Adi) {
		this.urunAdi = urun_Adi;
	}

	public List<Siparisler> getSiparisler() {
	return siparis;
	}

	public void setSiparisler(List<Siparisler> siparisler) {
	this.siparis = siparisler;
	}

	public List<Fiyat> getFiyatlar() {
		return fiyat;
	}

	public void setFiyatlar(List<Fiyat> fiyatlar) {
		this.fiyat = fiyatlar;
	}
	
	
	

	


}
