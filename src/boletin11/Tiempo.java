/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import javax.swing.JOptionPane;

/**
 *
 * @author junio
 */
public class Tiempo {

    public void CalcularTiempo() {
        long inicio;
        long fin;
        long comienzo;

        String frase;
        String fraseEscrita;

        comienzo = JOptionPane.showOptionDialog(null, "¿Quieres iniciar el programa?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        while (comienzo < 1) {
            frase = "A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática.";
            inicio = System.currentTimeMillis();
            fraseEscrita = JOptionPane.showInputDialog(null, "Escriba la siguiente frase" + "\n A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática.");

            while (frase.equals(fraseEscrita) != true) {
                fraseEscrita = JOptionPane.showInputDialog(null, "Escriba la siguiente frase" + "\n A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática.");
            }
            fin = System.currentTimeMillis();

            long calculoTotal = fin - inicio;
            JOptionPane.showMessageDialog(null, "Tardaches " + (calculoTotal / 1000) + " segundos en escribir a frase");
            break;
        }
    }
}
