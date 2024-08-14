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
	private int musteriId;
	
	@Column(name="ad")
	private String ad;
	
	@Column(name="soyad")
	private String soyad;
	
	@Column(name="tckimlik_no")
	private int tckimlikNo;

	public Kisiler(int id, int musteri_No, List<Adres> adresler, List<Siparisler> siparisler, List<Sepet> sepetler,
			int musteri_Id, String ad, String soyad, int tckimlik_No) {
		super(id, musteri_No, adresler, siparisler, sepetler);
		this.musteriId = musteri_Id;
		this.ad = ad;
		this.soyad = soyad;
		this.tckimlikNo = tckimlik_No;
	}

	public int getMusteri_Id() {
		return musteriId;
	}

	public void setMusteri_Id(int musteri_Id) {
		this.musteriId = musteri_Id;
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
		return tckimlikNo;
	}

	public void setTckimlik_No(int tckimlik_No) {
		this.tckimlikNo = tckimlik_No;
	}
	
	

}
