package org.yesidcasas.springboot.apitiendavideo.entidades;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "pais")
@Data
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_pais")
    @GenericGenerator(name = "secuencia_pais", strategy = "increment")
    private long id;

    @Column(name = "pais", length = 100, unique = true)
    private String pais;

    @Column(name = "codigoalfa2", length = 5, nullable = true)
    private String codigoAlfa2;

    @Column(name = "codigoalfa3", length = 5, nullable = true)
    private String codigoAlfa3;

}
