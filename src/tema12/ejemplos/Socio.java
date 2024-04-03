
package tema12.ejemplos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Ruper
 */
public class Socio implements Comparable<Socio> {
    String dni;
    String nombre;
    LocalDate fechaAlta;

    public Socio(String dni, String nombre, String fechaAlta) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaAlta = LocalDate.parse(fechaAlta, f);
    }

    public Socio(String dni) {
        this.dni = dni;
    }
    
    int antiguedad(){
        return (int) fechaAlta.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public boolean equals(Object ob){
        return dni.equals(((Socio) ob).dni);
    }
    
    @Override
    public int compareTo (Socio otro){
        return dni.compareTo(otro.dni);
    }

    @Override
    public String toString() {
        return "DNI: " + dni + " NOMBRE: " + nombre + " ANTIGUEDAD: " + antiguedad() + "\n";
    }
}
