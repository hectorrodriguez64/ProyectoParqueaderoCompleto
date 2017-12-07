package co.edu.sena.adsi.jpa.entites;

import co.edu.sena.adsi.jpa.entites.Puestos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-07T10:46:35")
@StaticMetamodel(Parqueadero.class)
public class Parqueadero_ { 

    public static volatile SingularAttribute<Parqueadero, Double> tarifa;
    public static volatile SingularAttribute<Parqueadero, Integer> horaApertura;
    public static volatile ListAttribute<Parqueadero, Puestos> puestosList;
    public static volatile SingularAttribute<Parqueadero, Integer> id;
    public static volatile SingularAttribute<Parqueadero, Double> caja;
    public static volatile SingularAttribute<Parqueadero, Integer> horaCierre;
    public static volatile SingularAttribute<Parqueadero, Integer> horaActual;

}