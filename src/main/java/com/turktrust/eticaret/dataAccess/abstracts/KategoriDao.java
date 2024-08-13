package com.turktrust.eticaret.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turktrust.eticaret.entities.concretes.Kategori;

public interface KategoriDao extends JpaRepository<Kategori, Integer>{

}
