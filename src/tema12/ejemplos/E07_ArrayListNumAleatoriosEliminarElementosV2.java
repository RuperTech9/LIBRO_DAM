
package tema12.ejemplos;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Igual que el ejercicio anterior pero usando métodos globales
 * 
 * @author Ruper
 */
public class E07_ArrayListNumAleatoriosEliminarElementosV2 {
    public static void main(String[] args){
        Collection<Integer> lista = new ArrayList<>(); // Admite repetidos
        for (int i = 0; i < 100; i++) {
            lista.add((int) (Math.random() * 10 + 1));
        }
        System.out.println("Lista original\n" + lista);
        
        // Igual que el ejercicio anterior pero usando métodos globales
        Collection<Integer> c = new ArrayList<>();
        c.add(5); // colección con un único elemento
        lista.removeAll(c); // elimina todas las ocurrencias de 5
        System.out.println("Lista sin 5\n" + lista);
    }
}