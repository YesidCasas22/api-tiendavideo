package org.yesidcasas.springboot.apitiendavideo.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tipodocumento")
@Data
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "tipo", nullable = true, length = 100)
    private String tipo;

    @Column(name = "ingles", nullable = true, length = 50)
    private String ingles;

    @Column(name = "sigla", nullable = true, length = 5)
    private String sigla;

}
