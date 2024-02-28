
package tema7.ejemplos.estacionTren.personal;

/**
 *
 * @author Ruper
 */
public class Mecanico {
    // ATRIBUTOS
    private String nombre;
    private String telefono;
    public enum Especialidad {FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR};
    public Especialidad especialidad;
    
    // CONSTRUCTOR
    public Mecanico(String nombre, String telefono, Especialidad especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
