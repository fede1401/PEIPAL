package com.corsospring.repository;

import com.corsospring.entity.Transazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransazioneDAO extends JpaRepository<Transazione, Long> {
    List<Transazione> findAllByOrderByTimestampDesc();
} 