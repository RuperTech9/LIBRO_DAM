
package tema12.ejemplos;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


/**
 * Crear una lista de números enteros positivos introducidos por consola hasta que se introduzca uno negativo.
 * A continuación recorrer la lista y mostrar por pantalla los índices de los elementos de valor par, que será multiplicado por 100.
 * 
 * @author Ruper
 */
public class E09_ArrayListIndicesElementosPar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        System.out.println("Introducir número: ");
        Integer n = sc.nextInt();
        while (n>= 0){
            lista.add(n);
            System.out.println("Introducir un número: ");
            n = sc.nextInt();
        }
        System.out.println(lista);
        
        System.out.println("Índices de valores pares: ");
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i)%2 == 0) {
                System.out.println(i + " ");
                lista.set(i, lista.get(i) * 100);
            }
        }
        System.out.println("");
        System.out.println(lista);
    }
}
