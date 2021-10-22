package com.example.persona.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "domicilio")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Audited
public class Domicilio extends Base {

    @Column(name = "calle")
    private String calle;

    @Column(name="numero")
    private int numero;

    @ManyToOne(optional = false)//no puede ser nulo, una localidad puede estar en muchos domicilios
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}
