
package tema8.ejercicios.utilidades;

/**
 * El método esNumero utiliza el operador instanceof para verificar si el objeto es una instancia de la clase Number, 
 * que es la superclase de las clases envoltorio de tipos primitivos numéricos como Integer, Double, Long, Float, etc.
 * 
 * @author Ruper
 */
public class Utilidades {
    public static boolean esNumero(Object obj) {
        return obj instanceof Number;
    }

    public static void sumar(Object a, Object b) {
        if (esNumero(a) && esNumero(b)) {
            // Ambos objetos son numéricos, realizar la suma y mostrarla como Double
            double suma = ((Number) a).doubleValue() + ((Number) b).doubleValue();
            System.out.println(suma);
        } else if (a instanceof String && b instanceof String) {
            // Ambos objetos son cadenas, realizar la concatenación
            System.out.println(a + (String) b);
        } else {
            // En cualquier otro caso, no son sumables
            System.out.println("No sumables");
        }
    }
}
