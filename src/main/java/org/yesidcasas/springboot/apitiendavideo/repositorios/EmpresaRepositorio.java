package org.yesidcasas.springboot.apitiendavideo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.yesidcasas.springboot.apitiendavideo.entidades.Empresa;

import java.util.List;

@Repository
public interface EmpresaRepositorio extends JpaRepository<Empresa, Long> {

    @Query("SELECT e FROM Empresa e WHERE e.nombre like '%' || ?1 || '%'")
    List<Empresa> buscar(String nombre);

}
