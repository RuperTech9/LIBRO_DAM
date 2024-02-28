
package tema8.ejercicios.lista;

/**
 *
 * @author Ruper
 */
public class ListaMAIN {
    public static void main(String[] args) {
        Lista lista1 = new Lista();
        lista1.insertarFinal(1);
        lista1.insertarFinal(2);
        lista1.insertarFinal(3);

        Lista lista2 = new Lista();
        lista2.insertarFinal(1);
        lista2.insertarFinal(2);
        lista2.insertarFinal(3);

        System.out.println(lista1); // Usa el método toString()
        System.out.println(lista2); // Usa el método toString()
        
        // Comprobar si las dos listas son iguales
        System.out.println("¿Lista1 es igual a Lista2? " + lista1.equals(lista2));
        
        // Agregar un elemento a lista2 y comparar nuevamente
        lista2.insertarFinal(4);
        System.out.println("¿Lista1 es igual a Lista2 después de modificar Lista2? " + lista1.equals(lista2));
    }
}
