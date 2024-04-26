package com.bici.trayecto.modelo;

import java.util.Date;
import java.util.List;

import javax.sound.midi.Sequence;
import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@ Data
@AllArgsConstructor
public class Trayecto {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)// Subrrogada
    Integer id;

    @Temporal(TemporalType.TIMESTAMP) // Guarda fecha y hora
    Date horaInicio;

    @Temporal(TemporalType.TIMESTAMP) // Guarda fecha y hora
    Date horaFin;
    
    Long distancia;
    
    Long duracion;
    
    Boolean enProceso;

    @OneToMany(mappedBy = "trayecto") // Nombre del atributo en correspondiente en la otra tabla
    List <Ubicacion> ubicaciones;
    

}
