package com.example.iconos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "pais")
@Getter
@Setter
public class PaisEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imagen;
    private String denominacion;

    @Column(name = "cant_habitantes")
    private Long cantidadHabitantes;


    private Long superficie;


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "continente_id", insertable = false, updatable = false)
    private ContinenteEntity continente;

    @Column(name = "continente_id", nullable = false)
    private  Long continenteId;

    @ManyToMany(
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})


    @JoinTable(
            name = "icon_pais",
            joinColumns = @JoinColumn(name = "pais_id"),
            inverseJoinColumns = @JoinColumn(name = "icon_id"))

    //icons es la misma tabla que icon_pais, pero con una columna extra para la relacion, en este caso pais_id
    //con icon_id es la columna de la tabla icon que se relaciona con la tabla pais
    //iconEntity en manyToMany es el objeto que se relaciona con la tabla pais debe ser igual a como se llama aqui "icons"
    private Set<IconEntity> icons = new HashSet<>();



}
