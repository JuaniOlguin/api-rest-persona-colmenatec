package com.example.persona.entities;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Audited
public class Persona extends Base {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name="dni")
    private int dni;

    @OneToOne(cascade = CascadeType.ALL)//persistencia, actualizacion, eliminacion a traves de persona de su domicilio
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)//si borro una persona, se borran sus libros
    @JoinTable(//creo una tabla de relacion
        name = "persona_libro",
        joinColumns = @JoinColumn(name = "persona_id"),
        inverseJoinColumns = @JoinColumn(name = "libro_id")
    )
    private List<Libro> libros = new ArrayList<Libro>();
}
