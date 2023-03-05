package org.yesidcasas.springboot.apitiendavideo.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table (name = "inventario")
@Data
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "consecutivo")
    private long consecutivo;

    @Column(name = "fechaadquisicion", nullable = true)
    private Date fechaAdquisicion;

    @Column(name = "activo")
    private boolean activo;

    @ManyToOne
    @JoinColumn(name = "idtitulo", referencedColumnName = "id")
    private Titulo titulo;

    @ManyToOne
    @JoinColumn(name = "idtecnologia", referencedColumnName = "id")
    private Tecnologia tecnologia;



}
