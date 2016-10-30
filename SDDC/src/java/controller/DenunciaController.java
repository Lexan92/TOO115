/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;


import entity.Categoria;
import entity.Denuncia;
import entity.Denunciante;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import model.CategoriaModel;
import model.DenunciaModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;
import model.*;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class DenunciaController {
    
    @RequestMapping("index")
    public ModelAndView redireccion(){
        ModelAndView mv =new ModelAndView();
        mv.setView("index");
        return mv;
    }

    @RequestMapping(value="getAll.htm",method=RequestMethod.GET)
    public String getAll(Model m){
        //lista de categorias
        CategoriaModel model = new CategoriaModel();
        m.addAttribute("lst",model.getAll());
        return "index";
    }
    
    @RequestMapping(value="add",method=RequestMethod.POST)
    public String create(
    @ModelAttribute(value="Denuncia") Denuncia d,
    @ModelAttribute(value="Categoria") Categoria c,
    @ModelAttribute(value="name") String name)
    {
        //datos denuncia
        DenunciaModel dm = new DenunciaModel();
        Denuncia dd = new Denuncia();
        Denunciante e = new Denunciante();
        //datos categoria
        CategoriaModel cm = new CategoriaModel();
        Categoria cc = new Categoria();
        e.setNombreDenunciante(name);
        
        
        d=dm.getDenuncia(BigDecimal.ONE);
        
        
       return "redirect:index.htm";
    }
    
    public List<Categoria>Lista(){
         CategoriaModel model = new CategoriaModel();
        List<Categoria> l = new ArrayList<Categoria>();
        l = model.getAll();
        System.out.print("lista"+ l.lastIndexOf(l));
        return l;
    }
    
}
