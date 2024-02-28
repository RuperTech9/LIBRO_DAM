
package tema8.ejercicios.calendario;

/**
 *
 * @author Ruper
 */
public class CalendarioExactoMAIN {
    public static void main(String[] args) {
        try {
            CalendarioExacto calendarioExacto = new CalendarioExacto(2024, 2, 1, 23, 59);
            calendarioExacto.mostrar(); // Mostrará la fecha y hora actual

            calendarioExacto.incrementarMinuto(); // Incrementa un minuto
            calendarioExacto.mostrar(); // Mostrará la fecha y hora incrementada en un minuto

            calendarioExacto.incrementarHora(); // Incrementa una hora
            calendarioExacto.mostrar(); // Mostrará la fecha y hora incrementada en una hora

            // Comparar si dos fechas son iguales
            CalendarioExacto otraFecha = new CalendarioExacto(2024, 2, 2, 0, 0);
            if (calendarioExacto.equals(otraFecha)) {
                System.out.println("Las fechas son iguales");
            } else {
                System.out.println("Las fechas son diferentes");
            }
            
            // Usar toString para obtener la representación en String de la fecha y hora
            System.out.println(calendarioExacto.toString());

        } catch (IllegalArgumentException e) {
            System.out.println("Se ha introducido una fecha o una hora no válida.");
        }
    }
}
