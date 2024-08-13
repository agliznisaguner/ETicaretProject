package com.turktrust.eticaret.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turktrust.eticaret.entities.concretes.Fiyat;

public interface FiyatDao extends JpaRepository<Fiyat, Integer>{

}
