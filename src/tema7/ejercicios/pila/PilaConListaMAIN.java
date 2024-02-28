
package tema7.ejercicios.pila;

/**
 *
 * @author Ruper
 */
public class PilaConListaMAIN {
    public static void main(String[] args) {
        PilaConLista pila = new PilaConLista();
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        pila.mostrar(); // Debe mostrar "Lista: [1, 2, 3]"

        System.out.println("Elemento desapilado: " + pila.desapilar()); // Debe mostrar "Elemento desapilado: 3"
        pila.mostrar(); // Debe mostrar "Lista: [1, 2]"
    }
}
