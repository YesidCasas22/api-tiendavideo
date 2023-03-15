package org.yesidcasas.springboot.apitiendavideo.servicios;

import org.yesidcasas.springboot.apitiendavideo.entidades.Empresa;

import java.util.List;

public interface IEmpresaServicio {

    public List<Empresa> listar();

    public Empresa obtener(Long id);

    public List<Empresa> buscar(String nombre);

}
