
package tema12.ejemplos;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Programa en el que el usuario introduce por teclado 10 números y se almacenan en una colección.
 * Luego, se ordena la colección de menor a mayor y de mayor a menor.
 * 
 * Utiliza un HashSet para evitar elementos duplicados.
 * Maneja las posibles excepciones al introducir números por teclado.
 * 
 * @author Ruper
 */
public class E08_IntroducirPorTecladoEXC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Collection<Integer> lista = new HashSet<>();
        
        // int intentos = 3;
        boolean datosCorrectos = false;
        do {
            try {
                // Pedir al usuario que introduzca 10 números
                for (int i = 0; i < 10; i++) {
                    System.out.print("Introduce un número: ");
                    int numero = sc.nextInt();
                    lista.add(numero);
                }
                // Si no se produce ninguna excepción, marcar como datosCorrectos y salir del bucle
                datosCorrectos = true;
                
                // Si no se produce ninguna excepción, salir del bucle
                // break;
            } catch (Exception e) {
                // Capturar la excepción y mostrar un mensaje de error
                System.out.println("Error: Debes introducir un número entero.");
                // Reducir el número de intentos
                // intentos--;
                // Salto de línea
                sc.nextLine();
            }
            } while (!datosCorrectos);
            
        
            /*
            } while (intentos > 0);
        
        if (intentos == 0) {
            System.out.println("Número de intentos agotado. El programa terminará.");
            return;
        }*/
        
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