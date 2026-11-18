package Guia1;

import javax.swing.JOptionPane;

public class GuiaMain {

   public void Guia1() {
      int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Bienvenido a lista de ejercicios Guia 1 \n" +
                  "1.Ejercicios Estructuras Condicionales\n" +
                  "2.Ejercicios practicos: ciclos for, while y arreglos.\n" +
                  "Ingrese una opcion de Ejercicio\n"));

      if (opcion == 1) {
         opcion = Integer.parseInt(
               JOptionPane.showInputDialog(null,
                     "1.ejercicio Estructuras Condicionales \n " +
                           "Lista de Ejercicios \n" +
                           "1.Pida un numero entero al usuario e imprima si es Positivo, Negativo o Cero. Use if - else if - else.\n" +
                           "2.Solicite un numero entero y determine si es Par o Impar. Use el operador modulo (%).\n" +
                           "3. Pida la edad del usuario. Si es >= 18 mostrar 'Puede ingresar', si es menor 'Acceso denegado', si es negativa 'Edad invalida'.\n" +
                           "4. Solicite dos numeros y un operador (+, -, *, /). Realice la operacion con switch. Valide la division entre cero.\n" +
                           "5.Pida un anio y determine si es bisiesto. Reglas: divisible entre 4, no entre 100, excepto si es divisible entre 400. \n" +
                           "8.Solicite el valor de una compra y aplique descuento: >$500.000 = 20%, >$200.000 = 15%, >$100.000 = 10%. Mostrar valor original, descuento y total.\n" +
                           "10.Solicite peso (kg) y altura (m). Calcule IMC = peso / (altura * altura). Clasifique: <18.5 Bajo peso, 18.5-24.9 Normal, 25-29.9 Sobrepeso, >=30 Obesidad.\n"
                           +
                           "Ingrese una opcion\n" +
                           "\n" +
                           "\n" +
                           "\n" +
                           "\n" +
                           "\n" +
                           "\n")

         );

         if (opcion == 1) {
            Ejercicio1();
         }
         if (opcion == 2) {
            Ejercicio2();
         }
         if (opcion == 3) {
            Ejercicio3();
         }
         if (opcion == 4) {
            Ejercicio4();
         }
         if (opcion == 5) {
            Ejercicio5();
         }
         if (opcion == 8) {
            Ejercicio8();
         }
         if (opcion == 10) {
            Ejercicio10();
         }

      } else if (opcion == 2) {

         System.out.println("Ingrese una opcion ");

         opcion = Integer.parseInt(
               JOptionPane.showInputDialog(null,
                     "2.Ejercicios practicos: ciclos for, while y arreglos. \n " +
                           "17.Mostrar la tabla de multiplicar del numero 7 usando un ciclo for.\n" +
                           "21.Calcular el factorial de un numero almacenado en una variable usando un ciclo for\n" +
                           "27.Imprimir un cuadrado de 6x6 asteriscos usando ciclos for anidados.\n" +
                           "29.Recorrer una cadena de texto e imprimir cada caracter en una linea usando un ciclo for.\n"
                           +
                           "Ingrese una opcion\n" +
                           "\n" +
                           "\n" +
                           "\n" +
                           "\n" +
                           "\n" +
                           "\n")

         );

         if (opcion == 17) {
            JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 17");
            Ejercicio17();
         }
         if (opcion == 21) {
            JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 21");
            Ejercicio21();
         }
         if (opcion == 27) {
            JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 27");
            Ejercicio27();
         }
         if (opcion == 29) {
            JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 29");
            Ejercicio29();
         }

      } else {
         JOptionPane.showConfirmDialog(null, "Ingreso una opcion Invalidad");
      }

   }

   public void Ejercicio17() {
      Ejercicio17 TablaDel7 = new Ejercicio17();
      TablaDel7.TablaMultiplicarDel7();
   }

   public void Ejercicio21() {
      Ejercicio21 FactorialDeUnNumero = new Ejercicio21();
      FactorialDeUnNumero.FactorialDeUnNumero();
   }

   public void Ejercicio27() {
      Ejercicio27 cuadrado = new Ejercicio27();
      cuadrado.MostraFiguraCuadrada();
   }

   public void Ejercicio29() {
      Ejercicio29 ImprimirLetra = new Ejercicio29();
      ImprimirLetra.ImprimirLetrasDeUnString();
   }

   public void Ejercicio10() {
      Ejercicio10 IMC = new Ejercicio10();
      IMC.CalcularIMC();
   }

   public void Ejercicio5() {
      Ejercicio5 Bisiesto = new Ejercicio5();
      Bisiesto.CalcularAnioBisiesto();
   }

   public void Ejercicio8() {
      Ejercicio8 Ventas = new Ejercicio8();
      Ventas.CalculoVentas();
   }

   public void Ejercicio1() {
      Ejercicio1 Entero = new Ejercicio1();
      Entero.CalcularEntero();
   }

      public void Ejercicio2() {
      Ejercicio2 ParImpar = new Ejercicio2();
      ParImpar.CalcularParImpar();
   }

      public void Ejercicio3() {
      Ejercicio3 Edad = new Ejercicio3();
      Edad.verificarEdad();
   }

      public void Ejercicio4() {
      Ejercicio4 Operacion = new Ejercicio4();
      Operacion.Operaciones();
   }


}
