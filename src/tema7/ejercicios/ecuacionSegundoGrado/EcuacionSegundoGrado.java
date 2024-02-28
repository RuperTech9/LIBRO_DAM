
package tema7.ejercicios.ecuacionSegundoGrado;

/**
 * Clase EcuacionSegundoGrado que permite resolver ecuaciones de segundo grado.
 * Los coeficientes se pueden indicar en el constructor y modificarse a posteriori.
 * Dispone de métodos para obtener las soluciones y para informar si el discriminante es positivo.
 * 
 * La forma general de una ecuación de segundo grado es ax^2 + bx + c = 0.
 * El discriminante (D) se calcula como D = b^2 - 4ac.
 * 
 * Si D > 0, hay dos soluciones reales y distintas.
 * Si D = 0, hay una única solución real (raíces reales y iguales).
 * Si D < 0, las soluciones son complejas (no hay raíces reales).
 * 
 * @author Ruper
 */
public class EcuacionSegundoGrado {
    // ATRIBUTOS
    private double a;
    private double b;
    private double c;

    // CONSTRUCTOR
    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    // SETTERS
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    // METODOS
    // Método para obtener el discriminante
    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    // Método para saber si el discriminante es positivo
    public boolean tieneRaicesReales() {
        return getDiscriminante() >= 0;
    }

    // Método para obtener las soluciones de la ecuación
    public String obtenerSoluciones() {
        double discriminante = getDiscriminante();
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return "Las soluciones son x1 = " + x1 + " y x2 = " + x2;
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            return "Hay una única solución x = " + x;
        } else {
            return "No hay soluciones reales, el discriminante es negativo.";
        }
    }
}
