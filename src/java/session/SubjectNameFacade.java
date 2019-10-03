/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.SubjectName;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pupil
 */
@Stateless
public class SubjectNameFacade extends AbstractFacade<SubjectName> {

    @PersistenceContext(unitName = "JPTVR17WebScoolPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SubjectNameFacade() {
        super(SubjectName.class);
    }
    
}
