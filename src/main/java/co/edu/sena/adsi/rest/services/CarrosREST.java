package co.edu.sena.adsi.rest.services;

import co.edu.sena.adsi.jpa.entites.Carros;
import co.edu.sena.adsi.jpa.sessions.CarrosFacade;
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
@Path("carros")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CarrosREST {

    @EJB
    private CarrosFacade carrosEJB;

    @GET
    public List<Carros> findAll() {
        return carrosEJB.findAll();
    }

    @GET
    @Path("{id}")
    public Carros findBye(
            @PathParam("nombre") String nombre) {
        return carrosEJB.find(nombre);

    }

    @POST
    public void create(Carros carros) {
        carrosEJB.create(carros);
    }
}
