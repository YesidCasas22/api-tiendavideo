package org.yesidcasas.springboot.apitiendavideo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.yesidcasas.springboot.apitiendavideo.entidades.Ciudad;

import java.util.List;

public interface CiudadRepositorio extends JpaRepository<Ciudad, Long> {

    @Query("SELECT c FROM Ciudad c WHERE c.ciudad LIKE '%' || ?1 || '%'")
    List<Ciudad> buscar(String nombre);

}
