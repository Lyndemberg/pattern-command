/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author lyndemberg
 */
public class Som {
   private int volume;
    
    public void ligar(LocalDateTime time){
        System.out.println("Aparelho ligado em "+ time);
    }
    
    public void desligar(LocalDateTime time){
        System.out.println("Aparelho desligado em "+ time);
    }
    
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void aumentarVolume(){
        this.volume++;
    }
    
    public void diminuirVolume(){
        this.volume--;
    }
    
}
