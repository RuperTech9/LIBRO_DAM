
package tema7.ejercicios.marcarPagina;

/**
 *
 * @author Ruper
 */
public class MarcarPaginaMAIN {
    public static void main(String[] args) {
        // Crear objeto de la clase MarcarPagina
        MarcarPagina marcador = new MarcarPagina();
        
        // Mostrar la página actual
        System.out.println("Página actual: " + marcador.getPaginaActual());
        
        // Avanzar 3 páginas
        marcador.avanzarPagina();
        marcador.avanzarPagina();
        marcador.avanzarPagina();
        
        // Mostrar la página actual
        System.out.println("Página actual: " + marcador.getPaginaActual());
        
        // Retroceder 1 página
        marcador.volverPagina();
        
        // Mostrar la página actual
        System.out.println("Página actual: " + marcador.getPaginaActual());
        
        // Reiniciar la lectura
        marcador.reiniciarLectura();
        
        // Mostrar la página actual después de reiniciar la lectura
        System.out.println("Página actual después de reiniciar la lectura: " + marcador.getPaginaActual());
    }
}
