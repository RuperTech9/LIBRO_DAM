
package tema7.ejercicios.cola;

import java.util.Arrays;

/**
 *
 * @author Ruper
 */
public class Lista {
    Integer [] tabla;
    
    public Lista(){
        tabla = new Integer[0];
    }
    
    void insertarPrincipio(Integer nuevo){
        tabla = Arrays.copyOf(tabla, tabla.length +1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length-1);
        tabla[0] = nuevo;
    }
    
    void insertarFinal(Integer nuevo) {
	tabla = Arrays.copyOf(tabla, tabla.length +1);
	tabla[tabla.length - 1] = nuevo;
    }
    
    void insertarFinal(Lista otraLista){
        int tamIni = tabla.length;
        tabla = Arrays.copyOf(tabla,tabla.length + otraLista.tabla.length);
        System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
    }
    
    void insertar(int posicion, Integer nuevo){
        tabla = Arrays.copyOf(tabla, tabla.length +1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
        tabla[posicion] = nuevo;
    }
    
    Integer eliminar(int indice){
        Integer eliminado = null;
        if(indice >=0 && indice < tabla.length){
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length; i++){
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length -1);
        }
        return eliminado;
    }
    
    /* get: le pasarémos un indice y nos devolverá el elemento correspondiente de la tabla sin modificarla. 
    * En el caso de que el índice no sea válido, devolverá null, con lo cual evitamos que el programa aborte.*/
    Integer get(int indice){
        Integer resultado = null;
        if (indice >= 0 && indice < tabla.length) { // indice válido
            resultado = tabla[indice];
        }
        return resultado;
    }
    
    //buscar
    int buscar(Integer claveBusqueda) {
	int indice = -1;
	for(int i = 0; i < tabla.length && indice == -1; i++) {
            if(tabla[i].equals(claveBusqueda)) {
		indice = i;
            }
	}
	return indice;
    }
    
    //numeroElementos: el nº de elementos de la lista es el nº de elementos de la tabla
    public int numeroElementos() {
	return tabla.length;
    }
    
    //mostrar
    public void mostrar() {
	System.out.println("Lista: " + Arrays.toString(tabla));
    }
	
    //Lista Concatenada
    static Lista concatena(Lista l1, Lista l2) {
	Lista resultado = new Lista();
	for (Integer e : l1.tabla) {
            resultado.insertarFinal(e);
	}
	for (Integer e : l2.tabla) {
            resultado.insertarFinal(e);
	}
	return resultado;
    }  
}
