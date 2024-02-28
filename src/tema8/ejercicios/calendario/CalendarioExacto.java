
package tema8.ejercicios.calendario;

/**
 *
 * @author Ruper
 */
public class CalendarioExacto extends Calendario {
    private int hora;
    private int minuto;

    // Constructor que crea un objeto con los datos pasados como parámetros
    public CalendarioExacto(int anio, int mes, int dia, int hora, int minuto) {
        super(anio, mes, dia);
        if (hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60) {
            this.hora = hora;
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("Hora o minuto no válidos");
        }
    }

    // Getter para la hora
    public int getHora() {
        return hora;
    }

    // Método para incrementar un minuto
    public void incrementarMinuto() {
        if (minuto < 59) {
            minuto++;
        } else {
            minuto = 0;
            incrementarHora();
        }
    }

    // Método para incrementar una hora
    public void incrementarHora() {
        if (hora < 23) {
            hora++;
        } else {
            hora = 0;
            super.incrementarDia();
        }
    }

    // Método para mostrar la fecha y hora
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.printf("%02d:%02d%n", hora, minuto);
    }

    // Método toString
    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d %02d:%02d", anio, mes, dia, hora, minuto);
    }

    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CalendarioExacto other = (CalendarioExacto) obj;
        return super.iguales(other) && hora == other.hora && minuto == other.minuto;
    }
}

