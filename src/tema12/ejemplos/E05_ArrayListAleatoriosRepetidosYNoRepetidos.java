
package tema12.ejemplos;

import java.util.ArrayList;
import java.util.Collection;
/**
 * Aplicación en la que se insertan 20 números enteros aleatorios entre 1 y 10 (incluidos), que pueden estar repetidos, en una colección.
 * A continuación, se crea una lista con los mismos elementos sin repeticiones.
 * 
 * @author Ruper
 */
public class E05_ArrayListAleatoriosRepetidosYNoRepetidos {
    public static void main(String[] args){
        Collection<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random()*10 + 1));
        }
        System.out.println(lista);
        Collection<Integer> listaSinRepetidos = new ArrayList<>();
        for (Integer e : lista) {
            if (!listaSinRepetidos.contains(e)) {
                listaSinRepetidos.add(e);    
            }
        }
    }
}
