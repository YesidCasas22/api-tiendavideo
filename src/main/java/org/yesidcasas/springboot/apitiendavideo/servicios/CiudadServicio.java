package org.yesidcasas.springboot.apitiendavideo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yesidcasas.springboot.apitiendavideo.entidades.Ciudad;
import org.yesidcasas.springboot.apitiendavideo.repositorios.CiudadRepositorio;

import java.util.List;

@Service
public class CiudadServicio implements ICiudadServicio{

    @Autowired
    private CiudadRepositorio ciudadRepositorio;

    @Override
    public List<Ciudad> listar() {
        return ciudadRepositorio.findAll();
    }

    @Override
    public Ciudad obtener(Long id) {
        return ciudadRepositorio.findById(id).get();
    }

    @Override
    public List<Ciudad> buscar(String nombre) {
        return ciudadRepositorio.buscar(nombre);
    }

}
