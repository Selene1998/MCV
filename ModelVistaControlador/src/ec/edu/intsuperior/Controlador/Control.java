/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import Vista.*;
import Vista.Vista;
/**
 *
 * @author DellPC
 */
public class Control implements ActionListener {
    Vista v=new Vista();
    Operacion o=new Operacion();
    public Control (Vista v, Operacion o){
        this.o=o;
        this.v=v;
        this.v.jButton1.addActionListener(this);
    }
    public void  iniciar(){
        v.setTitle("suma");
        v.setLocationRelativeTo(null);
        v.txtn1.setText(String.valueOf(o.getN1()));
        v.txtn2.setText(String.valueOf(o.getN2()));
        v.txtres.setText(String.valueOf(o.Sumar()));
        v.txtres1.setText(String.valueOf(o.Resta()));
        v.txtres2.setText(String.valueOf(o.Multiplicacion()));
        v.txtres3.setText(String.valueOf(o.Division()));
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        o.setN1(Integer.parseInt(v.txtn1.getText()));
        o.setN2(Integer.parseInt(v.txtn2.getText()));
        v.txtres.setText(String.valueOf(o.Sumar()));
        v.txtres1.setText(String.valueOf(o.Resta()));
        v.txtres2.setText(String.valueOf(o.Multiplicacion()));
        v.txtres3.setText(String.valueOf(o.Division()));
        
    }
    
    
}
