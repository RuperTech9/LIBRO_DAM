
package tema8.ejemplos.instrumento;

/**
 *
 * @author Ruper
 */
public class InstrumentoMAIN {
    public static void main(String[] args) {
        // Crear una instancia de Piano
        Piano piano = new Piano();
        // Añadir notas a la melodía del piano
        piano.add(Instrumento.Nota.DO);
        piano.add(Instrumento.Nota.RE);
        piano.add(Instrumento.Nota.MI);
        
        // Interpretar la melodía con el piano
        System.out.println("Interpretando la melodía con el piano:");
        piano.interpretar();
        
        // Crear una instancia de Campana
        Campana campana = new Campana();
        // Añadir notas a la melodía de la campana
        campana.add(Instrumento.Nota.FA);
        campana.add(Instrumento.Nota.SOL);
        campana.add(Instrumento.Nota.LA);
        
        // Interpretar la melodía con la campana
        System.out.println("Interpretando la melodía con la campana:");
        campana.interpretar();
    }
}
