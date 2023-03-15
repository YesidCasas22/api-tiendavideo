package org.yesidcasas.springboot.apitiendavideo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.yesidcasas.springboot.apitiendavideo.entidades.Ciudad;
import org.yesidcasas.springboot.apitiendavideo.servicios.ICiudadServicio;

import java.util.List;

@RestController
@RequestMapping("/ciudades")
public class CiudadControlador {

    @Autowired
    private ICiudadServicio iCiudadServicio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Ciudad> list() {
        return iCiudadServicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Ciudad obtener(@PathVariable Long id) {
        return iCiudadServicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{nombre}", method = RequestMethod.GET)
    public List<Ciudad> buscar(@PathVariable String nombre) {
        return iCiudadServicio.buscar(nombre);
    }

}
