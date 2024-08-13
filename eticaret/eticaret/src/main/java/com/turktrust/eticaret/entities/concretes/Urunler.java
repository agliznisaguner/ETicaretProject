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
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="urunler")
public class Urunler {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="satici_id",referencedColumnName = "id")
	private Saticilar satici;
	
	@Column(name="stok_sayisi")
	private int stok_sayisi;
	
	@ManyToOne
	@JoinColumn(name="marka_id",referencedColumnName = "id")
	private Markalar marka;
	
	@ManyToOne
	@JoinColumn(name="kategori_id")
	private Kategori kategori;
	
	
	@Column(name="kategori_adi")
	private String kategori_adi;

	@Column(name="urun_adi")
	private String urun_adi;
	
	@OneToMany(mappedBy = "urunler")
	private List<Sepet> sepetler;
	
	@OneToMany(mappedBy = "urunler")
	private List<Siparisler> siparisler;
	
	@OneToMany(mappedBy = "urun")
	private List<Fiyat> fiyatlar;

	public Urunler(int id, Saticilar satici, int stok_Sayisi, Markalar marka,
			com.turktrust.eticaret.entities.concretes.Kategori kategori, String kategori_Adi, String urun_Adi,
			List<Sepet> sepetler, List<Siparisler> siparisler, List<Fiyat> fiyatlar) {
		super();
		this.id = id;
		this.satici = satici;
		stok_sayisi = stok_Sayisi;
		this.marka = marka;
		this.kategori = kategori;
		kategori_adi = kategori_Adi;
		urun_adi = urun_Adi;
		this.sepetler = sepetler;
		this.siparisler = siparisler;
		this.fiyatlar = fiyatlar;
	}

	public Urunler() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Saticilar getSatici() {
		return satici;
	}

	public void setSatici(Saticilar satici) {
		this.satici = satici;
	}

	public int getStok_Sayisi() {
		return stok_sayisi;
	}

	public void setStok_Sayisi(int stok_Sayisi) {
		stok_sayisi = stok_Sayisi;
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

	public String getKategori_Adi() {
		return kategori_adi;
	}

	public void setKategori_Adi(String kategori_Adi) {
		kategori_adi = kategori_Adi;
	}

	public String getUrun_Adi() {
		return urun_adi;
	}

	public void setUrun_Adi(String urun_Adi) {
		urun_adi = urun_Adi;
	}

	public List<Sepet> getSepetler() {
		return sepetler;
	}

	public void setSepetler(List<Sepet> sepetler) {
		this.sepetler = sepetler;
	}

	public List<Siparisler> getSiparisler() {
	return siparisler;
	}

	public void setSiparisler(List<Siparisler> siparisler) {
	this.siparisler = siparisler;
	}

	public List<Fiyat> getFiyatlar() {
		return fiyatlar;
	}

	public void setFiyatlar(List<Fiyat> fiyatlar) {
		this.fiyatlar = fiyatlar;
	}
	
	
	

	


}
