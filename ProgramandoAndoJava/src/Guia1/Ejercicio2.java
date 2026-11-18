package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public void CalcularParImpar() {
        String entrada = JOptionPane.showInputDialog(null, "Ingresa Un Numero");
        int numeroParImpar = Integer.parseInt(entrada);

        if (numeroParImpar % 2 == 0) {
            JOptionPane.showMessageDialog(null, numeroParImpar + " es un numero par");
        } else {
            JOptionPane.showMessageDialog(null, numeroParImpar + " es un numero impar");
        }
    }
}