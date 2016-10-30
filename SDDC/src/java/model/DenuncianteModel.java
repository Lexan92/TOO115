/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import entity.Denunciante;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DenuncianteModel {
    
    public List<Denunciante> getAll(){
            
    List<Denunciante> lst = new ArrayList<>();
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    try{
    s.beginTransaction();
    lst = s.createCriteria(Denunciante.class).list();
    s.getTransaction().commit();
}catch(Exception e){
    e.printStackTrace();
}
    return lst;
}
    
    //create
    public void create(Denunciante d)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.save(d);
            s.getTransaction().commit();

        } catch (Exception e) {

            e.printStackTrace();
              s.getTransaction().rollback();
        }
    }
    
    //remove
     public void remove(Denunciante d)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.delete(d);
            s.getTransaction().commit();

        } catch (Exception e) {

            e.printStackTrace();
              s.getTransaction().rollback();
        }
    }
     
     
     
     //update
      public void edit(Denunciante d)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.update(d);
            s.getTransaction().commit();

        } catch (Exception e) {

            e.printStackTrace();
              s.getTransaction().rollback();
        }
    }
      
     // other funtion
      
      
      public Denunciante getDenuncia(BigDecimal id){
          
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       Denunciante d=new Denunciante();
        
        try {
            s.beginTransaction();
            d=(Denunciante) s.get(Denunciante.class,id);
            s.getTransaction().commit();

        } catch (Exception e) {

            e.printStackTrace();
            s.getTransaction().rollback();
        }
          
      
      return d;
      
      }
    

}
