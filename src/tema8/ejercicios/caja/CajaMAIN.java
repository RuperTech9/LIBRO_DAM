
package tema8.ejercicios.caja;

/**
 *
 * @author Ruper
 */
public class CajaMAIN {
    public static void main(String[] args) {
        // Crear una caja con dimensiones en centímetros
        Caja cajaCm = new Caja(30, 50, 20, Caja.Unidad.CM);
        System.out.println("Volumen de la caja en metros cúbicos: " + cajaCm.getVolumen());
        
        // Establecer y mostrar la etiqueta de la caja
        cajaCm.setEtiqueta("Fragil - Manéjese con cuidado");
        System.out.println(cajaCm);
        
        // Crear una caja con dimensiones en metros
        Caja cajaM = new Caja(1, 2, 1, Caja.Unidad.M);
        System.out.println("Volumen de la caja en metros cúbicos: " + cajaM.getVolumen());
        cajaM.setEtiqueta("Contenido: Libros");
        System.out.println(cajaM);
    }
}
