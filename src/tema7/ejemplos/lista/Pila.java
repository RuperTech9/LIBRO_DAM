
package tema7.ejemplos.lista;


/**
 *
 * @author Ruper
 */
public class Pila {
    private Lista lista; //objeto donde almacenamos los datos
	public Pila() {
            lista = new Lista();
	}
	
	void apilar(Integer elemento) {
            lista.insertarFinal(elemento);
	}
	
	Integer desapilar() {
            return lista.eliminar(lista.tabla.length -1);
	}
	
	public void mostrar() {
            lista.mostrar();
	}
}
