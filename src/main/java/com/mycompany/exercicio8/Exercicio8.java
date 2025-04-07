/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio8;

/**
 *
 * @author andre
 */
import javax.swing.JOptionPane;
public class Exercicio8 {

    public static void main(String[] args) {
        int numero1, numero2, soma;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog( "Digite o primeiro numero:" ));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog( "Digite o segundo numero:" ));
        soma = numero1 + numero2;
        JOptionPane.showMessageDialog(null,"A soma é" + soma);
         
    }
}
