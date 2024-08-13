package com.turktrust.eticaret.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@PrimaryKeyJoinColumn(name = "musteri_id", referencedColumnName = "musteri_id")
@Table(name="kisiler")
public class Kisiler extends Musteriler{

	@Column(name = "musteri_id", insertable = false, updatable = false,nullable = false)
	private int musteri_id;
	
	@Column(name="ad")
	private String ad;
	
	@Column(name="soyad")
	private String soyad;
	
	@Column(name="tckimlik_no")
	private int tckimlik_no;

	public Kisiler(int id, int musteri_No, List<Adres> adresler, List<Siparisler> siparisler, List<Sepet> sepetler,
			int musteri_Id, String ad, String soyad, int tckimlik_No) {
		super(id, musteri_No, adresler, siparisler, sepetler);
		this.musteri_id = musteri_Id;
		this.ad = ad;
		this.soyad = soyad;
		this.tckimlik_no = tckimlik_No;
	}

	public int getMusteri_Id() {
		return musteri_id;
	}

	public void setMusteri_Id(int musteri_Id) {
		this.musteri_id = musteri_Id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getTckimlik_No() {
		return tckimlik_no;
	}

	public void setTckimlik_No(int tckimlik_No) {
		this.tckimlik_no = tckimlik_No;
	}
	
	

}
