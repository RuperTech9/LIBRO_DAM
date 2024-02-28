
package tema8.ejercicios.caja;

/**
 *
 * @author Ruper
 */
public class Caja {
    protected final int ancho;
    protected final int alto;
    protected final int fondo;
    protected final Unidad unidad;
    protected String etiqueta;

    // Enumeración para las unidades de medida de la caja
    public enum Unidad {
        CM, M
    }

    // Constructor de la clase Caja
    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
        this.etiqueta = ""; // Inicializar etiqueta vacía
    }

    // Método para obtener el volumen de la caja
    public double getVolumen() {
        double volumen = ancho * alto * fondo;
        // Convertir a metros cúbicos si es necesario
        if (unidad == Unidad.CM) {
            volumen /= 1000000.0; // Convertir cm³ a m³
        }
        return volumen;
    }

    // Método para establecer la etiqueta de la caja
    public void setEtiqueta(String etiqueta) {
        // Comprobar que la etiqueta no supere los 30 caracteres
        if (etiqueta.length() <= 30) {
            this.etiqueta = etiqueta;
        } else {
            System.out.println("Error: La etiqueta no puede tener más de 30 caracteres.");
        }
    }

    // Método para obtener una representación en cadena de la caja
    @Override
    public String toString() {
        return "Caja de " + ancho + "x" + alto + "x" + fondo + " " + unidad.name().toLowerCase() +
               ", etiqueta: " + etiqueta;
    }
}
