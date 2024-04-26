package com.bici.trayecto.dataAcces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bici.trayecto.modelo.Trayecto;

@Repository
public interface TrayectoRepository extends JpaRepository <Trayecto, Integer> {

}
