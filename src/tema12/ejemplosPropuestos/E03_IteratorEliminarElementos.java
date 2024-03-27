
package tema12.ejemplosPropuestos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Ruper
 */
public class E03_IteratorEliminarElementos {
    public static void main(String[] args){
        Collection<Integer> lista = new ArrayList<>(); // Admite repetidos
        for (int i = 0; i < 100; i++) {
            lista.add((int) (Math.random() * 10 + 1));
        }
        System.out.println("Lista original\n" + lista);
        
        Iterator<Integer> iterador = lista.iterator();
        while (iterador.hasNext()) {
            if (iterador.next() == 5) {
                iterador.remove();
            }
        }
        System.out.println("Lista sin 5 con iterador\n" + lista);
    }
}