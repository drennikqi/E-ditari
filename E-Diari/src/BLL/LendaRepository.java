/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import Entities.Lenda;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author dreni
 */
public class LendaRepository extends EntMngClass implements LendaInterface {

    @Override
    public void create(Lenda d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.persist(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Lenda d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Lenda d) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(d);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Lenda> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Lenda.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Lenda findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT d FROM Lenda d WHERE d.id = :id");
            query.setParameter("id", ID);
            return (Lenda) query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg! \n" + e.getMessage());
        }
    }
    
}
