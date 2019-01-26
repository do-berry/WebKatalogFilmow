/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warstwa_integracjiORM;

import entities.Egzemplarz;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Dominika
 */
@Stateless
public class EgzemplarzFacade extends AbstractFacade<Egzemplarz> {

    @PersistenceContext(unitName = "WebKatalogFilmowPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EgzemplarzFacade() {
        super(Egzemplarz.class);
    }
    
}
