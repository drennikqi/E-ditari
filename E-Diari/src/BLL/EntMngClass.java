<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

/**
 *
 * @author dreni
 */

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public abstract class EntMngClass {
    EntityManager em = Persistence.createEntityManagerFactory("EditariPU").createEntityManager();
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

/**
 *
 * @author dreni
 */

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public abstract class EntMngClass {
    EntityManager em = Persistence.createEntityManagerFactory("EditariPU").createEntityManager();
}
>>>>>>> 2a9dc5b0fdcbca02e09aa18e600130d6de72e690
