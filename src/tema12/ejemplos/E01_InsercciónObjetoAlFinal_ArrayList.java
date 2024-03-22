
package tema12.ejemplos;

import java.util.ArrayList;

/**
 *
 * @author Ruper
 */
public class E01_InsercciónObjetoAlFinal_ArrayList {
    static <E> ArrayList<E> guardarAlFinal(E elem, ArrayList<E> lista) {
        ArrayList<E> nuevaLista = new ArrayList<>(lista);
        nuevaLista.add(elem);
        return nuevaLista;
    }

    public static void main(String[] args) {
        // Ejemplo 1
        // Lista original
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        // Elemento a añadir al final
        Integer nuevoNumero = 6;
        // Guardar el nuevo número al final de la lista
        ArrayList<Integer> numerosActualizados = guardarAlFinal(nuevoNumero, numeros);
        // Mostrar la lista original y la lista actualizada
        System.out.println("Lista original: " + numeros);
        System.out.println("Lista actualizada: " + numerosActualizados);
        
        // Ejemplo 2
        // Lista original
        ArrayList<String> cadenas = new ArrayList<>();
        cadenas.add("moto");
        System.out.println("Arreglo original: " + cadenas);
        // Añadir elementos al final
        cadenas = guardarAlFinal("coche", cadenas);
        cadenas = guardarAlFinal("avión", cadenas);
        // Mostrar el arreglo actualizado
        System.out.println("Arreglo actualizado: " + cadenas);
    }
}