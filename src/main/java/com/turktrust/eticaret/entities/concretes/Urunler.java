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
@Table(name="Urunler")
public class Urunler {
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="Satici_Id",referencedColumnName = "Id")
	private Saticilar satici;
	
	@Column(name="Stok_Sayisi")
	private int Stok_Sayisi;
	
	@ManyToOne
	@JoinColumn(name="Marka_Id",referencedColumnName = "Id")
	private Markalar Marka;
	
	@ManyToOne
	@JoinColumn(name="Kategori_Id",referencedColumnName = "Id")
	private Kategori Kategori;
	
	@Column(name="Kategori_Adi")
	private String Kategori_Adi;

	@Column(name="Urun_Adi")
	private String Urun_Adi;
	
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
		Stok_Sayisi = stok_Sayisi;
		Marka = marka;
		Kategori = kategori;
		Kategori_Adi = kategori_Adi;
		Urun_Adi = urun_Adi;
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
		return Stok_Sayisi;
	}

	public void setStok_Sayisi(int stok_Sayisi) {
		Stok_Sayisi = stok_Sayisi;
	}

	public Markalar getMarka() {
		return Marka;
	}

	public void setMarka(Markalar marka) {
		Marka = marka;
	}

	public Kategori getKategori() {
		return Kategori;
	}

	public void setKategori(Kategori kategori) {
		Kategori = kategori;
	}

	public String getKategori_Adi() {
		return Kategori_Adi;
	}

	public void setKategori_Adi(String kategori_Adi) {
		Kategori_Adi = kategori_Adi;
	}

	public String getUrun_Adi() {
		return Urun_Adi;
	}

	public void setUrun_Adi(String urun_Adi) {
		Urun_Adi = urun_Adi;
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
