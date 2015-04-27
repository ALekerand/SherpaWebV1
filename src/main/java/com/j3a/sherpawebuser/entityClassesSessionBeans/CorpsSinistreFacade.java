/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.CorpsSinistre;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author J3A-AFRIQUE
 */
@Stateless
public class CorpsSinistreFacade extends AbstractFacade<CorpsSinistre> implements CorpsSinistreFacadeLocal {
    @PersistenceContext(unitName = "com.j3a_SherpaWebUser_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CorpsSinistreFacade() {
        super(CorpsSinistre.class);
    }
    
}
