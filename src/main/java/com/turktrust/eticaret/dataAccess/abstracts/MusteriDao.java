package com.turktrust.eticaret.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turktrust.eticaret.entities.concretes.Musteriler;

@Repository
public interface MusteriDao extends JpaRepository<Musteriler, Integer> {

	Musteriler findByEmail(String email);

	Musteriler findById(int musteriId);

}
