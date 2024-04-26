package com.bici.trayecto.logica;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bici.trayecto.dataAcces.TrayectoRepository;
import com.bici.trayecto.dataAcces.UbicacionRepository;
import com.bici.trayecto.modelo.Trayecto;


// Controlador de Casos de Uso
// Tiene Métodos, uno por cada caso de uso
@Service
public class TrayectosServices {
    @Autowired
    TrayectoRepository trayecto;
    @Autowired
    UbicacionRepository ubicaciones;

    // Caso de Uso Iniciar Trayecto
    // 1). Actor Ingresa Ubicación Actual
    public Integer iniciarTrayecto(Double longitud, Double latitud)
        throws Exception
        {
            Date fechaActual = new Date();

            // Sistema almacena un nuevo trayecto con el nuevo ID 
            Trayecto trayecto = new Trayecto();
            trayecto.setHoraInicio(fetchfechaActual);
            
        }
    
}
