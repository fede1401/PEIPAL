package com.corsospring.service;

import com.corsospring.repository.TransazioneDAO;
import com.corsospring.entity.Transazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TransazioneService {

    @Autowired
    private TransazioneDAO transazioneDAO;

    public Transazione save(Transazione transazione) {
        return transazioneDAO.save(transazione);
    }

    public Optional<Transazione> findById(Long id) {
        return transazioneDAO.findById(id);
    }

    public List<Transazione> findAll() {
        return transazioneDAO.findAll();
    }

    public List<Transazione> findAllOrderByTimestamp() {
        return transazioneDAO.findAllByOrderByTimestampDesc();
    }

    public void delete(Transazione transazione) {
        transazioneDAO.delete(transazione);
    }

    public void deleteById(Long id) {
        transazioneDAO.deleteById(id);
    }
} 