package org.yesidcasas.springboot.apitiendavideo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.yesidcasas.springboot.apitiendavideo.entidades.Empresa;
import org.yesidcasas.springboot.apitiendavideo.servicios.IEmpresaServicio;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaControlador {

    @Autowired
    private IEmpresaServicio iEmpresaServicio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Empresa> listar() {
        return iEmpresaServicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Empresa obtener(@PathVariable Long id) {
        return iEmpresaServicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{nombre}", method = RequestMethod.GET)
    public List<Empresa> buscar(@PathVariable String nombre) {
        return iEmpresaServicio.buscar(nombre);
    }

}
