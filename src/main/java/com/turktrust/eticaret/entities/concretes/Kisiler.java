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
@PrimaryKeyJoinColumn(name = "Musteri_Id", referencedColumnName = "Id")
@Table(name="Kisiler")
public class Kisiler extends Musteriler{

	@Column(name = "Musteri_Id", insertable = false, updatable = false)
	private int Musteri_Id;
	
	@Column(name="Ad")
	private String Ad;
	
	@Column(name="Soyad")
	private String Soyad;
	
	@Column(name="Tckimlik_No")
	private int Tckimlik_No;

	public Kisiler(int id, int musteri_No, List<Adres> adresler, List<Siparisler> siparisler, Sepet sepet,
			int musteri_Id, String ad, String soyad, int tckimlik_No) {
		super(id, musteri_No, adresler, siparisler, sepet);
		Musteri_Id = musteri_Id;
		Ad = ad;
		Soyad = soyad;
		Tckimlik_No = tckimlik_No;
	}

	public int getMusteri_Id() {
		return Musteri_Id;
	}

	public void setMusteri_Id(int musteri_Id) {
		Musteri_Id = musteri_Id;
	}

	public String getAd() {
		return Ad;
	}

	public void setAd(String ad) {
		Ad = ad;
	}

	public String getSoyad() {
		return Soyad;
	}

	public void setSoyad(String soyad) {
		Soyad = soyad;
	}

	public int getTckimlik_No() {
		return Tckimlik_No;
	}

	public void setTckimlik_No(int tckimlik_No) {
		Tckimlik_No = tckimlik_No;
	}
	
	

}
