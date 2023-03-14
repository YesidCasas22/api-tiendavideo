package org.yesidcasas.springboot.apitiendavideo.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table (name = "alquiler")
@Data
public class Alquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "fechaprestamo")
    private Date fechaPrestamo;

    @Column(name = "fechadevolucion")
    private Date fechaDevolucion;

    @Column(name = "plazo")
    private int plazo;

    @Column(name = "precio")
    private double precio;

    @ManyToOne
    @JoinColumn(name = "idinventario", referencedColumnName = "id")
    private Inventario inventario;

    @ManyToOne
    @JoinColumn(name = "idtercero", referencedColumnName = "id")
    private Tercero tercero;

}
