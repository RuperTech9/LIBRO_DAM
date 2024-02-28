
package tema7.ejemplos.estacionTren.personal;

import java.util.Date;
/**
 *
 * @author Ruper
 */
public class JefeEstacion {
    // ATRIBUTOS
    private String nombre;
    private String dni;
    private Date nombramiento;
    
    // CONSTRUCTOR
    public JefeEstacion(String nombre, String dni, Date nombramiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.nombramiento = nombramiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getNombramiento() {
        return nombramiento;
    }

    public void setNombramiento(Date nombramiento) {
        this.nombramiento = nombramiento;
    }
    
    
}
