/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comands;

import model.Som;
import java.time.LocalDateTime;

/**
 *
 * @author lyndemberg
 */
public class DesligarSom implements Command{
    private Som som;

    public DesligarSom(Som som) {
        this.som = som;
    }
    
    @Override
    public void execute() {
        som.desligar(LocalDateTime.now());
    }
    
}
