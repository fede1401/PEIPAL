package com.corsospring.repository;

import com.corsospring.entity.Richiesta;
import com.corsospring.entity.TipoRichiesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RichiestaDAO extends JpaRepository<Richiesta, Long> {
    
    List<Richiesta> findByTipoRichiesta(TipoRichiesta tipo);
    
    List<Richiesta> findByTipoRichiestaOrderByTimestampDesc(TipoRichiesta tipo);
    
    List<Richiesta> findByMittenteIdAndTipoRichiesta(Long mittenteId, TipoRichiesta tipo);
} 