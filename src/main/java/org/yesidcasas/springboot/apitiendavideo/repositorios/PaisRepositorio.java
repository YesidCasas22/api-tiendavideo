package org.yesidcasas.springboot.apitiendavideo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.yesidcasas.springboot.apitiendavideo.entidades.Pais;

import java.util.List;

@Repository
public interface PaisRepositorio extends JpaRepository<Pais, Long> {

    @Query("SELECT p FROM Pais p WHERE p.pais like '%' || ?1 || '%'")
    List<Pais> buscar(String nombre);

}
