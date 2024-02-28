
package tema7.ejercicios.punto;

/**
 *
 * @author Ruper
 */
public class PuntoMAIN {
    public static void main(String[] args) {
        Punto p1 = new Punto(1.0, 2.0);
        p1.muestra(); // Debe mostrar Punto(1.0, 2.0)

        p1.desplazaX(3.0);
        p1.muestra(); // Debe mostrar Punto(4.0, 2.0)

        p1.desplazaY(4.0);
        p1.muestra(); // Debe mostrar Punto(4.0, 6.0)

        p1.desplaza(-1.0, -3.0);
        p1.muestra(); // Debe mostrar Punto(3.0, 3.0)

        Punto p2 = new Punto(4.0, 4.0);
        System.out.println("Distancia euclidea: " + p1.distanciaEuclidea(p2)); // Debe mostrar la distancia euclídea entre p1 y p2
    }
}
