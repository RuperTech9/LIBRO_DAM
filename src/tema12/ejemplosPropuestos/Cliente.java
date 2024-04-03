
package tema12.ejemplosPropuestos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Ruper
 */
public class Cliente implements Comparable<Cliente> {
    String dni;
    String nombre;
    LocalDate fechaNacimiento;

    public Cliente(String dni, String nombre, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter formatoFechas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatoFechas);
    }
    
    int edad(){
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    
    
    @Override
    public boolean equals(Object ob){
        return dni.equals(((Cliente) ob).dni);
    }
    
    @Override
    public int compareTo (Cliente otro){
        return dni.compareTo(otro.dni);
    }

    @Override
    public String toString() {
        return "DNI: " + dni + " NOMBRE: " + nombre + " EDAD: " + edad() + "\n";
    }
    
    
}
