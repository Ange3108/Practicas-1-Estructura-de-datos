/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.combinaciones;

/**
 *
 * @author danie
 */
public class Combinador {

    public int combinar(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return combinar(n - 1, k - 1) + combinar(n - 1, k);
        }
    }
}

