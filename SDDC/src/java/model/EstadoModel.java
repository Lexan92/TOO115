/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import entity.Estado;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EstadoModel {
    public List<Estado> getAll(){
            
    List<Estado> lst = new ArrayList<>();
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    try{
    s.beginTransaction();
    lst = s.createCriteria(Estado.class).list();
    s.getTransaction().commit();
}catch(Exception e){
    e.printStackTrace();
}
    return lst;
}
    
    //create
    public void create(Estado d)
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
     public void remove(Estado d)
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
      public void edit(Estado d)
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
      
      
      public Estado getDenuncia(BigDecimal id){
          
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       Estado d=new Estado();
        
        try {
            s.beginTransaction();
            d=(Estado) s.get(Estado.class,id);
            s.getTransaction().commit();

        } catch (Exception e) {

            e.printStackTrace();
            s.getTransaction().rollback();
        }
          
      
      return d;
      
      }

}
