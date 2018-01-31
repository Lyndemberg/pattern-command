/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comands;

import model.ArCondicionado;

/**
 *
 * @author lyndemberg
 */
public class LigarAr implements Command{
    private ArCondicionado ar;
    private int temp;

    public LigarAr(ArCondicionado ar,int temperatura) {
        this.ar = ar;
        this.temp = temperatura;
    }
    
    @Override
    public void execute() {
        ar.ligarAr(temp);
    }
    
}
