package com.corsospring.service;

import com.corsospring.repository.RichiestaDAO;
import com.corsospring.entity.RichiestaSoldi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RichiestaSoldiService {

    @Autowired
    private RichiestaDAO richiestaDAO;

    @Transactional
    public RichiestaSoldi save(RichiestaSoldi richiesta) {
        return (RichiestaSoldi) richiestaDAO.save(richiesta);
    }

    public Optional<RichiestaSoldi> findById(Long id) {
        return richiestaDAO.findById(id)
                .filter(r -> r instanceof RichiestaSoldi)
                .map(r -> (RichiestaSoldi) r);
    }

    public List<RichiestaSoldi> findAll() {
        return richiestaDAO.findAll().stream()
                .filter(r -> r instanceof RichiestaSoldi)
                .map(r -> (RichiestaSoldi) r)
                .toList();
    }

    @Transactional
    public void delete(RichiestaSoldi richiesta) {
        richiestaDAO.delete(richiesta);
    }

    @Transactional
    public void deleteById(Long id) {
        richiestaDAO.deleteById(id);
    }
} 