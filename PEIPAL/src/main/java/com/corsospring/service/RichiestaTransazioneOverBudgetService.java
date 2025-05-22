package com.corsospring.service;

import com.corsospring.repository.RichiestaDAO;
import com.corsospring.entity.RichiestaTransazioneOverBudget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RichiestaTransazioneOverBudgetService {

    @Autowired
    private RichiestaDAO richiestaDAO;

    @Transactional
    public RichiestaTransazioneOverBudget save(RichiestaTransazioneOverBudget richiesta) {
        return (RichiestaTransazioneOverBudget) richiestaDAO.save(richiesta);
    }

    public Optional<RichiestaTransazioneOverBudget> findById(Long id) {
        return richiestaDAO.findById(id)
                .filter(r -> r instanceof RichiestaTransazioneOverBudget)
                .map(r -> (RichiestaTransazioneOverBudget) r);
    }

    public List<RichiestaTransazioneOverBudget> findAll() {
        return richiestaDAO.findAll().stream()
                .filter(r -> r instanceof RichiestaTransazioneOverBudget)
                .map(r -> (RichiestaTransazioneOverBudget) r)
                .toList();
    }

    @Transactional
    public void delete(RichiestaTransazioneOverBudget richiesta) {
        richiestaDAO.delete(richiesta);
    }

    @Transactional
    public void deleteById(Long id) {
        richiestaDAO.deleteById(id);
    }
} 