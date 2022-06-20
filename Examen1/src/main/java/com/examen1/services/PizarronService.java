package com.examen1.services;

import com.examen1.models.Pizarron;
import com.examen1.repositories.PizarronRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizarronService {

    @Autowired
    PizarronRepository pizarronRepository;

    public void guardarPizarra(Pizarron pizarron) {

        pizarronRepository.save(pizarron);

    }

    public List<Pizarron> findAll() {
        return pizarronRepository.findAll();
    }

    public Pizarron buscarID(Long id) {
        return pizarronRepository.findById(id).get();
    }
}
