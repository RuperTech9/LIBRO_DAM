
package tema8.ejercicios.punto;

/**
 *
 * @author Ruper
 */
public class Punto3D extends Punto {
    private int z; // Coordenada Z adicional para representar un punto en 3D

    // Constructor que recibe las coordenadas X, Y y Z
    public Punto3D(int x, int y, int z) {
        super(x, y); // Llama al constructor de la clase base (Punto) para establecer las coordenadas X e Y
        this.z = z; // Asigna la coordenada Z adicional
    }

    @Override
    public double distancia(Punto otroPunto) {
        if (!(otroPunto instanceof Punto3D)) { // Verifica si otroPunto es una instancia de la clase Punto3D, de lo contrario, lanza una excepción
            throw new IllegalArgumentException("Debe ser un Punto3D para calcular la distancia en 3D.");
        }
        Punto3D otroPunto3D = (Punto3D) otroPunto; // Convierte otroPunto en un objeto de tipo Punto3D

        int dz = this.z - otroPunto3D.z; // Calcula la diferencia en la coordenada Z entre los dos puntos        
        double distancia3D = Math.sqrt(Math.pow(super.distancia(otroPunto), 2) + dz * dz); // Calcula la distancia en 3D utilizando el teorema de Pitágoras en tres dimensiones 
        return distancia3D; // Devuelve la distancia en 3D calculada
    }
    
    @Override
    public boolean equals(Object otroObjeto) {
        if (this == otroObjeto) {
            return true; // Son la misma instancia, son iguales
        }
        if (otroObjeto == null || getClass() != otroObjeto.getClass()) {
            return false; // El objeto no es de la misma clase o es nulo, no son iguales
        }
        if (!super.equals(otroObjeto)) {
            return false; // Llama al método equals de la superclase (Punto) para comprobar las coordenadas X e Y
        }
        Punto3D otroPunto3D = (Punto3D) otroObjeto; // Convertir el objeto en un Punto3D

        // Comprobar si la coordenada Z también es igual
        return z == otroPunto3D.z;
    }
}
