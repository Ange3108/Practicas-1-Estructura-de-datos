/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.combinaciones;
import javax.swing.*;

/**
 *
 * @author danie
 */
public class Combinaciones {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n:"));
        int k = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de k:"));

        if (k > n || k < 0) {
            JOptionPane.showMessageDialog(null, "k debe estar entre 0 y n.");
        } else {
            Combinador c = new Combinador();
            int resultado = c.combinar(n, k);
            JOptionPane.showMessageDialog(null, "C(" + n + ", " + k + ") = " + resultado);
        }
    }
}