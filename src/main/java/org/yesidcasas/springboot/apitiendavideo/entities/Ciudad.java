package org.yesidcasas.springboot.apitiendavideo.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table (name = "ciudad")
@Data
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_ciudad")
    @GenericGenerator(name = "secuencia_ciudad", strategy = "increment")
    @Column(name = "id")
    private long id;

    @Column(name = "ciudad", nullable = true, length = 100)
    private String ciudad;

    @ManyToOne
    @JoinColumn(name = "idregion", referencedColumnName = "id")
    private Region region;

}
