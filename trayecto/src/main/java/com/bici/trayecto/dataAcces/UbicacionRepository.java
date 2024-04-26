package com.bici.trayecto.dataAcces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bici.trayecto.modelo.Ubicacion;

@Repository
public interface UbicacionRepository extends JpaRepository <Ubicacion, Integer>{

}
