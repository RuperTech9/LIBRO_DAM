
package tema12.ejemplos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Aplicación que pida por consola números enteros no negativos hasta que se introduce -1. Los números se irán insertando en una colección, pudiéndose repetir.
 * Al terminar se mostrará la colección por pantalla. A continuación se mostrarán todos los valores pares.
 * Por último se eliminarán todos los múltiplos de 3 y se mostrará por pantalla la colección resultante
 * @author Ruper
 */
public class E04_CollectionParesQuitarMultiplosDe3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Collection<Integer> numeros = new ArrayList<>(); // Las listas permiten repetidos
        
        System.out.println("Introducir entero: ");
        Integer num = sc.nextInt();
        while(num >= 0){
            numeros.add(num);
            System.out.println("Introducir entero: ");
            num = sc.nextInt();
        }
        System.out.println("Lista completa: " + numeros);
        System.out.println("Pares: ");
        for (Integer a : numeros) {
            if (a % 2 == 0){
                System.out.println(a + " ");
            }
        }
        
        System.out.println("");
        for (Iterator<Integer> it = numeros.iterator();  it.hasNext();) {
            num = it.next();
            if (num % 3 == 0) { // Si es múltiplo de 3
                it.remove(); // Elimino el último valor devuelto por next()
            }
            
        }
        System.out.println("No múltiplos de 3: " + numeros);
    }
}
