
package tema7.ejemplos.cuentaCorriente;

/**
 *
 * @author Ruper
 */
public class CuentaCorriente {
    // ATRIBUTOS
    private String dni;
    private String nombre;
    private double saldo;
    static private String nombreBanco = "International Java Bank";
    
    // CONSTRUCTORES
    public CuentaCorriente(){}
    public CuentaCorriente(String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        saldo=0;
    }

    // METODOS
    public boolean retiro(double cantidad){
        boolean operacionPosible;
        if(saldo >= cantidad){
            saldo = saldo - cantidad;
            operacionPosible = true;
        } else {
            System.out.println("No hay dinero suficiente");
            operacionPosible = false;
        }
        return (operacionPosible);
    }
    public void ingreso(double cantidad){
        saldo = saldo + cantidad;
    }
    
    public void mostrarDatos(){
        if(gestor == null){
            System.out.println("Cuenta sin gestor");
        } else {
            System.out.println("Informacion del gestor");
            gestor.mostrarDatos();
        }
        System.out.println("Información de la cuenta");
        System.out.println("Nombre: "+nombre);
        System.out.println("DNI: "+dni);
        System.out.println("Saldo: "+saldo+" euros");
    }
    
    public static void setBanco(String nuevoNombre){
        nombreBanco = nuevoNombre;
    }
    
    public static String getBanco(){
        return nombreBanco;
    }
    
    // CONSTRUCTOR CON GESTOR
    Gestor gestor;

    public CuentaCorriente(String dni, String nombre, Gestor gestor) {
        this.dni = dni;
        this.nombre = nombre;
        this.gestor = gestor;
    }
    public void setGestor(Gestor gestor){
        this.gestor=gestor;
    }
}
