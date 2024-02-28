
package tema8.ejercicios.lista;

import java.util.Arrays;

/**
 * En la implementación de la clase Conjunto que hereda de Lista, hemos sobrescrito los métodos insertarPrincipio, insertarFinal y insertar 
 * para evitar la inserción de elementos duplicados. 
 * Esto significa que antes de añadir un nuevo elemento al conjunto, se verifica si ya existe en la lista utilizando el método buscar. 
 * Si el elemento ya está presente (es decir, buscar devuelve un índice diferente de -1), no se permite su inserción y el método no realiza ninguna acción
 * 
 * @author Ruper
 */
public class Conjunto extends Lista {

    public Conjunto() {
        super(); // Llama al constructor de la superclase Lista
    }
    
    @Override
    public void insertarPrincipio(Integer nuevo) {
        if (this.buscar(nuevo) == -1) { // Comprueba si el elemento ya existe
            super.insertarPrincipio(nuevo); // Solo inserta si el elemento no existe
        }
    }
    
    @Override
    public void insertarFinal(Integer nuevo) {
        if (this.buscar(nuevo) == -1) { // Comprueba si el elemento ya existe
            super.insertarFinal(nuevo); // Solo inserta si el elemento no existe
        }
    }
    
    public void insertar(int posicion, Integer nuevo) {
        if (this.buscar(nuevo) == -1) { // Comprueba si el elemento ya existe
            super.insertar(posicion, nuevo); // Solo inserta si el elemento no existe
        }
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Conjunto otroConjunto = (Conjunto) obj;
        if (this.numeroElementos() != otroConjunto.numeroElementos()) return false;

        // Clonar y ordenar los arreglos para comparación
        Integer[] elementosDeEsteConjunto = this.tabla.clone();
        Integer[] elementosDelOtroConjunto = otroConjunto.tabla.clone();
        Arrays.sort(elementosDeEsteConjunto);
        Arrays.sort(elementosDelOtroConjunto);

        return Arrays.equals(elementosDeEsteConjunto, elementosDelOtroConjunto);
    }
}
