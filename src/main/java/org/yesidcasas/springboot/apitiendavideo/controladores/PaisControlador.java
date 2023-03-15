package org.yesidcasas.springboot.apitiendavideo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.yesidcasas.springboot.apitiendavideo.entidades.Pais;
import org.yesidcasas.springboot.apitiendavideo.servicios.IPaisServicio;

import java.util.List;

@RestController
@RequestMapping("/paises")
public class PaisControlador {

    @Autowired
    private IPaisServicio iPaisServicio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Pais> listar() {
        return iPaisServicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Pais obtener(@PathVariable Long id) {
        return iPaisServicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{nombre}", method = RequestMethod.GET)
    public List<Pais> buscar(@PathVariable String nombre) {
        return iPaisServicio.buscar(nombre);
    }

}
