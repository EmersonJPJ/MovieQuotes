package com.portafolio.frases_peliculas.controller;

import com.portafolio.frases_peliculas.dto.FraseDTO;
import com.portafolio.frases_peliculas.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FraseController {
    @Autowired
    private FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO obtenerFrases(){
        return service.obtenerFraseAleatoria();
    }
}
