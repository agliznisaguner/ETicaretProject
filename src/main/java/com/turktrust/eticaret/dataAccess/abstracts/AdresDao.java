package com.turktrust.eticaret.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turktrust.eticaret.entities.concretes.Adres;

public interface AdresDao extends JpaRepository<Adres, Integer>{

}
