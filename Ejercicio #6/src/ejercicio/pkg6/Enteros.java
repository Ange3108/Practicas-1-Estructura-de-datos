
package ejercicio.pkg6;

import java.util.List;

/**
 *
 * @author angeg
 */
public class Enteros {


    public static int vueltaEnterosRecursivo(List<Integer> lista, int indice) {
        
        if (indice >= lista.size()) {
            return 0;
        } else {
            System.out.print(lista.get(indice) + " ");
            return vueltaEnterosRecursivo(lista, indice - 1);
        }
    }
}
