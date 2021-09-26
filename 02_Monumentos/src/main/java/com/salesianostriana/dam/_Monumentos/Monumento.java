package com.salesianostriana.dam._Monumentos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Monumento {

    @Id
    @GeneratedValue
    private long Id;

    private String isoCode;
    private String paisNombre;
    private String nombreCiudad;
    private String localizacion;
    private String nombreMonumento;
    private String descripcion;
    private String foto;

    public Monumento(String isoCode, String paisNombre, String nombreCiudad, String localizacion, String nombreMonumento, String descripcion, String foto) {
        this.isoCode = isoCode;
        this.paisNombre = paisNombre;
        this.nombreCiudad = nombreCiudad;
        this.localizacion = localizacion;
        this.nombreMonumento = nombreMonumento;
        this.descripcion = descripcion;
        this.foto = foto;
    }
}
