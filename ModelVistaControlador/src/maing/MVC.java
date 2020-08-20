/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maing;
import ec.edu.intsuperior.Controlador.Control;
import Modelo.*;
import Vista.*;
import Vista.Vista;
/**
 *
 * @author DellPC
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Vista vis=new Vista();
        Operacion op=new Operacion();
        Control con=new Control(vis,op);
        
        vis.setVisible(true);
        vis.setLocationRelativeTo(null);
    }
    
}
