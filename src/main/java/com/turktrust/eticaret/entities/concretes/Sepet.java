package com.turktrust.eticaret.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sepet")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sepet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sepet_id", nullable = false)
	private int sepetId;

	@ManyToOne
	@JoinColumn(name = "musteri_id", referencedColumnName = "musteri_id")
	private Musteriler musteri;

	@ManyToMany
	@JoinTable(name = "sepet_urun", joinColumns = @JoinColumn(name = "sepet_id"), inverseJoinColumns = @JoinColumn(name = "urun_id"))
	private List<Urunler> urun;

	public Sepet() {
	}

	public Sepet(int sepet_id, Musteriler musteri, List<Urunler> urun) {
		super();
		this.sepetId = sepet_id;
		this.musteri = musteri;
		this.urun = urun;
	}

	public int getId() {
		return sepetId;
	}

	public void setId(int id) {
		this.sepetId = id;
	}

	public Musteriler getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteriler musteri) {
		this.musteri = musteri;
	}

	public List<Urunler> getUrun() {
		return urun;
	}

	public void setUrun(List<Urunler> urun) {
		this.urun = urun;
	}

}
