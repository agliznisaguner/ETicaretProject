package com.turktrust.eticaret.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turktrust.eticaret.entities.concretes.Favoriler;

@Repository
public interface FavoriDao extends JpaRepository<Favoriler, Integer> {

}
