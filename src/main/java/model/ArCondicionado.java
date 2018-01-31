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
public class ArCondicionado {
    private boolean ligado = false;
    private int temperatura;
    
    public void ligarAr(int temp){
        this.ligado = true;
        this.temperatura = temp;
        System.out.println("Você ligou o ar em "+ temp +" °C");
    }
    public void desligarAr(){
        this.ligado = false;
        System.out.println("Desligou o ar");
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
}
