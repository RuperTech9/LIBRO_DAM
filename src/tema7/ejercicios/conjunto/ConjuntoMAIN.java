
package tema7.ejercicios.conjunto;

/**
 *
 * @author Ruper
 */
public class ConjuntoMAIN {
    public static void main(String[] args) {
        // Crear dos conjuntos
        Conjunto conjuntoA = new Conjunto();
        Conjunto conjuntoB = new Conjunto();

        // Añadir elementos al conjunto A
        conjuntoA.insertar(1);
        conjuntoA.insertar(2);
        conjuntoA.insertar(3);
        System.out.println("Conjunto A después de insertar 1, 2, 3:");
        conjuntoA.muestra();

        // Añadir elementos al conjunto B
        conjuntoB.insertar(3);
        conjuntoB.insertar(4);
        conjuntoB.insertar(5);
        System.out.println("Conjunto B después de insertar 3, 4, 5:");
        conjuntoB.muestra();

        // Intentar añadir elementos que ya existen en A
        System.out.println("Intentar insertar elementos existentes en A:");
        conjuntoA.insertar(2);
        conjuntoA.insertar(3);
        conjuntoA.muestra(); // Debería ser igual

        // Insertar conjunto B en conjunto A
        System.out.println("Insertar conjunto B en conjunto A:");
        conjuntoA.insertar(conjuntoB);
        conjuntoA.muestra(); // Debería mostrar 1, 2, 3, 4, 5

        // Eliminar elemento del conjunto A
        System.out.println("Eliminar elemento '3' del conjunto A:");
        conjuntoA.eliminarElemento(3);
        conjuntoA.muestra(); // Debería mostrar 1, 2, 4, 5

        // Verificar pertenencia de un elemento en A
        System.out.println("¿Pertenece el '4' al conjunto A? " + conjuntoA.pertenece(4)); // Debería ser true
        System.out.println("¿Pertenece el '6' al conjunto A? " + conjuntoA.pertenece(6)); // Debería ser false

        // Eliminar conjunto B de conjunto A
        System.out.println("Eliminar conjunto B de conjunto A:");
        conjuntoA.eliminarConjunto(conjuntoB);
        conjuntoA.muestra(); // Debería mostrar 1, 2

        // Mostrar el número de elementos del conjunto A
        System.out.println("Número de elementos en conjunto A: " + conjuntoA.numeroElementos()); // Debería ser 2
    }
}
