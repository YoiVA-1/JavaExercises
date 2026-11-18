package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio11 {
    public void MostrarNumeros() {
        String acumulador = "";

        for(int i = 1; i <= 50; i++){
            acumulador += i + " ";
        }

        JOptionPane.showMessageDialog(null,"numeros del 1 al 50: " + acumulador);
    } 
}
