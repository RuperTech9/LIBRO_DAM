
package tema8.ejercicios.lista;

/**
 *
 * @author Ruper
 */
public class ConjuntoMAIN {
    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto();
        
        // Intentar insertar elementos al conjunto
        conjunto.insertarFinal(1);
        conjunto.insertarFinal(2);
        conjunto.insertarFinal(3);
        conjunto.insertarFinal(2); // Este elemento no debería añadirse
        
        // Mostrar el conjunto
        System.out.println("Conjunto después de insertar elementos:");
        System.out.println(conjunto); // Usando toString
        
        // Intentar insertar otro elemento al principio
        conjunto.insertarPrincipio(0);
        conjunto.insertarPrincipio(1); // Este elemento no debería añadirse
        
        // Mostrar el conjunto de nuevo
        System.out.println("Conjunto después de insertar al principio:");
        System.out.println(conjunto); // Usando toString
        
        // Intentar insertar en una posición específica
        conjunto.insertar(1, 4); // Inserta el número 4 en la posición 1
        conjunto.insertar(2, 4); // Este elemento no debería añadirse
        
        // Mostrar el conjunto final
        System.out.println("Conjunto final:");
        System.out.println(conjunto); // Usando toString
        
        //--------------------------------------------------------------------------
        Conjunto conjunto1 = new Conjunto();
        conjunto1.insertarFinal(1);
        conjunto1.insertarFinal(2);
        conjunto1.insertarFinal(3);
        
        Conjunto conjunto2 = new Conjunto();
        conjunto2.insertarFinal(3);
        conjunto2.insertarFinal(1);
        conjunto2.insertarFinal(2);
        
        // Los conjuntos tienen los mismos elementos en diferente orden
        System.out.println("¿Conjunto1 es igual a Conjunto2? " + conjunto1.equals(conjunto2));
        
        Conjunto conjunto3 = new Conjunto();
        conjunto3.insertarFinal(4);
        conjunto3.insertarFinal(5);
        conjunto3.insertarFinal(6);
        
        // Conjuntos con elementos diferentes
        System.out.println("¿Conjunto1 es igual a Conjunto3? " + conjunto1.equals(conjunto3));
    }
}
