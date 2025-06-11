
package ejercicio.pkg6;

import java.util.List;

/**
 *
 * @author angeg
 */
public class Principal {

    public static void main(String[] args) {
        Enteros e= new Enteros();
         List<Integer> lista = List.of(1, 2, 3, 4, 5);
            System.out.println("Su lista inicial es" + lista);
         Enteros.vueltaEnterosRecursivo(lista, lista.size()-1);
          System.out.println("Su nueva lista es" + lista);
          
       
    }
    
}
