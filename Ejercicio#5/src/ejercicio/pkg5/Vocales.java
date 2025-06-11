package ejercicio.pkg5;

import java.util.List;

/**
 *
 * @author angeg
 */
public class Vocales {

    private final List<String> vowels = List.of("a", "e", "i", "o", "u");

    public int cuentaVocales(String palabra, int indice) {
        palabra = palabra.toLowerCase();
        if (indice >= palabra.length()) {
            return 0;
        } else {
            String letra = String.valueOf(palabra.charAt(indice));
            if (vowels.contains(letra)) {
                return 1+ cuentaVocales(palabra, indice + 1);
                

            }else
                return cuentaVocales(palabra, indice + 1);
        }
    }
}
