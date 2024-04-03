
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
    
}
