
package tema7.ejercicios.calendario;

/**
 *
 * @author Ruper
 */
public class CalendarioMAIN {
    public static void main(String[] args) {
        // Crear una fecha en un año bisiesto
        Calendario fecha = new Calendario(2024, 2, 28);
        fecha.mostrar(); // Debe mostrar 2024-02-28

        // Incrementar un día y verificar el cambio a 29 de febrero (año bisiesto)
        fecha.incrementarDia();
        fecha.mostrar(); // Debe mostrar 2024-02-29

        // Incrementar un día y verificar el cambio a 1 de marzo
        fecha.incrementarDia();
        fecha.mostrar(); // Debe mostrar 2024-03-01

        // Incrementar un mes y verificar el cambio a abril
        fecha.incrementarMes();
        fecha.mostrar(); // Debe mostrar 2024-04-01

        // Incrementar el año en 1 y verificar el cambio a 2025
        fecha.incrementarAnio(1);
        fecha.mostrar(); // Debe mostrar 2025-04-01

        // Crear otra fecha para comparar
        Calendario otraFecha = new Calendario(2025, 4, 1);

        // Comparar las dos fechas
        if (fecha.iguales(otraFecha)) {
            System.out.println("Las fechas son iguales.");
        } else {
            System.out.println("Las fechas son distintas.");
        }
    }
    
}
