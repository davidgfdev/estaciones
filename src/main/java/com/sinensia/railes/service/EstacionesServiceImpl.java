package com.sinensia.railes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.railes.dao.EstacionesDao;
import com.sinensia.railes.model.Estacion;

@Service
public class EstacionesServiceImpl implements EstacionesService {

    @Autowired
    EstacionesDao estacionesDao;

    /**
     * Devuelve una lista con todas las estaciones.
     * 
     * @return listaEstaciones
     */
    @Override
    public List<Estacion> estaciones() {
        return estacionesDao.findAll();
    }

    /**
     * Busca y devuelve una estación con el nombre especificado.
     * 
     * @param nombreEstacion
     * @return estacion | null
     */
    @Override
    public Estacion buscarEstacionPorNombre(String nombreEstacion) {
        return estacionesDao.findByNombreEstacion(nombreEstacion);
    }

    /**
     * Devuelve una lista con todas las estaciones de una ubicación.
     */
    @Override
    public List<Estacion> buscarEstacionesPorUbicacion(String ubicacion) {
        return estacionesDao.findAllByUbicacion(ubicacion);
    }

    /**
     * Añade una nueva estación a BD.
     * 
     * @param idEstacion
     * @param nombreEstacion
     * @param ubicacion
     */
    @Override
    public void altaEstacion(int idEstacion, String nombreEstacion, String ubicacion){
        Estacion estacion = new Estacion(idEstacion, nombreEstacion, ubicacion);
        estacionesDao.save(estacion);
    }
}
