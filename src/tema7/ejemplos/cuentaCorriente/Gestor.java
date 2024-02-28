
package tema7.ejemplos.cuentaCorriente;

/**
 *
 * @author Ruper
 */
public class Gestor {
    // ATRIBUTOS
    public String nombre;
    private String telefono;
    double importeMax;
    
    // CONSTRUCTORES
    public Gestor(String nombre, String telefono, double importeMax){
        this.nombre=nombre;
        this.telefono=telefono;
        this.importeMax=importeMax;
    }
    public Gestor(String nombre, String telefono){
        this.nombre=nombre;
        this.telefono=telefono;
        importeMax = 10000;
    }
    
    // GET
    public String getTelefono() {
        return telefono;
    }
    
    // METODOS
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Teléfono: "+telefono);
        System.out.println("Importe máximo: "+importeMax+" euros");
    }
}
