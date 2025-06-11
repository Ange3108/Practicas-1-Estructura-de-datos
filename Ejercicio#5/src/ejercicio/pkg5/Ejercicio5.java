package ejercicio.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author angeg
 */
public class Ejercicio5 {


    public static void main(String[] args) {
        Vocales v = new Vocales();
        String palabra= JOptionPane.showInputDialog("Ingre un texto");
        System.out.println("La cantidad de palabras en el texto es "+v.cuentaVocales(palabra, 0));
    }
    
}
