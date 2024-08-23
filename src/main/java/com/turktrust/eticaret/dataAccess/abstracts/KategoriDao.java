package com.turktrust.eticaret.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turktrust.eticaret.entities.concretes.Kategori;

@Repository
public interface KategoriDao extends JpaRepository<Kategori, Integer> {

}
