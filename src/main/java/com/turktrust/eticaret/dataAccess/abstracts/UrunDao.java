package com.turktrust.eticaret.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.turktrust.eticaret.entities.concretes.Urunler;

public interface UrunDao extends JpaRepository<Urunler, Integer>{

	Urunler getByUrunAdi(String urunAdi);
	
	Urunler getByUrunAdiAndKategoriId(String urunAdi, int kategoriId);
	
	List<Urunler> getByUrunAdiOrKategoriId(String urunAdi, int kategoriId);
	
	List<Urunler> getByKategoriIn(List<Integer> categories);
	
	List<Urunler> getByUrunAdiContains(String urunAdi);
	
	List<Urunler> getByUrunAdiStartsWith(String urunAdi);
	
	//@Query("From Urunler where urun_adi =:urun_adi and kategori.kategori_id=:kategori_id")
	//List<Urunler> GetByUrun_adiAndKategori( String urun_adi, int kategori_id);
	
}
 