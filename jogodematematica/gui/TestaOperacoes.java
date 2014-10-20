/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.romulo.jogodematematica.gui;

import br.com.romulo.jogodematematica.controle.FabricaDeTabuada;
import java.util.ArrayList;

/**
 *
 * @author romulo
 */
public class TestaOperacoes {
   
    String operacao="+";
    int expressa;
    public static void main(String[] args) {
        
        ArrayList<Integer> n = new ArrayList<>();
        
        
        FabricaDeTabuada fab = new FabricaDeTabuada();
        
        
        //TESTE
        n.add(7);
        n.add(2);
        n.add(3);
                        
        //fab.gerarTabuadasSoma(n);
        
    }
}
