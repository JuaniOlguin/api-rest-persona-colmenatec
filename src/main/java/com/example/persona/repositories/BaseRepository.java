package com.example.persona.repositories;

import com.example.persona.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@NoRepositoryBean //no puedo crear instancias de esta interfaz
//base para todos los repositorios de nuestras entidades
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {
}
