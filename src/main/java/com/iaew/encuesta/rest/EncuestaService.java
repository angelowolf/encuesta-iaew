/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iaew.encuesta.rest;

import Persistencia.ORM.DAOImplementacion.EncuestaDAO;
import Persistencia.ORM.DAOInterface.IEncuesta;
import com.iaew.encuesta.model.Encuesta;
import com.iaew.encuesta.model.EncuestaRespuesta;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.log4j.Logger;

/**
 *
 * @author ang_2
 */
@Path("/")
public class EncuestaService {

    private static final Logger log = Logger.getLogger(EncuestaService.class);

    @POST
    @Path("/addEncuesta")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    @Consumes(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public EncuestaRespuesta meotdo(Encuesta encuesta) {
        log.info("encuesta recibida: " + encuesta.toString());
        IEncuesta encuestaDAO = new EncuestaDAO();
        if (encuestaDAO.buscar(encuesta.getEmail()) != null) {
            log.info("encuesta ya existe.");
            return new EncuestaRespuesta("Ya tiene asignada una encuesta.");
        } else {
            encuestaDAO.guardar(encuesta);
            log.info("encuesta guardada");
            return new EncuestaRespuesta("Encuesta recibida.");
        }
    }

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
    public Encuesta meotdo() {
        return new Encuesta(10, "angelo", "apellido", "432534354", "un comnetario", "angelowolf21@gmail.com", true, true, true);
    }

}
