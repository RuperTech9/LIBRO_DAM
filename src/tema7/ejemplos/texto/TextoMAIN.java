
package tema7.ejemplos.texto;

/**
 *
 * @author Ruper
 */
public class TextoMAIN {
    public static void main (String [] args){
        Texto t = new Texto(25);
        t.añadirPrincipio("OTORRINO");
        t.añadirPrincipio("- ");
        t.añadirFinal("LARINGOLOGO");
        t.añadirFinal(" -");
        t.mostrar();
        System.out.println("\nEl número de vocales es: " + t.numVocales());
    }
    
}
