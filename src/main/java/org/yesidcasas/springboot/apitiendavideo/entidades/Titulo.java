package org.yesidcasas.springboot.apitiendavideo.entidades;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "titulo")
@Data
public class Titulo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_titulo")
    @GenericGenerator(name = "secuencia_titulo", strategy = "increment")
    @Column(name = "id")
    private long id;

    @Column(name = "nombre", length = 100, unique = true)
    private String nombre;

    @Column(name = "protagonistas", length = 1000)
    private String protagonistas;

    @Column(name = "productor", length = 100)
    private String productor;

    @Column(name = "director", length = 100)
    private String director;

    @Column(name = "año")
    private int año;

    @Column(name = "precio")
    private double precio;

    @ManyToOne
    @JoinColumn(name = "idempresa", referencedColumnName = "id")
    private Empresa empresa;

}
