package com.turktrust.eticaret.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turktrust.eticaret.entities.concretes.Musteriler;

public interface MusteriDao extends JpaRepository<Musteriler, Integer> {

}
