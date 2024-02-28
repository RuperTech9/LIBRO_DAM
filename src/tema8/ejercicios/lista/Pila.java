
package tema8.ejercicios.lista;


/**
 *
 * @author Ruper
 */
public class Pila extends Lista {
    
    public Pila() {
        super(); // Llama al constructor de la superclase Lista
    }
    
    public void apilar(Integer elemento) {
        super.insertarFinal(elemento); // Utiliza el método de Lista para insertar al final
    }
    
    public Integer desapilar() {
        if (super.numeroElementos() == 0) {
            throw new IllegalStateException("No se puede desapilar de una pila vacía.");
        }
        // Desapila el último elemento insertado (comportamiento LIFO)
        return super.eliminar(super.numeroElementos() - 1);
    }
    
    @Override
    public String toString() {
        return super.toString(); // Representación en cadena de la pila
    }
}
