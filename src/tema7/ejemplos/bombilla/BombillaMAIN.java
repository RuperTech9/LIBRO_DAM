
package tema7.ejemplos.bombilla;

/**
 *
 * @author Ruper
 */
public class BombillaMAIN {
    public static void main(String [] args){
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        
        b1.encender();
        b2.apagar();
        
        System.out.println("b1: " + b1.mostarEstado());
        System.out.println("b2: " + b2.mostarEstado());
        
        Bombilla.interruptorGeneral = false;
        System.out.println("Cortamos la luz general");
        
        System.out.println("b1: " + b1.mostarEstado());
        System.out.println("b2: " + b2.mostarEstado());
        
         Bombilla.interruptorGeneral = true;
        System.out.println("Activamos la luz general");
        
        System.out.println("b1: " + b1.mostarEstado());
        System.out.println("b2: " + b2.mostarEstado());
    }
}
