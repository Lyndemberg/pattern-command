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
public class LigarLuz implements Command {
    private Luz luz;

    public LigarLuz(Luz luz) {
        this.luz = luz;
    }
    
    @Override
    public void execute() {
        luz.ligarLuz();
    }
    
}
