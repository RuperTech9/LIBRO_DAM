
package tema5.ejemplos;

/**
 *
 * @author Ruper
 */
public class A17_ComparacionArrays {
    public static void main(String[] args) {
        int[] array1 = {7, 9, 20};
        int[] array2 = {7, 9, 20};

        // Comparación utilizando el operador ==
        boolean sonIgualesConIgualdadReferencial = (array1 == array2);

        // Imprimir resultado de la comparación de referencias
        System.out.println("¿array1 == array2? " + sonIgualesConIgualdadReferencial);

        // Comparación utilizando el método equals de la clase Arrays
        boolean sonIguales = java.util.Arrays.equals(array1, array2);

        // Imprimir resultado de la comparación de contenido
        System.out.println("¿array1 (EQUALS) array2? "+ sonIguales);
    }
}
