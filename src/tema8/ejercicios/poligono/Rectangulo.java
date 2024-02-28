
package tema8.ejercicios.poligono;

/**
 *
 * @author Ruper
 */
public class Rectangulo extends Poligono {

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        return base * altura; // Área del rectángulo es base * altura
    }
}
