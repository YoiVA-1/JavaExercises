package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio15 {
    public void SumaCien() {
        int acumulador = 0;

        for(int i = 1; i <= 100; i++){
            acumulador += i;
        }

        JOptionPane.showMessageDialog(null,"Suma de los numeros del 1 al 100: " + acumulador);
    } 
}
