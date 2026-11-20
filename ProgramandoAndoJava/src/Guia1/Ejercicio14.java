package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio14 {

    public void NumerosImparesContador() {
        String acumulador = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                acumulador += i + " ";
            }
        }

        JOptionPane.showMessageDialog(null, "numeros impar del 1 al 100: " + acumulador);
    }
}