
package tema7.ejercicios.ecuacionSegundoGrado;

/**
 *
 * @author Ruper
 */
public class Main {

    public static void main(String[] args) {
        // Crear una instancia de EcuacionSegundoGrado con coeficientes para la ecuación ax^2 + bx + c = 0
        EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(1, -5, 6); // Ejemplo con la ecuación x^2 - 5x + 6 = 0

        // Mostrar el discriminante
        System.out.println("El discriminante de la ecuación es: " + ecuacion.getDiscriminante());

        // Comprobar si el discriminante es positivo y mostrar las raíces
        if (ecuacion.tieneRaicesReales()) {
            System.out.println("El discriminante es positivo. Las raíces son reales.");
            System.out.println(ecuacion.obtenerSoluciones());
        } else {
            System.out.println("El discriminante es negativo. Las raíces son complejas.");
        }
    }
}
