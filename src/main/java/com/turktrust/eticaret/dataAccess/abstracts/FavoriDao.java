package com.turktrust.eticaret.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turktrust.eticaret.entities.concretes.Favoriler;

public interface FavoriDao extends JpaRepository<Favoriler, Integer> {

}
