package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public void CalcularEntero() {
        String entrada = JOptionPane.showInputDialog(null, "Ingresa Un Numero Entero");
        int numero = Integer.parseInt(entrada);

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, numero + " es positivo");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, numero + " es negativo");
        } else {
            JOptionPane.showMessageDialog(null, numero + " es cero");
        }
    }
}
