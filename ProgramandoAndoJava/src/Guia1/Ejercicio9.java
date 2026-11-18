package Guia1;

import javax.swing.JOptionPane;

public class Ejercicio9 {
    public void Login(){
        String usuario = "admin";
        String contraseña = "1234";
        String entradaUsuario = JOptionPane.showInputDialog(null, "Ingresa Un valor de Ventas: ");
        String entradaContraseña = JOptionPane.showInputDialog(null, "Ingresa Un valor de Ventas: ");

        if (entradaUsuario.equals(usuario) && entradaContraseña.equals(contraseña)){
            JOptionPane.showMessageDialog(null, "Bienvenid@"); 
        }else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
        }
    }
}
