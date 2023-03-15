package org.yesidcasas.springboot.apitiendavideo.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tercero")
@Data
public class Tercero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "direccion", nullable = true, length = 100)
    private String direccion;

    @Column(name = "telefono", nullable = true, length = 20)
    private String telefono;

    @Column(name = "movil", nullable = true, length = 20)
    private String movil;

    @Column(name = "correo", nullable = true, length = 100)
    private String correo;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "documento", length = 50)
    private String documento;

    @Column(name = "tipopersona")
    private TipoPersona tipoPersona;

    @ManyToOne
    @JoinColumn(name = "idtipodocumento", referencedColumnName = "id")
    private TipoDocumento tipoDocumento;

    @ManyToOne
    @JoinColumn(name = "idciudad", referencedColumnName = "id")
    private Ciudad ciudad;

}
