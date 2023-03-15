package org.yesidcasas.springboot.apitiendavideo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yesidcasas.springboot.apitiendavideo.entidades.Pais;
import org.yesidcasas.springboot.apitiendavideo.repositorios.PaisRepositorio;

import java.util.List;

@Service
public class PaisServicio implements IPaisServicio {

    @Autowired
    PaisRepositorio paisRepositorio;

    @Override
    public List<Pais> listar() {
        return paisRepositorio.findAll();
    }

    @Override
    public Pais obtener(Long id) {
        return paisRepositorio.findById(id).get();
    }

    @Override
    public List<Pais> buscar(String nombre) {
        return paisRepositorio.buscar(nombre);
    }

}
