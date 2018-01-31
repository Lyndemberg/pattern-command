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
public class LigarSom implements Command{
    private Som som;

    public LigarSom(Som som) {
        this.som = som;
    }
    
    @Override
    public void execute() {
        som.ligar(LocalDateTime.now());
    }
    
}
