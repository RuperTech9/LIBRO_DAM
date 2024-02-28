
package tema8.ejemplos.instrumento;

import tema8.ejemplos.instrumento.Instrumento.Nota;



/**
 *
 * @author Ruper
 */
public class PianoMAIN {
    public static void main(String[] args) {
	Piano p = new Piano();
        
        Nota cancion[] = {Nota.DO, Nota.SI, Nota.SOL, Nota.RE, Nota.FA};
	for (Nota nota:cancion) {
            p.add(nota);
	}
        
        System.out.println("Interpretando la melodía con el piano:");
	p.interpretar();
    }
}
