
package tema7.ejercicios.colores;

import java.util.Random;

/**
 *
 * @author Ruper
 */
public class Colores {
    private String[] colores;
    private static final String[] coloresPorDefecto = {"rojo", "azul", "verde", "amarillo", "negro", "blanco", "morado", "rosa", "gris", "naranja"};
    
    public Colores() {
        colores = coloresPorDefecto.clone();
    }
    
    public void agregarColor(String color) {
        // Verificamos si el color ya existe en el array para evitar duplicados
        for (String c : colores) {
            if (c.equals(color)) {
                return; // El color ya existe en el array, no lo agregamos
            }
        }
        // Agregamos el nuevo color
        String[] nuevosColores = new String[colores.length + 1];
        System.arraycopy(colores, 0, nuevosColores, 0, colores.length);
        nuevosColores[colores.length] = color;
        colores = nuevosColores;
    }
    
    public String[] obtenerColoresAleatorios(int n) {
        if (n > colores.length) {
            throw new IllegalArgumentException("La cantidad de colores solicitados excede el número de colores disponibles.");
        }
        
        Random random = new Random();
        String[] resultado = new String[n];
        String[] coloresDisponibles = colores.clone();
        
        for (int i = 0; i < n; i++) {
            int indiceAleatorio = random.nextInt(coloresDisponibles.length - i);
            resultado[i] = coloresDisponibles[indiceAleatorio];
            // Eliminamos el color seleccionado del array de colores disponibles
            coloresDisponibles[indiceAleatorio] = coloresDisponibles[coloresDisponibles.length - 1 - i];
        }
        
        return resultado;
    }
}
