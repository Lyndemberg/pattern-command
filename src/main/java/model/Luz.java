/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lyndemberg
 */
public class Luz {
    public boolean ligada = false;
    
    public void ligarLuz(){
        System.out.println("Ligou a luz");
        this.ligada = true;
    }
    
    public void desligarLuz(){
        System.out.println("Desligou a luz");
        this.ligada = false;
    }
}
