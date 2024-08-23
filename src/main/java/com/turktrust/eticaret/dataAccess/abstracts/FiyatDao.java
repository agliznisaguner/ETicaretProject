package com.turktrust.eticaret.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turktrust.eticaret.entities.concretes.Fiyat;

@Repository
public interface FiyatDao extends JpaRepository<Fiyat, Integer> {

}
