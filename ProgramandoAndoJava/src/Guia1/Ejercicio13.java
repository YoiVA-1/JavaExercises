package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio13 {

    public void NumerosParesContador() {
        String acumulador = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                acumulador += i + " ";
            }
        }

        JOptionPane.showMessageDialog(null, "numeros par del 1 al 100: " + acumulador);
    }
}
