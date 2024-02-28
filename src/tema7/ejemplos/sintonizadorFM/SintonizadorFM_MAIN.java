
package tema7.ejemplos.sintonizadorFM;

/**
 *
 * @author Ruper
 */
public class SintonizadorFM_MAIN {
    public static void main (String [] args){
        SintonizadorFM a = new SintonizadorFM(107);
        a.subir(); a.subir(); a.subir(); a.subir();
        a.display();
        
        SintonizadorFM b = new SintonizadorFM(80.5);
        b.bajar(); b.bajar(); b.bajar();
        b.display();
        
        SintonizadorFM c = new SintonizadorFM(200);
        c.display();
    }
    
}
