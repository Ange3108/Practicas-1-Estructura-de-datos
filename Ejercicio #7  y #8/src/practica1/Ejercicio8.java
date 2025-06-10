/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import javax.swing.JOptionPane;

/**
 *
 * @author fabii
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*8-Multiplicación de Dos Números
        Escribe un método recursivo en Java que multiplique dos números enteros
        sin usar el operador de multiplicación.
        */
        
        int a =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        int b =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));

        int resultado = multiplicar(a, b);
        JOptionPane.showMessageDialog(null,"Resultado\n"+ a + " x " + b + " = " + resultado);
    }
   
    public static int multiplicar(int a, int b) {
        // Caso base: multiplicar por 0 es 0
        if (a==0 || b == 0) {
            return 0;
        }
       
        boolean negativo = false;

        if (a < 0) {
            negativo = !negativo;
            a = -a;
        }
        if (b < 0) {
            negativo = !negativo;
            b = -b;
        }

        int resultado = multiplicarPositivo(a, b);

        return negativo ? -resultado : resultado;
    }
       
    private static int multiplicarPositivo(int a, int b) {
        if (b == 1) {
            return a;
        }
        return a + multiplicarPositivo(a, b - 1);
    }
    
}
