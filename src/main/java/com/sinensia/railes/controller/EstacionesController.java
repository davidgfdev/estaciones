package com.sinensia.railes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.railes.model.Estacion;
import com.sinensia.railes.service.EstacionesService;

@RestController
public class EstacionesController {
    
    @Autowired
    EstacionesService estacionesService;

    private static final String JSON_MEDIA_TYPE = MediaType.APPLICATION_JSON_VALUE;

    /**
     * Lista todas las estaciones.
     * GET.
     * 
     * @return listaEstaciones
     */
    @GetMapping(value = "estaciones", produces = JSON_MEDIA_TYPE)
    public List<Estacion> estaciones(){
        return estacionesService.estaciones();
    }

    /**
     * Busca y devuelve la estación con el mismo nombre.
     * GET.
     * 
     * @param estacionNombre
     * @return estacion | null
     */
    @GetMapping(value = "estacion/{estacionNombre}", produces = JSON_MEDIA_TYPE)
    public Estacion buscarEstacionPorNombre(@PathVariable String estacionNombre){

        if (estacionNombre.matches("[A-Za-z]+")){
            Estacion estacion = estacionesService.buscarEstacionPorNombre(estacionNombre);
            if (estacion != null){
                return estacion;
            }
        }
        
        return new Estacion(-1, "No se encontró la estación", "Error");
    }

    /**
     * Devuelve una lista con todas las estacines de la ubicación especificada.
     * GET.
     * 
     * @param ubicacion
     * @return listaEstaciones
     */
    @GetMapping(value = "estaciones/{ubicacion}")
    public List<Estacion> buscarEstacionesPorUbicacion(@PathVariable String ubicacion){
        return estacionesService.buscarEstacionesPorUbicacion(ubicacion);
    }
}
