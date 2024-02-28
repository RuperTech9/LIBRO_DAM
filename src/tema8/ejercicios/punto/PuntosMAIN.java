
package tema8.ejercicios.punto;

/**
 *
 * @author Ruper
 */
public class PuntosMAIN {
    public static void main(String[] args) {
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(4, 6);
        System.out.println("Distancia entre p1 y p2: " + p1.distancia(p2));

        Punto3D p3 = new Punto3D(1, 2, 3);
        Punto3D p4 = new Punto3D(4, 6, 8);
        System.out.println("Distancia entre p3 y p4: " + p3.distancia(p4));
        
        Punto p5 = new Punto(1, 2);
        // Comprobar la igualdad de puntos
        System.out.println("¿p1 es igual a p2? " + p1.equals(p2)); // Debería ser false
        System.out.println("¿p1 es igual a p5? " + p1.equals(p5)); // Debería ser true
        
        // Crear objetos Suceso
        Suceso suceso1 = new Suceso(1, 2, 3, "Suceso Mágico",1);
        Suceso suceso2 = new Suceso(1, 2, 3, "Suceso Mágico",1);
        Suceso suceso3 = new Suceso(3, 4, 5, "Suceso Extraño",3);

        // Comparar sucesos usando equals
        System.out.println("\nComparación de sucesos:");
        System.out.println("Suceso 1 y 2: " + suceso1.equals(suceso2)); // Debe ser true
        System.out.println("Suceso 1 y 3: " + suceso1.equals(suceso3)); // Debe ser false
    }
}