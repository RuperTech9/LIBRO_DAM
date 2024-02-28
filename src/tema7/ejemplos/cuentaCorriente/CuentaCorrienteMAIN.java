
package tema7.ejemplos.cuentaCorriente;

/**
 *
 * @author Ruper
 */
public class CuentaCorrienteMAIN {
    public static void main(String [] args){
        

        // OBJETOS GESTOR
        Gestor g1 = new Gestor("David Pérez","666777888");
        Gestor g2 = new Gestor("Yassin Mousa","777888999");
        
        // OBJETOS CUENTA CORRIENTE
        CuentaCorriente c1 = new CuentaCorriente("47529040T","Alex",g1);
        CuentaCorriente c2 = new CuentaCorriente("47529042W","Mario",g2);
        
        c1.ingreso(1000);
        c1.retiro(50);
        c1.mostrarDatos();
        c2.mostrarDatos();
        
        c1.setGestor(g2);
        c1.mostrarDatos();
    }
}
