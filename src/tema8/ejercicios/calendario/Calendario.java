
package tema8.ejercicios.calendario;

/**
 *
 * @author Ruper
 */
public class Calendario {
    protected int anio;
    protected int mes;
    protected int dia;

    // Constructor que crea un objeto con los datos pasados como parámetros
    public Calendario(int anio, int mes, int dia) {
        if (anio != 0 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasEnMes(mes, anio)) {
            this.anio = anio;
            this.mes = mes;
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Fecha no válida");
        }
    }

    // Método para incrementar un día
    public void incrementarDia() {
        if (dia < diasEnMes(mes, anio)) {
            dia++;
        } else if (mes < 12) {
            dia = 1;
            mes++;
        } else {
            dia = 1;
            mes = 1;
            anio++;
        }
    }

    // Método para incrementar un mes
    public void incrementarMes() {
        if (mes == 12) {
            mes = 1;
            anio++;
        } else {
            mes++;
        }
    }

    // Método para incrementar un número de años
    public void incrementarAnio(int cantidad) {
        if (cantidad < 0 || (anio + cantidad) <= 0) {
            throw new IllegalArgumentException("Año no válido");
        } else {
            anio += cantidad;
            if (mes == 2 && dia == 29 && !esBisiesto(anio)) {
                dia = 28;
            }
        }
    }

    // Método para mostrar la fecha
    public void mostrar() {
        System.out.printf("%04d-%02d-%02d%n", anio, mes, dia);
    }

    // Método para comprobar si dos fechas son iguales
    public boolean iguales(Calendario otraFecha) {
        return anio == otraFecha.anio && mes == otraFecha.mes && dia == otraFecha.dia;
    }

    // Función para determinar si un año es bisiesto
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    // Función auxiliar para obtener la cantidad de días en un mes específico
    private int diasEnMes(int mes, int anio) {
        switch (mes) {
            case 2:
                return (esBisiesto(anio)) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
}
