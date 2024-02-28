
package tema7.ejercicios.colores;

/**
 *
 * @author Ruper
 */
public class ColoresMAIN {
    public static void main(String[] args) {
        Colores paleta = new Colores();
        paleta.agregarColor("turquesa"); // Agregar un nuevo color
        String[] coloresAleatorios = paleta.obtenerColoresAleatorios(5); // Obtener 5 colores aleatorios
        for (String color : coloresAleatorios) {
            System.out.println(color);
        }
    }
}
