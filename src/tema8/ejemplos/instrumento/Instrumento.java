
package tema8.ejemplos.instrumento;

import java.util.Arrays;

/**
 *
 * @author Ruper
 */
public abstract class Instrumento {
    protected Nota[] melodia; 
    public enum Nota {DO, RE, MI, FA, SOL, LA, SI}
    
    // CONSTRUCTOR
    public Instrumento(){
        melodia = new Nota[0]; // tabla que almacena las notas
    }
    
    // METODOS
    void add(Nota n){
        melodia = Arrays.copyOf(melodia, melodia.length +1); // redimensionamos
        melodia[melodia.length - 1] = n; // insertamos el nuevo elemento al final
    }
    abstract void interpretar(); // a implementar en cada subclase 
}


