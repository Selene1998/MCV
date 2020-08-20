/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author DellPC
 */
public class Operacion {
    int n1,n2;
    double res=0;
    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
    public Operacion(){
        n1=4;
        n2=4;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    public double Sumar(){
        return res=n1+n2;
    }
    public double Resta(){
        return res=n1-n2;
    }
    public double Multiplicacion(){
        return res=n1*n2;
    }
    public double Division(){
        return res=n1/n2;
    }

    
}
