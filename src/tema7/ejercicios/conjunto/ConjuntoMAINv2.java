
package tema7.ejercicios.conjunto;

/**
 *
 * @author Ruper
 */
public class ConjuntoMAINv2 {
    public static void main(String[] args) {
        // Crear dos conjuntos
        Conjunto conjunto1 = new Conjunto();
        Conjunto conjunto2 = new Conjunto();

        // Añadir elementos a los conjuntos
        conjunto1.insertar(1);
        conjunto1.insertar(2);
        conjunto1.insertar(3);
        conjunto2.insertar(2);
        conjunto2.insertar(3);
        conjunto2.insertar(4);

        // Mostrar los conjuntos originales
        System.out.println("Conjunto 1:");
        conjunto1.muestra();
        System.out.println("Conjunto 2:");
        conjunto2.muestra();

        // Probar el método incluido
        boolean estaIncluido = Conjunto.incluido(conjunto1, conjunto2);
        System.out.println("¿Conjunto 1 está incluido en Conjunto 2? " + estaIncluido);

        // Probar el método union
        Conjunto union = Conjunto.union(conjunto1, conjunto2);
        System.out.println("Unión de Conjunto 1 y Conjunto 2:");
        union.muestra();

        // Probar el método interseccion
        Conjunto interseccion = Conjunto.interseccion(conjunto1, conjunto2);
        System.out.println("Intersección de Conjunto 1 y Conjunto 2:");
        interseccion.muestra();

        // Probar el método diferencia
        Conjunto diferencia = Conjunto.diferencia(conjunto1, conjunto2);
        System.out.println("Diferencia de Conjunto 1 y Conjunto 2 (elementos en 1 que no están en 2):");
        diferencia.muestra();
    }
}
