package com.sinensia.railes.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinensia.railes.model.Estacion;

public interface EstacionesDao extends JpaRepository<Estacion, Integer> {

    /**
     * Busca en BD todas las estaciones con la ubicación del parámetro.
     * 
     * @param ubicacion
     * @return listaEstaciones
     */
    List<Estacion> findAllByUbicacion(String ubicacion);

    /**
     * Busca en BD todas las estaciones con el nombre del parámetro.
     * 
     * @param nombreEstacion
     * @return estacion
     */
    Estacion findByNombreEstacion(String nombreEstacion);

}
