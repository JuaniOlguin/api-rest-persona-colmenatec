package com.example.persona.services;

import com.example.persona.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable> {
    //todos los metodos principales con GET, POST, PUT, DELETE, para poder implementarla en todos los servicios que necesitemos
    public List<E> findAll() throws Exception; //trae lista de todas las entidades E de la db
    public Page<E> findAll(Pageable pageable) throws Exception;
    public E findById(ID id) throws Exception; //obtener persona de acuerdo al id
    public E save(E entity) throws Exception; //crear una entidad con el parametro
    public E update(ID id, E entity) throws Exception; //para actualizar con la entidad que llega por parametro
    public boolean delete(ID id) throws Exception; //borrar de la base de datos
}
