
package tema12.ejemplos;

import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class E01_InsercciónObjetoAlFinal {
    static <E> E[] guardar (E elem, E[] tabla){
        E[] nuevaTabla = Arrays.copyOf(tabla, tabla.length + 1);
        nuevaTabla[nuevaTabla.length - 1] = elem;
        return nuevaTabla;
    }
    
    public static void main(String[] args){
        
    }
}
