package com.turktrust.eticaret.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turktrust.eticaret.entities.concretes.Adres;

@Repository
public interface AdresDao extends JpaRepository<Adres, Integer> {

	Adres findByMusteri_musteriId(int musteriId);

}
