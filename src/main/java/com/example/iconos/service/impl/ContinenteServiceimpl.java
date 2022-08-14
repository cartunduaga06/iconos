package com.example.iconos.service.impl;

import com.example.iconos.dto.ContinenteDTO;
import com.example.iconos.entity.ContinenteEntity;
import com.example.iconos.mapper.ContinenteMapper;
import com.example.iconos.repository.ContinenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinenteServiceimpl {


    @Autowired
    private ContinenteMapper continenteMapper;

    @Autowired
    private ContinenteRepository continenteRepository;

    public ContinenteDTO save(ContinenteDTO continente) {


        ContinenteEntity entity = continenteMapper.continenteDTO2Entity(continente);
        ContinenteEntity entityGuardada = continenteRepository.save(entity);
        ContinenteDTO result = continenteMapper.continenteEntity2DTO(entityGuardada);


        return result;
    }


    public List<ContinenteEntity> getAllcontinentes() {
        List<ContinenteEntity> result = continenteRepository.findAll();
        List<ContinenteDTO> resultDTO = continenteMapper.continenteEntityList2DTOList(result);
        return result;
    }
}
