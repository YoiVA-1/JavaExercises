package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public void verificarEdad() {
        String entrada = JOptionPane.showInputDialog(null, "Ingresa Tu Edad");
        int edad = Integer.parseInt(entrada);

        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Puede ingresar");
        } else if (edad < 0) {
            JOptionPane.showMessageDialog(null, "Edad invalida");
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado");
        }
    }
}
