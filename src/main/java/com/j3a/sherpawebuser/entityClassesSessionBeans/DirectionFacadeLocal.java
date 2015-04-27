/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Direction;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface DirectionFacadeLocal {

    void create(Direction direction);

    void edit(Direction direction);

    void remove(Direction direction);

    Direction find(Object id);

    List<Direction> findAll();

    List<Direction> findRange(int[] range);

    int count();
    
}
