package com.turktrust.eticaret.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turktrust.eticaret.entities.concretes.Markalar;

public interface MarkaDao extends JpaRepository<Markalar, Integer> {

}
