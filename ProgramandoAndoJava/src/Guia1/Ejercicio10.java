package Guia1;

/*
Solicite peso (kg) y altura (m). Calcule IMC = peso / (altura * altura). 
Clasifique: <18.5 Bajo peso, 18.5-24.9 Normal, 25-29.9 Sobrepeso, >=30 Obesidad.
*/

import javax.swing.JOptionPane;

public class Ejercicio10 {

    public void CalcularIMC() {
        JOptionPane.showMessageDialog(null, "Ingreso al ejercicio 10 De La guia 1");

        String entradaPeso = JOptionPane.showInputDialog(null, "Ingrese su peso en Kg:");
        if (entradaPeso == null)
            return; 
        double peso = Double.parseDouble(entradaPeso);

        String entradaAltura = JOptionPane.showInputDialog(null, "Ingrese su Altura en M:");
        if (entradaAltura == null)
            return; 
        double altura = Double.parseDouble(entradaAltura);

        double IMC = peso / (altura * altura);
        
        if (IMC < 18.5) {
            JOptionPane.showMessageDialog(null, "Bajo peso\nSu IMC es: " + String.format("%.2f", IMC));
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            JOptionPane.showMessageDialog(null, "Normal\nSu IMC es: " + String.format("%.2f", IMC));
        } else if (IMC >= 25 && IMC <= 29.9) {
            JOptionPane.showMessageDialog(null, "Sobrepeso\nSu IMC es: " + String.format("%.2f", IMC));
        } else if (IMC >= 30) {
            JOptionPane.showMessageDialog(null, "Obesidad\nSu IMC es: " + String.format("%.2f", IMC));
        }
    }
}