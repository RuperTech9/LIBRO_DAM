
package tema12.ejemplos;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementa un método estático que lleve a cabo la unión de dos conjuntos de elementos genéricos. 
 * La unión es un nuevo conjunto con todos los elementos que pertenezcan, al menos, a uno de los dos conjuntos.
 * Hacer lo mismo con la intersección, formada por los elementos comunes a los dos conjuntos.
 * 
 * 
 * @author Ruper
 */
public class E12_UnionInterseccion {
    static <E> Set<E> union(Set<E> conj1, Set<E> conj2){
        Set<E> resultado = new HashSet<>(conj1);
        resultado.addAll(conj2); //añadimos los elementos de conj2
        return resultado;
    }
    
    static <E> Set<E> interseccion(Set<E> conj1, Set<E> conj2){
        Set<E> interseccion = new HashSet<>(conj1);
        interseccion.retainAll(conj2); //borra todos los elementos de intersección salvo los que estén en conj2. Solo quedan los comunes a ambos conjuntos.
        return interseccion;
    }
    
    public static void main(String[] args) {
        // Crear conjuntos de ejemplo
        Set<Integer> conjunto1 = new HashSet<>();
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);
        
        Set<Integer> conjunto2 = new HashSet<>();
        conjunto2.add(3);
        conjunto2.add(4);
        conjunto2.add(5);

        // Probar la unión de los conjuntos
        Set<Integer> union = E12_UnionInterseccion.union(conjunto1, conjunto2);
        System.out.println("Unión de conjunto1 y conjunto2: " + union);

        // Probar la intersección de los conjuntos
        Set<Integer> interseccion = E12_UnionInterseccion.interseccion(conjunto1, conjunto2);
        System.out.println("Intersección de conjunto1 y conjunto2: " + interseccion);
    }
}
