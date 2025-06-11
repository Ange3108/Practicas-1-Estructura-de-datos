/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.suma_lista;
import javax.swing.*;

/**
 *
 * @author danie
 */
public class Suma_lista {

    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números desea sumar?"));
        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            String input = JOptionPane.showInputDialog("Ingrese el número #" + (i + 1));
            numeros[i] = Integer.parseInt(input);
        }

        SumaNumeros sn = new SumaNumeros();
        int resultado = sn.sumar(numeros, 0);

        JOptionPane.showMessageDialog(null, "La suma es: " + resultado);
    }
}