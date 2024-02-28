
package tema7.ejercicios.punto;

/**
 *
 * @author Ruper
 */
public class Punto {
    private double x;
    private double y;

    // Constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Método para desplazar en x
    public void desplazaX(double dx) {
        this.x += dx;
    }

    // Método para desplazar en y
    public void desplazaY(double dy) {
        this.y += dy;
    }

    // Método para desplazar en ambos componentes
    public void desplaza(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    // Método para calcular la distancia euclídea
    public double distanciaEuclidea(Punto otro) {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Método para mostrar la información del punto
    public void muestra() {
        System.out.println("Punto(" + x + ", " + y + ")");
    }
}
