package org.yesidcasas.springboot.apitiendavideo.servicios;

import org.yesidcasas.springboot.apitiendavideo.entidades.Pais;

import java.util.List;

public interface IPaisServicio {

    public List<Pais> listar();

    public Pais obtener(Long id);

    public List<Pais> buscar(String nombre);

}
