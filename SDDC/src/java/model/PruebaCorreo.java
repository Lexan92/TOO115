/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;


/**
 *
 * @author Alex
 */
public class PruebaCorreo {
    
    
public void nuevo() throws IOException{
    Mail m = new Mail();
    m.setTo("luis_grennby92@hotmail.com");
    m.setSubject("Prueba");
    m.setMessage("mensajeNuevo");
    m.SEND();
    
}
    
   
}
