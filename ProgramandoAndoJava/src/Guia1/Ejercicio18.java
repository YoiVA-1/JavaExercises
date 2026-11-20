package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio18 {

    public void MostrarTablas() {
        for (int i = 1; i <= 10; i++) {
            String tabla = "=== Tabla del " + i + " ===\n";

            for (int j = 1; j <= 10; j++) {
                tabla += i + " x " + j + " = " + (i * j) + "\n";
            }

            JOptionPane.showMessageDialog(null, tabla + "Tabla del " + i);
        }
    }
}
