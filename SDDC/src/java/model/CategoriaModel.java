/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import entity.Categoria;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Controller
public class CategoriaModel {
    
    @RequestMapping()
    public List<Categoria> getAll(){
            
    List<Categoria> lst = new ArrayList<Categoria>();
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    try{
    s.beginTransaction();
    lst = s.createCriteria(Categoria.class).list();
    s.getTransaction().commit();
}catch(Exception e){
    e.printStackTrace();
}
    return lst;
}
    
    //create
    public void create(Categoria d)
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
     public void remove(Categoria d)
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
      public void edit(Categoria d)
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
      
      
      public Categoria getDenuncia(BigDecimal id){
          
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
       Categoria d=new Categoria();
        
        try {
            s.beginTransaction();
            d=(Categoria) s.get(Categoria.class,id);
            s.getTransaction().commit();

        } catch (Exception e) {

            e.printStackTrace();
            s.getTransaction().rollback();
        }
          
      
      return d;
      
      }

}
