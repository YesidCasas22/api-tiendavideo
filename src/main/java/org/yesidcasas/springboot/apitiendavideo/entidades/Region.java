package org.yesidcasas.springboot.apitiendavideo.entidades;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "region")
@Data
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_region")
    @GenericGenerator(name = "secuencia_region", strategy = "increment")
    @Column(name = "id")
    private long id;

    @Column(name = "region", length = 100)
    private String region;

    @Column(name = "codigo", length = 5)
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    private Pais pais;

}
