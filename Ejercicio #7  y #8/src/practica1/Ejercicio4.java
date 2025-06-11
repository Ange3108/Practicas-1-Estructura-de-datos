package practica1;

import java.util.Scanner;

/**
 *
 * @author Nancy
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * 4-	Contar Ocurrencias Crea un método recursivo en Java que cuente
         * cuántas veces aparece un carácter específico en una cadena.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra o frase: ");
        String texto = scanner.nextLine();

        System.out.print("Ingresa el caracter a contar: ");
        char caracter = scanner.next().charAt(0);

        int ocurrencias = contarCaracter(texto, caracter);
        System.out.println("\nResultado:");
        System.out.println("\nResultado:\nEl caracter *" + caracter + "* aparece " + ocurrencias + " veces en *" + texto + "*");
        
        scanner.close();
    }

    public static int contarCaracter(String texto, char caracter) {
        String textoLower = texto.toLowerCase();
        char caracterLower = Character.toLowerCase(caracter);
        return contarCaracterRecursivo(textoLower, caracterLower, 0);
        
    }

    private static int contarCaracterRecursivo(String texto, char caracter, int indice) {
        if (indice >= texto.length()) {
            return 0;

        }
        int suma = (texto.charAt(indice) == caracter) ? 1 : 0;
        return suma + contarCaracterRecursivo(texto, caracter, indice + 1);
    }
}
