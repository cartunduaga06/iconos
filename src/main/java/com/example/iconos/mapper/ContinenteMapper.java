package com.example.iconos.mapper;

import com.example.iconos.dto.ContinenteDTO;
import com.example.iconos.entity.ContinenteEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContinenteMapper {

    public ContinenteEntity continenteDTO2Entity(ContinenteDTO continenteDTO) {
        ContinenteEntity continenteEntity = new ContinenteEntity();
        continenteEntity.setImagen(continenteDTO.getImagen());
        continenteEntity.setDenominacion(continenteDTO.getDenominacion());
        return continenteEntity;
    }

    public ContinenteDTO continenteEntity2DTO(ContinenteEntity continenteEntity) {
        ContinenteDTO continenteDTO = new ContinenteDTO();
        continenteDTO.setId(continenteEntity.getId());
        continenteDTO.setImagen(continenteEntity.getImagen());
        continenteDTO.setDenominacion(continenteEntity.getDenominacion());
        return continenteDTO;
    }

    public List<ContinenteDTO> continenteEntityList2DTOList(List<ContinenteEntity> result) {
        List<ContinenteDTO> resultDTO = new ArrayList<>();
        for (ContinenteEntity continenteEntity : result) {
            ContinenteDTO continenteDTO = new ContinenteDTO();
            continenteDTO.setId(continenteEntity.getId());
            continenteDTO.setImagen(continenteEntity.getImagen());
            continenteDTO.setDenominacion(continenteEntity.getDenominacion());
            resultDTO.add(continenteDTO);
        }
        return resultDTO;
    }
}
