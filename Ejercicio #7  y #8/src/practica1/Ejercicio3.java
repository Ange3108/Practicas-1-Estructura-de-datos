package practica1;

import java.util.Scanner;

/**
 *
 * @author Nancy
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * 3-	Palíndromo Crea un método recursivo en Java que determine si una
         * cadena es un palíndromo (se lee igual de izquierda a derecha que de
         * derecha a izquierda)
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra o frase para verificar si es palindromo: ");
        String palabra = scanner.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es Palidromo");
        }
        scanner.close();
    }

    public static boolean esPalindromo(String texto) {
        String cadenaLimpia = texto.replaceAll("\\s+", "").toLowerCase();
        return verificarPalindromo(cadenaLimpia, 0, cadenaLimpia.length() - 1);
    }

    private static boolean verificarPalindromo(String texto, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        }
        if (texto.charAt(inicio) != texto.charAt(fin)) {
            return false;
        }
        return verificarPalindromo(texto, inicio + 1, fin - 1);
    }
}


