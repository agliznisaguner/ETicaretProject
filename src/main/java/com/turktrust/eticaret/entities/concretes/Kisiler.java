package com.turktrust.eticaret.entities.concretes;

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
	
	public Kisiler(int musteriId, String ad, String soyad, int tcKimlikNo, int id, int musteriNo,int siparisId ) {
		super(id, musteriNo, siparisId);
		Musteri_Id = musteriId;
		Ad = ad;
		Soyad = soyad;
		Tckimlik_No = tcKimlikNo;
	}
	public int getMusteriId() {
		return Musteri_Id;
	}
	public void setMusteriId(int musteriId) {
		Musteri_Id = musteriId;
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
	public int getTcKimlikNo() {
		return Tckimlik_No;
	}
	public void setTcKimlikNo(int tcKimlikNo) {
		Tckimlik_No = tcKimlikNo;
	}
	
	

}
