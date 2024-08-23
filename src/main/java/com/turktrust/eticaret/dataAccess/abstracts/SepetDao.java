package com.turktrust.eticaret.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turktrust.eticaret.entities.concretes.Sepet;

@Repository
public interface SepetDao extends JpaRepository<Sepet, Integer> {

	List<Sepet> findByMusteri_MusteriId(int musteriId);

}
