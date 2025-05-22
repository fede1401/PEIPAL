package com.corsospring.dao;

import com.corsospring.entity.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteDAO extends JpaRepository<Utente, Long> {
} 