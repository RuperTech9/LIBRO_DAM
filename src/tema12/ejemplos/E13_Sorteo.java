
package tema12.ejemplos;

import java.util.TreeSet;
import java.util.Random;
import java.util.Set;
import java.util.Scanner;

/**
 * Implementa la clase Sorteo con parámetros genéricos. Deberá guardar un conjunto de valores distintos de tipo genérico, suministrados por consola y será capaz de generar una combinación premiada de un tamaño predeterminado. 
 * Deberán implementarse, como mínimo, los métodos:
 * boolean add(T elemento), que añadirá un elemento nuevo al conjunto de valores posibles en una apuesta. Si el elemento se añade. devuelve true y. en caso contrario, debido a que ya estaba presente, false.
 * Set<T> premiados(int numPremiados), que devolverá una combinación ganadora de numPremiados elementos distintos
 * @author Ruper
 */
public class E13_Sorteo<T> {
    private Set<T> conjunto;

    public E13_Sorteo() {
        this.conjunto = new TreeSet<>();
    }

    public boolean add(T elemento) {
        return conjunto.add(elemento);
    }

    public Set<T> premiados(int numPremiados) {
        if (numPremiados > conjunto.size()) {
            throw new IllegalArgumentException("El número de premiados no puede ser mayor que el número de elementos en el conjunto");
        }

        Set<T> premiados = new TreeSet<>();
        Random random = new Random();
        T[] elementos = (T[]) conjunto.toArray();

        while (premiados.size() < numPremiados) {
            int index = random.nextInt(elementos.length);
            premiados.add(elementos[index]);
        }

        return premiados;
    }

    public static void main(String[] args) {
        E13_Sorteo<Integer> sorteo = new E13_Sorteo<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los elementos para el sorteo (Ingrese un número negativo para finalizar):");
        while (true) {
            int input = scanner.nextInt();
            if (input < 0) {
                break;
            }
            if (sorteo.add(input)) {
                System.out.println("Elemento añadido: " + input);
            } else {
                System.out.println("El elemento " + input + " ya está en el conjunto.");
            }
        }

        System.out.print("Ingrese el número de premiados: ");
        int numPremiados = scanner.nextInt();

        try {
            Set<Integer> premiados = sorteo.premiados(numPremiados);
            System.out.println("Combinación premiada: " + premiados);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}