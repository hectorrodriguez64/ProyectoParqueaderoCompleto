/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.adsi.jpa.sessions;

import co.edu.sena.adsi.jpa.entites.Puestos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author darkreaven
 */
@Stateless
public class PuestosFacade extends AbstractFacade<Puestos> {

    @PersistenceContext(unitName = "co.edu.sena.adsi.jpa_Parqueadero_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PuestosFacade() {
        super(Puestos.class);
    }
    
}
