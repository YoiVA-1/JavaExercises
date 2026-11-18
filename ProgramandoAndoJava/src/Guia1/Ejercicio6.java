package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public void ClasificarNota() {
        String entrada = JOptionPane.showInputDialog(null, "Ingresa su nota del 0 al 100: ");
        int nota = Integer.parseInt(entrada);

        if (nota > 89 && nota < 100) {
            JOptionPane.showMessageDialog(null, "Excelente");
        }else if (nota > 79 && nota <= 89 ) {
            JOptionPane.showMessageDialog(null, "Bueno");
        }else if (nota > 69 && nota <= 79 ) {
            JOptionPane.showMessageDialog(null, "Aceptable");
        }else if (nota > 59 && nota <= 69 ) {
            JOptionPane.showMessageDialog(null, "insuficiente");
        }else if (nota >= 0  && nota < 60 ) {
            JOptionPane.showMessageDialog(null, "Reprobado");
        }else{
            JOptionPane.showMessageDialog(null, "valor invalido. Ingrese un valor entre 0 y 100");
        }
    }
}