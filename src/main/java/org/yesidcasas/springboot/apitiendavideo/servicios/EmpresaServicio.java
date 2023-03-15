package org.yesidcasas.springboot.apitiendavideo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yesidcasas.springboot.apitiendavideo.entidades.Empresa;
import org.yesidcasas.springboot.apitiendavideo.repositorios.EmpresaRepositorio;

import java.util.List;

@Service
public class EmpresaServicio implements IEmpresaServicio {

    @Autowired
    private EmpresaRepositorio empresaRepositorio;

    @Override
    public List<Empresa> listar() {
        return empresaRepositorio.findAll();
    }

    @Override
    public Empresa obtener(Long id) {
        return empresaRepositorio.findById(id).get();
    }

    @Override
    public List<Empresa> buscar(String nombre) {
        return empresaRepositorio.buscar(nombre);
    }

}
