/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.suma_lista;

/**
 *
 * @author danie
 */
public class SumaNumeros {

    public int sumar(int[] arreglo, int indice) {
        if (indice == arreglo.length) {
            return 0;
        } else {
            return arreglo[indice] + sumar(arreglo, indice + 1);
        }
    }
}