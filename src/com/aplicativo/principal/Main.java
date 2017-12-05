/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicativo.principal;

import com.aplicativo.telas.TelaPrincipal;

/**
 *
 * @author luis.assulfi
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Teste do sistema");
        System.out.println("Iniciando aplicacao");
        
        new TelaPrincipal().setVisible(true);
        
    }
    
}
