
package tema12.ejemplos;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Aplicación donde se insertan 100 números enteros aleatorios entre 1 y 10 (incluidos), que pueden estar repetidos, en una colección.
 * Después se eliminan todos los elementos que valen 5. Mostrar la colección antes y después de la eliminación.
 * 
 * @author Ruper
 */
public class E06_ArrayListNumAleatoriosEliminarElementos {
    public static void main(String[] args){
        Collection<Integer> lista = new ArrayList<>(); // Admite repetidos
        for (int i = 0; i < 100; i++) {
            lista.add((int) (Math.random() * 10 + 1));
        }
        System.out.println("Lista original\n" + lista);
        boolean eliminado = lista.remove(5);
        while(eliminado){
            eliminado = lista.remove(5);
        }
        System.out.println("Lista sin 5\n" + lista);
    }
}
