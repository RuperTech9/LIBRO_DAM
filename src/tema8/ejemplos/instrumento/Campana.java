
package tema8.ejemplos.instrumento;

/**
 *
 * @author Ruper
 */
public class Campana extends Instrumento {
    // CONSTRUCTOR
    public Campana() {
        super(); // Llama al constructor de la superclase Instrumento
    }
    
    // Implementación del método interpretar para la Campana
    @Override
    public void interpretar() {
        for (Nota nota : melodia) { // Recorre las notas de la melodía
            switch (nota) { // Según la nota, imprime su sonido correspondiente
                case DO:
                    System.out.println("Campana toca: dooong");
                    break;
                case RE:
                    System.out.println("Campana toca: reeeeng");
                    break;
                case MI:
                    System.out.println("Campana toca: miiiiing");
                    break;
                case FA:
                    System.out.println("Campana toca: faaaaang");
                    break;
                case SOL:
                    System.out.println("Campana toca: sooooolng");
                    break;
                case LA:
                    System.out.println("Campana toca: laaaaang");
                    break;
                case SI:
                    System.out.println("Campana toca: siiiiing");
                    break;
            }
        }
        System.out.println(""); // Imprime una línea en blanco al final de la interpretación
    }
}