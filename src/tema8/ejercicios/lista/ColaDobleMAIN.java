
package tema8.ejercicios.lista;

/**
 *
 * @author Ruper
 */
public class ColaDobleMAIN {
    public static void main(String[] args) {
        ColaDoble colaDoble = new ColaDoble();
        
        // Encolar elementos al final de la cola
        colaDoble.encolar(1);
        colaDoble.encolar(2);
        colaDoble.encolar(3);
        
        // Encolar elemento al principio de la cola
        colaDoble.encolarPrincipio(0);
        
        // Mostrar la cola doble
        System.out.println("Cola doble actual:");
        System.out.println(colaDoble); // Usando toString
        
        // Desencolar elemento del final y mostrar la cola después de desencolar
        System.out.println("Desencolando del final:");
        Integer elementoDesencolado = colaDoble.desencolarFinal();
        System.out.println("Elemento desencolado del final: " + elementoDesencolado);
        System.out.println(colaDoble);
    }
}
