package com.corsospring.service;

import com.corsospring.repository.RichiestaDAO;
import com.corsospring.entity.Richiesta;
import com.corsospring.entity.TipoRichiesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RichiestaService {

    @Autowired
    private RichiestaDAO richiestaDAO;

    @Transactional
    public Richiesta save(Richiesta richiesta) {
        return richiestaDAO.save(richiesta);
    }

    public Optional<Richiesta> findById(Long id) {
        return richiestaDAO.findById(id);
    }

    public List<Richiesta> findAll() {
        return richiestaDAO.findAll();
    }

    public List<Richiesta> findByTipo(TipoRichiesta tipo) {
        return richiestaDAO.findByTipoRichiesta(tipo);
    }

    public List<Richiesta> findByTipoOrderByTimestamp(TipoRichiesta tipo) {
        return richiestaDAO.findByTipoRichiestaOrderByTimestampDesc(tipo);
    }

    public List<Richiesta> findByMittenteAndTipo(Long mittenteId, TipoRichiesta tipo) {
        return richiestaDAO.findByMittenteIdAndTipoRichiesta(mittenteId, tipo);
    }

    @Transactional
    public void delete(Richiesta richiesta) {
        richiestaDAO.delete(richiesta);
    }

    @Transactional
    public void deleteById(Long id) {
        richiestaDAO.deleteById(id);
    }
} 