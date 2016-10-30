/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import entity.Denuncia;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;


public class DenunciaModel {
    
    public List<Denuncia> getAll(){
            
    List<Denuncia> lst = new ArrayList<>();
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    try{
    s.beginTransaction();
    lst = s.createCriteria(Denuncia.class).list();
    s.getTransaction().commit();
}catch(Exception e){
    e.printStackTrace();
}
    return lst;
}
    
    //create
    public void create(Denuncia d)
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
     public void remove(Denuncia d)
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
      public void edit(Denuncia d)
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
      
      
      public Denuncia getDenuncia(BigDecimal id){
          
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       Denuncia d=new Denuncia();
        
        try {
            s.beginTransaction();
            d=(Denuncia) s.get(Denuncia.class,id);
            s.getTransaction().commit();

        } catch (Exception e) {

            e.printStackTrace();
            s.getTransaction().rollback();
        }
          
      
      return d;
      
      }
    
    
    
    
}
