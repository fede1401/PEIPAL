package com.corsospring.service;

import com.corsospring.repository.RichiestaDAO;
import com.corsospring.entity.RichiestaAggiuntaCredito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RichiestaAggiuntaCreditoService {

    @Autowired
    private RichiestaDAO richiestaDAO;

    @Transactional
    public RichiestaAggiuntaCredito save(RichiestaAggiuntaCredito richiesta) {
        return (RichiestaAggiuntaCredito) richiestaDAO.save(richiesta);
    }

    public Optional<RichiestaAggiuntaCredito> findById(Long id) {
        return richiestaDAO.findById(id)
                .filter(r -> r instanceof RichiestaAggiuntaCredito)
                .map(r -> (RichiestaAggiuntaCredito) r);
    }

    public List<RichiestaAggiuntaCredito> findAll() {
        return richiestaDAO.findAll().stream()
                .filter(r -> r instanceof RichiestaAggiuntaCredito)
                .map(r -> (RichiestaAggiuntaCredito) r)
                .toList();
    }

    @Transactional
    public void delete(RichiestaAggiuntaCredito richiesta) {
        richiestaDAO.delete(richiesta);
    }

    @Transactional
    public void deleteById(Long id) {
        richiestaDAO.deleteById(id);
    }
} 