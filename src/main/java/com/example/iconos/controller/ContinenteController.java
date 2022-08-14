package com.example.iconos.controller;

import com.example.iconos.dto.ContinenteDTO;
import com.example.iconos.entity.ContinenteEntity;
import com.example.iconos.service.impl.ContinenteServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/continentes")
public class ContinenteController {

    @Autowired
    private ContinenteServiceimpl continenteService;

    @PostMapping
    public ResponseEntity<ContinenteDTO> save(@RequestBody ContinenteDTO continente) {

        ContinenteDTO continenteGuardado = continenteService.save(continente);
        return ResponseEntity.status(HttpStatus.CREATED).body(continenteGuardado);
    }

    @GetMapping
    public ResponseEntity<List<ContinenteEntity>> getAll() {
        List<ContinenteEntity> continente = continenteService.getAllcontinentes();
        return ResponseEntity.status(HttpStatus.OK).body(continente);
    }
}
