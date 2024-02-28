
package tema7.ejemplos.bombilla;

/**
 *
 * @author Ruper
 */
public class Bombilla {
    // ATRIBUTOS
    public static boolean interruptorGeneral = true;
    public boolean interruptor; // estado que posee cada bombilla
    
    // CONSTRUCTOR
    public Bombilla (){
        interruptor = false;
    }
    
    // METODOS
    public void encender(){
        interruptor = true;
    }
    public void apagar(){
        interruptor = false;
    }
    public boolean estado(){
        return interruptorGeneral && interruptor;
    }
    public String mostarEstado() {
        return estado() ? "Encendida" : "Apagada";
    }
}
