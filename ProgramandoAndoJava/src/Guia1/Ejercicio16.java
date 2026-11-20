package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio16 {

    public void SumaImpares() {
        int acumulador = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                acumulador += i;
            }
        }

        JOptionPane.showMessageDialog(null, "Suma de los numeros impares del 1 al 100: " + acumulador);
    }
}