/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import comands.DesligarAr;
import comands.DesligarLuz;
import comands.LigarAr;
import comands.LigarLuz;
import control.ControleGeral;
import model.ArCondicionado;
import model.Luz;
import model.Som;

/**
 *
 * @author lyndemberg
 */
public class App {
    public static void main(String[] args) {
        ControleGeral controle = new ControleGeral();
        Luz luz = new Luz();
        ArCondicionado ar = new ArCondicionado();
        Som som = new Som();
        
        controle.addCommandLigar(new LigarLuz(luz));
        controle.addCommandLigar(new LigarAr(ar,16));
        
        controle.apertarLigar();
        
        controle.addCommandDesligar(new DesligarLuz(luz));
        controle.addCommandDesligar(new DesligarAr(ar));
        
        controle.apertarDesligar();
    }
}
