package com.corsospring.dao;

import com.corsospring.entity.Richiesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RichiestaDAO extends JpaRepository<Richiesta, Long> {
   
} 