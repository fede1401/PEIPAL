package com.corsospring.service;

import com.corsospring.repository.UtenteDAO;
import com.corsospring.entity.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UtenteService {

    @Autowired
    private UtenteDAO utenteDAO;

    public Utente save(Utente utente) {
        return utenteDAO.save(utente);
    }

    public Optional<Utente> findById(Long id) {
        return utenteDAO.findById(id);
    }

    public List<Utente> findAll() {
        return utenteDAO.findAll();
    }

    public void delete(Utente utente) {
        utenteDAO.delete(utente);
    }

    public void deleteById(Long id) {
        utenteDAO.deleteById(id);
    }
} 