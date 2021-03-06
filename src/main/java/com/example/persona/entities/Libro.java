package com.example.persona.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "libro")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Audited
public class Libro extends Base{

    @Column(name = "titulo")
    private String titulo;
    @Column(name = "fecha")
    private int fecha;
    @Column(name = "genero")
    private String genero;
    @Column(name= "paginas")
    private int paginas;

    @ManyToMany(cascade = CascadeType.REFRESH)//nos aseguramos actualizar los autores si persistimos un libro
    private List<Autor> autores = new ArrayList<Autor>();
}
