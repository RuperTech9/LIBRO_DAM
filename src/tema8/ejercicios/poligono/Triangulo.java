
package tema8.ejercicios.poligono;

/**
 *
 * @author Ruper
 */
public class Triangulo extends Poligono {

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        return (base * altura) / 2; // Área del triángulo es base * altura / 2
    }
}
