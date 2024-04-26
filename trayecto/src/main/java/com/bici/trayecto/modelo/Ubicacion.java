package com.bici.trayecto.modelo;

import java.util.Date;

import org.hibernate.annotations.ManyToAny;

import jakarta.annotation.Generated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ubicacion {
        // Atributos
        @Id
        @GeneratedValue(strategy=GenerationType.SEQUENCE)
        Integer id;

        @Temporal(TemporalType.TIMESTAMP) // Guarda fecha y hora
        Date hora;

        Double longitud;
        
        Double latitud;
        
        @ManyToOne
        Trayecto trayecto;

}
