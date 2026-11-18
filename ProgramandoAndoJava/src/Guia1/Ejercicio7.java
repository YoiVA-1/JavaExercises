package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio7 {
        public void NumeroMayor(){
            String entrada1 = JOptionPane.showInputDialog(null, "Ingresa su primer numero: ");
            int num1 = Integer.parseInt(entrada1);
            
            String entrada2 = JOptionPane.showInputDialog(null, "Ingresa su segundo: ");
            int num2 = Integer.parseInt(entrada2);

            String entrada3 = JOptionPane.showInputDialog(null, "Ingresa su tercer: ");
            int num3 = Integer.parseInt(entrada3);

            if (num1 == num2 && num2 == num3) {
                JOptionPane.showMessageDialog(null, "los numeros son iguales");
            } else if (num1 == num2 && num1 > num3) {
                JOptionPane.showMessageDialog(null, "Empate entre el primer numero y el segundo. Mayor:" + num1);
            } else if (num1 == num3 && num1 > num2){
                JOptionPane.showMessageDialog(null, "Empate entre el primer numero y el tercero. Mayor:" + num1);
            } else if (num2 == num3 && num2 > num1){
                JOptionPane.showMessageDialog(null, "Empate entre el segundo numero y el tercero. Mayor:" + num2);
            } else if (num1 > num2 && num1 > num3){
                JOptionPane.showMessageDialog(null, "El mayor numero es el primero" + num1);
            } else if (num2 > num1 && num2 > num3){
                JOptionPane.showMessageDialog(null, "El mayor numero es el segundo" + num2);
            } else {
                JOptionPane.showMessageDialog(null, "El mayor numero es el tercero" + num3);
            }

        } 
}
