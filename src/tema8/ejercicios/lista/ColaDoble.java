
package tema8.ejercicios.lista;

import java.util.NoSuchElementException;

/**
 *
 * @author Ruper
 */
public class ColaDoble extends Cola {
    
    public ColaDoble() {
        super(); // Llama al constructor de la superclase Cola
    }
    
    public void encolarPrincipio(Integer elemento) {
        super.insertarPrincipio(elemento); // Utiliza el método de Lista para insertar al principio
    }
    
    public Integer desencolarFinal() {
        if (super.numeroElementos() == 0) {
            throw new NoSuchElementException("La cola está vacía");
        }
        // Desencola el último elemento (comportamiento de cola doble)
        return super.eliminar(super.numeroElementos() - 1);
    }
    
    @Override
    public String toString() {
        return super.toString(); // Representación en cadena de la cola doble
    }
}
