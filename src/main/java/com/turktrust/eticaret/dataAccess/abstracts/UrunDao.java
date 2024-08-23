package com.turktrust.eticaret.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.turktrust.eticaret.entities.concretes.Urunler;
import com.turktrust.eticaret.entities.dtos.UrunWithKategoriDto;

public interface UrunDao extends JpaRepository<Urunler, Integer> {

	Urunler getByUrunAdi(String urunAdi);

	Urunler getByUrunAdiAndKategoriId(String urunAdi, int kategoriId);

	List<Urunler> getByUrunAdiOrKategoriId(String urunAdi, int kategoriId);

	List<Urunler> getByKategoriIdIn(List<Integer> categories);

	List<Urunler> getByUrunAdiContains(String urunAdi);

	List<Urunler> getByUrunAdiStartsWith(String urunAdi);

	List<Urunler> getByMarka_MarkaAdiIn(List<String> markaAdi);

	List<Urunler> getBySatici_SaticiFirmaAdiIn(List<String> saticiFirmaAdi);

	@Query("Select new com.turktrust.eticaret.entities.dtos.UrunWithKategoriDto(p.urunId,p.urunAdi,c.kategoriAdi) From Kategori c Inner Join c.urun p")
	List<UrunWithKategoriDto> getUrunWithKategoriDetails();
}
