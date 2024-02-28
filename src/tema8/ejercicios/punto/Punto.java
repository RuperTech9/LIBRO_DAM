
package tema8.ejercicios.punto;

/**
 *
 * @author Ruper
 */
public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distancia(Punto otroPunto) {
        int dx = this.x - otroPunto.x;
        int dy = this.y - otroPunto.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    @Override
    public boolean equals(Object otroObjeto) {
        if (this == otroObjeto) {
            return true; // Son la misma instancia, son iguales
        }
        if (otroObjeto == null || getClass() != otroObjeto.getClass()) {
            return false; // El objeto no es de la misma clase o es nulo, no son iguales
        }
        Punto otroPunto = (Punto) otroObjeto; // Convertir el objeto en un Punto

        // Comprobar si las coordenadas X e Y son iguales
        return x == otroPunto.x && y == otroPunto.y;
    }
    
}
