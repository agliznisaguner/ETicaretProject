package com.turktrust.eticaret.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turktrust.eticaret.entities.concretes.Kisiler;

public interface KisiDao extends JpaRepository<Kisiler, Integer>{

}
