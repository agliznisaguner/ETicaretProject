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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="saticilar")
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","urunler"})
public class Saticilar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="satici_id",nullable = false)
	private int saticiId;

	@Column(name="satici_firma_adi")
	private String saticiFirmaAdi;
	
	@OneToMany(mappedBy = "satici",fetch = FetchType.LAZY)
	private List<Urunler> urun;
	
	public Saticilar(int id, String satici_Firma_Adi, List<Urunler> urunler) {
		super();
		this.saticiId = id;
		this.saticiFirmaAdi = satici_Firma_Adi;
		this.urun = urunler;
	}
	public Saticilar() {}
	
	public int getId() {
		return saticiId;
	}

	public void setId(int id) {
		this.saticiId = id;
	}

	public String getSatici_Firma_Adi() {
		return saticiFirmaAdi;
	}
	public void setSatici_Firma_Adi(String satici_Firma_Adi) {
		this.saticiFirmaAdi = satici_Firma_Adi;
	}
	public List<Urunler> getUrunler() {
		return urun;
	}
	public void setUrunler(List<Urunler> urunler) {
		this.urun = urunler;
	}
	
	

}
