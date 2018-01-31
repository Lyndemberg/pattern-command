/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comands;

import model.Luz;

/**
 *
 * @author lyndemberg
 */
public class DesligarLuz implements Command{
    private Luz luz;

    public DesligarLuz(Luz luz) {
        this.luz = luz;
    }
    
    @Override
    public void execute() {
        luz.desligarLuz();
    }
    
}
