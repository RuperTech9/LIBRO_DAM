
package tema8.ejercicios.poligono;

/**
 *
 * @author Ruper
 */
public abstract class Poligono {
    protected double base;
    protected double altura;

    // Constructor para inicializar los atributos base y altura
    public Poligono(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método abstracto que será implementado por las subclases
    public abstract double area();
}
