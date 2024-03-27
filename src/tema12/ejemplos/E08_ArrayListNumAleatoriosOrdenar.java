
package tema12.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/**
 * Programa en el que se inserten 20 números aleatorios en una colección. Esta se ordenará de menor a mayor convirtiéndola en una tabla
 * y volviéndola a convertir en colección. Repetir el proceso para ordenarla de mayor a menor.
 * 
 * @author Ruper
 */
public class E08_ArrayListNumAleatoriosOrdenar {
    public static void main(String[] args){
        Collection<Integer> lista = new ArrayList<>(); // Admite repetidos
        for (int i = 0; i < 100; i++) {
            lista.add((int) (Math.random() * 10 + 1));
        }
        System.out.println("Lista original\n" + lista);
        
        Integer[] tabla = lista.toArray(new Integer[0]);
        Arrays.sort(tabla);
        Collection<Integer> listaCreciente = new ArrayList<>();
        listaCreciente.addAll(Arrays.asList(tabla));
        
        System.out.println("Lista de Menor a Mayor\n" + listaCreciente);
        
        
        Comparator<Integer> ordenDecreciente = new Comparator<>(){
            @Override
            public int compare(Integer e1, Integer e2){
                return e2 - e1;
            }
        };
        /* O bien
        Comparator<Integer> ordenEnteros = Comparator.naturalOrder();
        ordenDecreciente = ordenEnteros.reversed();
        */
        Arrays.sort(tabla, ordenDecreciente);
        Collection<Integer> listaDecreciente = new ArrayList<>();
        listaDecreciente.addAll(Arrays.asList(tabla));
        
        System.out.println("Lista de Mayor a Menor\n" + listaDecreciente);
    }
}