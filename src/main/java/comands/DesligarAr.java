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
public class DesligarAr implements Command{
    private ArCondicionado ar;

    public DesligarAr(ArCondicionado ar) {
        this.ar = ar;
    }
    
    @Override
    public void execute() {
        ar.desligarAr();
    }
    
}
