package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio12 {
    public void MostrarNumerosReversa() {
        String acumulador = "";

        for(int i = 50; i >= 1; i--){
            acumulador += i + " ";
        }

        JOptionPane.showMessageDialog(null,"numeros del 1 al 50: " + acumulador);
    } 
}