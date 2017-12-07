package co.edu.sena.adsi.rest.services;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author jonat
 */
@ApplicationPath("api")
public class AppConfig extends ResourceConfig {
    
    public AppConfig(){
        packages("co.edu.sena.adsi.jpa.rest.services");
    }
}
