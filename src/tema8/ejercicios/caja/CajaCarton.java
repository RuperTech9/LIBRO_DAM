
package tema8.ejercicios.caja;

/**
 *
 * @author Ruper
 */
public class CajaCarton extends Caja {

    // Constructor de la clase CajaCarton
    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, Unidad.CM); // Llama al constructor de la superclase con las medidas en centímetros
    }

    // Método para obtener el 80% del volumen real de la caja en metros cúbicos
    public double getVolumen() {
        double volumenReal = super.getVolumen(); // Obtiene el volumen real en m³
        return volumenReal * 0.8; // Devuelve el 80% del volumen
    }

    // Método para calcular la superficie total del cartón utilizado para construir la caja
    public double getSuperficieTotal() {
        // Calcula la superficie total en centímetros cuadrados
        double superficie = 2 * ((ancho * alto) + (alto * fondo) + (ancho * fondo));
        return superficie / 10000; // Convierte a metros cuadrados
    }

    // Método toString que devuelve una cadena con la representación de la caja de cartón
    public String toString() {
        return "CajaCarton de " + ancho + "x" + alto + "x" + fondo + " cm, volumen al 80%: " + getVolumen() + " m³, superficie de cartón: " + getSuperficieTotal() + " m²";
    }
}