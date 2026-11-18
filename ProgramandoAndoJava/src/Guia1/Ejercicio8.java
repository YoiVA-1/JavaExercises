package Guia1;

import javax.swing.JOptionPane;

//Solicite el valor de una compra y aplique descuento: >$500.000 = 20%,
//  >$200.000 = 15%, >$100.000 = 10%. Mostrar valor original, descuento y total.
public class Ejercicio8 {

    public void CalculoVentas() {
        String entrada = JOptionPane.showInputDialog(null, "Ingresa Un valor de Ventas: ");
        if (entrada == null) return;
        double Ventas = Double.parseDouble(entrada);

        if (Ventas > 500000) {
            JOptionPane.showMessageDialog(null, "Aplica Para Descuento el valor de Descuento es del 20%");
            JOptionPane.showMessageDialog(null, "El Valor de la venta es de " + Ventas);
            JOptionPane.showMessageDialog(null, "El Descuento es de " + (Ventas * 0.20));
            JOptionPane.showMessageDialog(null, "El total a pagar por la venta es de " + (Ventas - (Ventas * 0.20)));
        } else if (Ventas > 200000) {
            JOptionPane.showMessageDialog(null, "Aplica Para Descuento el valor de Descuento es del 15%");
            JOptionPane.showMessageDialog(null, "El Valor de la venta es de " + Ventas);
            JOptionPane.showMessageDialog(null, "El Descuento es de " + (Ventas * 0.15));
            JOptionPane.showMessageDialog(null, "El total a pagar por la venta es de " + (Ventas - (Ventas * 0.15)));

        }else if (Ventas > 100000) {
            JOptionPane.showMessageDialog(null, "Aplica Para Descuento el valor de Descuento es del 10%");
            JOptionPane.showMessageDialog(null, "El Valor de la venta es de " + Ventas);
            JOptionPane.showMessageDialog(null, "El Descuento es de " + (Ventas * 0.10));
            JOptionPane.showMessageDialog(null, "El total a pagar por la venta es de " + (Ventas - (Ventas * 0.10)));

        }else {
            JOptionPane.showMessageDialog(null, "No aplica para descuento ");
            JOptionPane.showMessageDialog(null, "El Total pagar por la venta "+Ventas);
        }

    }

}
