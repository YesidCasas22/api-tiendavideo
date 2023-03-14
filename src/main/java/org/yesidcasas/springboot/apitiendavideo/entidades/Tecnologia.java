package org.yesidcasas.springboot.apitiendavideo.entidades;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tecnologia")
@Data
public class Tecnologia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_tecnologia")
    @GenericGenerator(name = "secuencia_tecnologia", strategy = "increment")
    @Column(name = "id")
    private long id;

    @Column(name = "nombre", length = 50)
    private String nombre;

}
