/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;


import java.util.Scanner;

/**
 *
 * @author fabii
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*7-Encontrar el Elemento Máximo
        Escribe un método recursivo en Java que encuentre el elemento máximo 
        en un arreglo de enteros.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantos numeros deseas ingresar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        System.out.println("Ingresa los numeros:");
        for (int i = 0; i < n; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("El numero maximo de la lista es: "+encontrarMax(numeros));
    }
    
    public static int encontrarMax(int [] arreglo) {
        return encontrarMaxRecursivo(arreglo, 0, arreglo[0]);
    }

    private static int encontrarMaxRecursivo(int [] arreglo, int indice, int maximoActual) {
        if (indice == arreglo.length) {
            return maximoActual;//caso base: lista sin valores
        } else {
             int nuevoMaximo=Math.max(maximoActual,arreglo[indice]); 
            return encontrarMaxRecursivo(arreglo, indice + 1, nuevoMaximo);
        }
    }
}



