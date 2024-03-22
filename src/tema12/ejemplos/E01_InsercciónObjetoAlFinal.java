
package tema12.ejemplos;

import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class E01_InsercciónObjetoAlFinal {
    static <E> E[] guardarAlFinal (E elem, E[] tabla){
        E[] nuevaTabla = Arrays.copyOf(tabla, tabla.length + 1);
        nuevaTabla[nuevaTabla.length - 1] = elem;
        return nuevaTabla;
    }
    
    public static void main(String[] args){
        
        System.out.println("EJEMPLO 1:");
        Integer[] numeros = {1, 2, 3, 4, 5};
        // Elemento a añadir al final
        Integer nuevoNumero = 6;
        // Guardar el nuevo número al final del arreglo
        Integer[] numerosActualizados = guardarAlFinal(nuevoNumero, numeros);
        // Mostrar el arreglo actualizado
        System.out.println("Arreglo original: " + Arrays.toString(numeros));
        System.out.println("Arreglo actualizado: " + Arrays.toString(numerosActualizados));
        
        System.out.println("EJEMPLO 2:");
        //String cadenas[] = new String [0]; // VACIO
        String[] cadenas = {"moto"};
        System.out.println("Arreglo original: " + Arrays.toString(cadenas));
        cadenas = guardarAlFinal("coche", cadenas);
        cadenas = guardarAlFinal("avión", cadenas);
        System.out.println("Arreglo actualizado: " + Arrays.toString(cadenas));
    }
}
