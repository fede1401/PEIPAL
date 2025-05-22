package com.corsospring.dao;

import com.corsospring.entity.Transazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransazioneDAO extends JpaRepository<Transazione, Long> {
    
} 