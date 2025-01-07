package com.portafolio.frases_peliculas.service;

import com.portafolio.frases_peliculas.dto.FraseDTO;
import com.portafolio.frases_peliculas.model.Frase;
import com.portafolio.frases_peliculas.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;
    public FraseDTO obtenerFraseAleatoria() {
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(),frase.getFrase(),frase.getPersonaje(),frase.getPoster());
    }
}