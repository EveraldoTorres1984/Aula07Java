/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula07;

import javax.swing.JOptionPane;

/**
 *
 * @author torre
 */
public class Aluno {
    
    public void cadastrarAluno() {
        String a[] = new String[5];
        String m[] = {"Português", "Matemática", "Física", "História", "Geografia"};
        
        for (int i = 0; i < a.length; i++) {
            a[i] = JOptionPane.showInputDialog("Nome do Aluno: " + i);
            
        }
        for (String aluno : a) {
            System.out.println(aluno);
        }
        
    }

    public void atividade1() {
        String disc[] = {"Português", "Matemática", "Física", "História", "Geografia"};
        double nota[] = new double[5];
        String result = "";
        
        for (int i = 0; i < disc.length; i++) {
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota de " + disc[i]));
            result += disc[i] + ": " + nota[i] + "\n";
            
        }
        JOptionPane.showMessageDialog(null, result);
        
    }
    
}
