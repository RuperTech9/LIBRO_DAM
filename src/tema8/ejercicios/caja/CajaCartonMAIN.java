
package tema8.ejercicios.caja;

/**
 *
 * @author Ruper
 */
public class CajaCartonMAIN {
    public static void main(String[] args) {
        // Crear una caja de cartón con dimensiones en centímetros
        CajaCarton cajaDeCarton = new CajaCarton(30, 50, 20);
        System.out.println("Volumen de la caja de cartón (80% del volumen real): " + cajaDeCarton.getVolumen() + " m³");
        System.out.println("Superficie total de cartón utilizada: " + cajaDeCarton.getSuperficieTotal() + " m²");
        System.out.println(cajaDeCarton);
    }
}
