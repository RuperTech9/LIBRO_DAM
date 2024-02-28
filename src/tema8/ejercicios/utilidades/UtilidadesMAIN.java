
package tema8.ejercicios.utilidades;

/**
 *
 * @author Ruper
 */
public class UtilidadesMAIN {
    public static void main(String[] args) {
        // Prueba con números
        Integer num1 = 10;
        Double num2 = 20.5;
        Utilidades.sumar(num1, num2); // Debería imprimir 30.5
        
        // Prueba con cadenas
        String cadena1 = "Hola ";
        String cadena2 = "Mundo";
        Utilidades.sumar(cadena1, cadena2); // Debería imprimir "Hola Mundo"
        
        // Prueba con un número y una cadena
        Utilidades.sumar(num1, cadena1); // Debería imprimir "No sumables"
    }
}
