
package tema7.ejemplos.hora;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class HoraMAIN {
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        Hora h1 = new Hora();
        System.out.println("Hora: ");
        int valor = teclado.nextInt();
        h1.setHora(valor);
        System.out.println("Minuto: ");
        valor = teclado.nextInt();
        h1.setMinuto(valor);
        System.out.println("Segundo: ");
        valor = teclado.nextInt();
        h1.setSegundo(valor);
        
        System.out.println("Cuántos segundos quiere avanzar: ");
        int numSegundos = teclado.nextInt();
        
        for (int i=0;i<=numSegundos; i++){
            System.out.println(h1.getHora()+":"+h1.getMinuto()+":"+h1.getSegundo());
            h1.incrementarSegundo();
        }
    }
}
