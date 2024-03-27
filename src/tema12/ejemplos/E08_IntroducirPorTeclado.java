
package tema12.ejemplos;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Programa en el que el usuario introduce por teclado 10 números y se almacenan en una colección.
 * Luego, se ordena la colección de menor a mayor y de mayor a menor.
 * 
 * Utiliza un HashSet para evitar elementos duplicados.
 * 
 * @author Ruper
 */
public class E08_IntroducirPorTeclado {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Collection<Integer> lista = new HashSet<>();
        
        // Pedir al usuario que introduzca 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            int numero = sc.nextInt();
            lista.add(numero);
        }
        
        System.out.println("Lista original\n" + lista);
        
        Integer[] tabla = lista.toArray(new Integer[0]);
        Arrays.sort(tabla);
        Collection<Integer> listaCreciente = Arrays.asList(tabla);
        
        System.out.println("Lista de Menor a Mayor\n" + listaCreciente);
        
        
        Comparator<Integer> ordenDecreciente = new Comparator<>(){
            @Override
            public int compare(Integer e1, Integer e2){
                return e2 - e1;
            }
        };
        Arrays.sort(tabla, ordenDecreciente);
        Collection<Integer> listaDecreciente = Arrays.asList(tabla);
        
        System.out.println("Lista de Mayor a Menor\n" + listaDecreciente);
    }
}