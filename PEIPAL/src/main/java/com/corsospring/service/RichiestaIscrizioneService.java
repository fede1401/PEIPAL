package com.corsospring.service;

import com.corsospring.repository.RichiestaDAO;
import com.corsospring.entity.RichiestaIscrizione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RichiestaIscrizioneService {

    @Autowired
    private RichiestaDAO richiestaDAO;

    @Transactional
    public RichiestaIscrizione save(RichiestaIscrizione richiesta) {
        return (RichiestaIscrizione) richiestaDAO.save(richiesta);
    }

    public Optional<RichiestaIscrizione> findById(Long id) {
        return richiestaDAO.findById(id)
                .filter(r -> r instanceof RichiestaIscrizione)
                .map(r -> (RichiestaIscrizione) r);
    }

    public List<RichiestaIscrizione> findAll() {
        return richiestaDAO.findAll().stream()
                .filter(r -> r instanceof RichiestaIscrizione)
                .map(r -> (RichiestaIscrizione) r)
                .toList();
    }

    @Transactional
    public void delete(RichiestaIscrizione richiesta) {
        richiestaDAO.delete(richiesta);
    }

    @Transactional
    public void deleteById(Long id) {
        richiestaDAO.deleteById(id);
    }
} 