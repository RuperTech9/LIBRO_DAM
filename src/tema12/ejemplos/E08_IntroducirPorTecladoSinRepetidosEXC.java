
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
public class E08_IntroducirPorTecladoSinRepetidosEXC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> conjunto = new HashSet<>();
        
        boolean datosCorrectos = false;
        do {
            try {
                // Pedir al usuario que introduzca 10 números
                for (int i = 0; i < 10; i++) {
                    System.out.print("Introduce un número: ");
                    int numero = sc.nextInt();
                    if (!conjunto.add(numero)) {
                        System.out.println("Error: El número ya ha sido introducido. Introduce otro.");
                        i--; // Retroceder un paso para volver a pedir el número
                    }
                }
                
                // Si no se produce ninguna excepción, marcar como datosCorrectos y salir del bucle
                datosCorrectos = true;
            } catch (Exception e) {
                // Capturar la excepción y mostrar un mensaje de error
                System.out.println("Error: Debes introducir un número entero.");
                // Limpiar el buffer del scanner
                sc.nextLine();
            }
        } while (!datosCorrectos);
        
        System.out.println("Lista original\n" + conjunto);
        
        Integer[] tabla = conjunto.toArray(new Integer[0]);
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