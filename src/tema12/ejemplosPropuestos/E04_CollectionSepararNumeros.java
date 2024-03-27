
package tema12.ejemplosPropuestos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * Aplicación donde se piden por consola números reales hasta que se introduce un 0.
 * Los valores positivos se insertan en una colección y los negativos en otra.
 * Se muestran ambas colecciones y las sumas de los elementos de cada una de ellas.
 * Se eliminan de ambas colecciones todos los valores que sean mayores que 10 o menores de -10 y se vuelven a mostrar.
 * 
 * @author Ruper
 */
public class E04_CollectionSepararNumeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Collection<Double> positivos = new ArrayList<>();
        Collection<Double> negativos = new ArrayList<>();

        System.out.println("Introduce números reales (0 para terminar):");
        double numero = sc.nextDouble();
        while (numero != 0) {
            if (numero > 0) {
                positivos.add(numero);
            } else {
                negativos.add(numero);
            }
            numero = sc.nextDouble();
        }

        System.out.println("Números positivos:");
        mostrarColeccion(positivos);
        System.out.println("Suma de los números positivos: " + sumarColeccion(positivos));

        System.out.println("Números negativos:");
        mostrarColeccion(negativos);
        System.out.println("Suma de los números negativos: " + sumarColeccion(negativos));

        eliminarValoresExcedentes(positivos);
        eliminarValoresExcedentes(negativos);

        System.out.println("Números positivos después de la eliminación:");
        mostrarColeccion(positivos);

        System.out.println("Números negativos después de la eliminación:");
        mostrarColeccion(negativos);
    }

    private static void mostrarColeccion(Collection<Double> coleccion) {
        for (Double elemento : coleccion) {
            System.out.println(elemento);
        }
    }

    private static double sumarColeccion(Collection<Double> coleccion) {
        double suma = 0;
        for (Double elemento : coleccion) {
            suma += elemento;
        }
        return suma;
    }

    private static void eliminarValoresExcedentes(Collection<Double> coleccion) {
        coleccion.removeIf(valor -> valor > 10 || valor < -10);
    }
}
