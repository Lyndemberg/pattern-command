/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import comands.Command;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lyndemberg
 */
public class ControleGeral {
    private List<Command> botaoLigar = new ArrayList<>();
    private List<Command> botaoDesligar = new ArrayList<>();
    
    public void addCommandLigar(Command novo){
        this.botaoLigar.add(novo);
    }
    
    public void addCommandDesligar(Command novo){
        this.botaoDesligar.add(novo);
    }
    
    public void apertarLigar(){
        for(Command c : botaoLigar){
            c.execute();
        }
    }
    public void apertarDesligar(){
        for(Command c : botaoDesligar){
            c.execute();
        }
    }
}
