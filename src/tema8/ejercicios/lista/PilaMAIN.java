
package tema8.ejercicios.lista;

/**
 *
 * @author Ruper
 */
public class PilaMAIN {
    public static void main(String[] args) {
        Pila pila = new Pila();
        
        // Apilar elementos en la pila
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        
        // Mostrar la pila
        System.out.println("Pila actual:");
        System.out.println(pila); // Usando toString
        
        // Desapilar elementos y mostrar la pila después de cada desapilada
        System.out.println("Desapilando elementos:");
        while (pila.numeroElementos() > 0) {
            Integer elemento = pila.desapilar();
            System.out.println("Elemento desapilado: " + elemento);
            System.out.println(pila);
        }
    }
}
