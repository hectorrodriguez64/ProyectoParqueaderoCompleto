/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.adsi.rest.services;

import co.edu.sena.adsi.jpa.entites.Puestos;
import co.edu.sena.adsi.jpa.sessions.PuestosFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author adsi1261718
 */
@Path("puestos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PuestosREST {

    @EJB
    private PuestosFacade puestosEJB;

    @GET
    public List<Puestos> findAll() {
        return puestosEJB.findAll();
    }

    @GET
    @Path("{id}")
    public Puestos findBye(
            @PathParam("nombre") String nombre) {
        return puestosEJB.find(nombre);

    }

    @POST
    public void create(Puestos puestos) {
        puestosEJB.create(puestos);
    }
}
