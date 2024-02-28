
package tema8.ejercicios.lista;

import java.util.NoSuchElementException;

/**
 *
 * @author Ruper
 */
public class Cola extends Lista {
    
    public Cola() {
        super(); // Llama al constructor de la superclase Lista
    }
    
    public void encolar(Integer elemento) {
        super.insertarFinal(elemento); // Utiliza el método de Lista para insertar al final
    }
    
    public Integer desencolar() {
        if (super.numeroElementos() == 0) {
            throw new NoSuchElementException("La cola está vacía");
        }
        // Desencola el primer elemento insertado (comportamiento FIFO)
        return super.eliminar(0);
    }
    
    @Override
    public String toString() {
        return super.toString(); // Representación en cadena de la cola
    }
}
