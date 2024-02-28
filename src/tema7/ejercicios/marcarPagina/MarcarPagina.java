
package tema7.ejercicios.marcarPagina;

/**
 *
 * @author Ruper
 */
public class MarcarPagina {
    // ATRIBUTOS
    private int paginaActual;

    // CONSTRUCTORES
    public MarcarPagina() {
        // Inicializamos la paginaActual a 0 para empezar a leer el libro desde el principio
        paginaActual = 0;
    }

    // METODOS
    // Método para incrementar la página leída
    public void avanzarPagina() {
        paginaActual++;
    }
    
    // Método para incrementar la página leída
    public void volverPagina() {
        paginaActual--;
    }

    // Método para obtener información de la última página leída
    public int getPaginaActual() {
        return paginaActual;
    }

    // Método para comenzar desde el principio una nueva lectura del mismo libro
    public void reiniciarLectura() {
        paginaActual = 0;
    }
}
