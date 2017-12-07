package co.edu.sena.adsi.jpa.entites;

import co.edu.sena.adsi.jpa.entites.Carros;
import co.edu.sena.adsi.jpa.entites.Parqueadero;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-07T12:52:52")
@StaticMetamodel(Puestos.class)
public class Puestos_ { 

    public static volatile SingularAttribute<Puestos, Parqueadero> idParqueadero;
    public static volatile SingularAttribute<Puestos, Integer> numeroPuesto;
    public static volatile SingularAttribute<Puestos, Integer> id;
    public static volatile SingularAttribute<Puestos, Carros> carros;

}