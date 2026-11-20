package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio17 {
    public void TablaMultiplicarDel7() {
        String resultado = "Ejercicio 17: Tabla de multiplicar del 7\n\n";

        for (int w = 1; w <= 10; w++) {
            resultado += "7 x " + w + " = " + (7 * w) + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}