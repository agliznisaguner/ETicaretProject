package com.turktrust.eticaret.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;
import com.turktrust.eticaret.entities.concretes.Siparisler;

public interface SiparisDao extends JpaRepository<Siparisler, Integer> {
}
