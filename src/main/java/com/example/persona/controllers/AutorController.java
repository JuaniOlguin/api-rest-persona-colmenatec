package com.example.persona.controllers;

import com.example.persona.entities.Autor;
import com.example.persona.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*") //permitir el acceso a la api desde distintos clientes
@RequestMapping(path = "api/v1/autores") //la uri que necesitamos para acceder a los recursos, autores es el recurso en este caso
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{
}
