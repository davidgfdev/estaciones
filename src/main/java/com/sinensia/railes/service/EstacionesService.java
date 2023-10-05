package com.sinensia.railes.service;

import java.util.List;

import com.sinensia.railes.model.Estacion;

public interface EstacionesService {
    List<Estacion> estaciones();
    Estacion buscarEstacionPorNombre(String nombreEstacion);
    List<Estacion> buscarEstacionesPorUbicacion(String ubicacion);
}
