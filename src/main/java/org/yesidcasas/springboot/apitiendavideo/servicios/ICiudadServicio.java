package org.yesidcasas.springboot.apitiendavideo.servicios;

import org.yesidcasas.springboot.apitiendavideo.entidades.Ciudad;

import java.util.List;

public interface ICiudadServicio {

    public List<Ciudad> listar();

    public Ciudad obtener(Long id);

    public List<Ciudad> buscar(String nombre);

}
