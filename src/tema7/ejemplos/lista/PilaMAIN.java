
package tema7.ejemplos.lista;

/**
 *
 * @author Ruper
 */
public class PilaMAIN {
    public static void main(String[] args) {
        Pila pila = new Pila();

        // Apilando elementos en la pila
        for (int i = 0; i < 10; i++) {
            pila.apilar(i);
        }

        // Mostrando elementos de la pila
        System.out.println("Pila después de apilar elementos:");
        pila.mostrar();

        // Desapilando elementos de la pila
        System.out.println("Desapilando elementos:");
        Integer num = pila.desapilar();
        while (num != null) {
            System.out.println(num + " ");
            num = pila.desapilar();
        }
    }
}