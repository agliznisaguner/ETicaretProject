package com.turktrust.eticaret.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turktrust.eticaret.entities.concretes.Sepet_Urun;

@Repository
public interface SepetUrunDao extends JpaRepository<Sepet_Urun, Integer> {

}
