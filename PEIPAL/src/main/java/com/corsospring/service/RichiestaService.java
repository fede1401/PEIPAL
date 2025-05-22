package com.corsospring.service;

import com.corsospring.repository.RichiestaDAO;
import com.corsospring.entity.Richiesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RichiestaService {

    @Autowired
    private RichiestaDAO richiestaDAO;

    public Richiesta save(Richiesta richiesta) {
        return richiestaDAO.save(richiesta);
    }

    public Optional<Richiesta> findById(Long id) {
        return richiestaDAO.findById(id);
    }

    public List<Richiesta> findAll() {
        return richiestaDAO.findAll();
    }

    public void delete(Richiesta richiesta) {
        richiestaDAO.delete(richiesta);
    }

    public void deleteById(Long id) {
        richiestaDAO.deleteById(id);
    }
} 