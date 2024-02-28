
package tema7.ejemplos.estacionTren.personal;

/**
 *
 * @author Ruper
 */
public class Maquinista {
    // ATRIBUTOS
    private String nombre;  // Cambio a privado
    private String dni;     // Cambio a privado
    private double sueldo;  // Cambio a privado
    private String rango;   // Cambio a privado
    
    // CONSTRUCTOR
    public Maquinista(String nombre, String dni, double sueldo, String rango) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }
    
    // GETTERS
    public String getNombre() {
        return nombre;
    }
    
    public String getDni() {
        return dni;
    }
    
    public double getSueldo() {
        return sueldo;
    }
    
    public String getRango() {
        return rango;
    }
}
