package com.example.iconos.repository;

import com.example.iconos.entity.ContinenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinenteRepository  extends JpaRepository<ContinenteEntity, Long> {


}
