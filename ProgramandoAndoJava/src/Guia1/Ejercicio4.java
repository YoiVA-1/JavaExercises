package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public void Operaciones() {
        String textoNumero1 = JOptionPane.showInputDialog(null, "Ingresa Tu Primer Numero ");
        int numero1 = Integer.parseInt(textoNumero1);

        String textoNumero2 = JOptionPane.showInputDialog(null, "Ingresa Tu Segundo Numero ");
        int numero2 = Integer.parseInt(textoNumero2);

        String operacion = JOptionPane.showInputDialog(null, "Ingrese La operacion deseada (+,-,*,/ )");

        switch (operacion) {
            case "+":
                JOptionPane.showMessageDialog(null, "La suma de los numeros es:" + (numero1 + numero2));
                break;
            case "-":
                JOptionPane.showMessageDialog(null, "La resta de los numeros es:" + (numero1 - numero2));
                break;
            case "*":
                JOptionPane.showMessageDialog(null, "La multiplicacion de los numeros es:" + (numero1 * numero2));
                break;
            case "/":
                if (numero2 != 0) {
                    JOptionPane.showMessageDialog(null, "La division de los numeros es: " + (numero1 / numero2));
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede dividir por cero");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operación no válida");
                break;
        }
    }
}
