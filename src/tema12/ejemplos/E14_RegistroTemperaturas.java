
package tema12.ejemplos;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruper
 */
public class E14_RegistroTemperaturas {
    static List<Registro> registros = new ArrayList<>();
    static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
    static String rutaRegistros = ".\\src\\tema12\\ejemplos\\registros.txt" + LocalDate.now().format(dateFormatter) + ".txt";

    public static void main(String[] args) {
        mostrarMenu();
    }

    // Método para mostrar el menú
    private static void mostrarMenu() {
        int opcion = 0;
        do {
            try {
                String menu = "\n               REGISTRO DE TEMPERATURAS" +
                        "\n---------------------------------------------------------" +
                        "\n1- Nuevo Registro" +
                        "\n2- Listar Registros" +
                        "\n3- Mostrar Estadísticas" +
                        "\n4- Salir" +
                        "\n---------------------------------------------------------" +
                        "\nSelecciona una opción: ";
                String strOpcion = JOptionPane.showInputDialog(menu);

                // Cierro el programa si pulso cancelar en el menú principal.
                if (strOpcion == null) {
                    JOptionPane.showMessageDialog(null, "\nSaliendo...");
                    System.exit(0);
                }

                opcion = Integer.parseInt(strOpcion);
                switch (opcion) {
                    case 1:
                        nuevoRegistro();
                        break;
                    case 2:
                        listarRegistros();
                        break;
                    case 3:
                        mostrarEstadisticas();
                        break;
                    case 4:
                        guardarRegistrosEnFichero();
                        JOptionPane.showMessageDialog(null, "\nSaliendo...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "\nOpción no válida. Introduce un número entre 1 y 4.");
                        break;
                } // FIN SWITCH
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERROR. Entrada no válida, inténtalo de nuevo.");
            } // FIN TRY-CATCH
        } while (opcion != 4); // FIN DO-WHILE
    } // FIN METODO

    // Método para añadir un nuevo registro de temperatura
    private static void nuevoRegistro() {
        double temperatura = 0;
        do {
            String strTemperatura = JOptionPane.showInputDialog("Introduce la temperatura en grados centígrados:");
            if (strTemperatura == null) return;
            try {
                temperatura = Double.parseDouble(strTemperatura);
                LocalDateTime fechaHora = LocalDateTime.now();
                registros.add(new Registro(temperatura, fechaHora));
                JOptionPane.showMessageDialog(null, "Registro añadido: " + temperatura + "°C a las " + fechaHora.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERROR. Se esperaba un número para la temperatura. Inténtalo de nuevo.");
            }
        } while (true); // FIN DO-WHILE
    }

    // Método para listar todos los registros
    private static void listarRegistros() {
        if (registros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay registros para mostrar.");
        } else {
            StringBuilder lista = new StringBuilder("REGISTROS DE TEMPERATURA:\n\n");
            int contador = 1;
            for (Registro registro : registros) {
                lista.append(contador).append("- ").append(registro.toString()).append("\n");
                contador++;
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        }
    }

    // Método para mostrar estadísticas de temperatura
    private static void mostrarEstadisticas() {
        if (registros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay registros para mostrar estadísticas.");
        } else {
            double max = registros.stream().max(Comparator.comparingDouble(Registro::getTemperatura)).get().getTemperatura();
            double min = registros.stream().min(Comparator.comparingDouble(Registro::getTemperatura)).get().getTemperatura();
            double sum = registros.stream().mapToDouble(Registro::getTemperatura).sum();
            double avg = sum / registros.size();

            String estadisticas = String.format("ESTADÍSTICAS DE TEMPERATURA:\n\n" +
                    "Temperatura Máxima: %.2f°C\n" +
                    "Temperatura Mínima: %.2f°C\n" +
                    "Temperatura Promedio: %.2f°C\n", max, min, avg);
            JOptionPane.showMessageDialog(null, estadisticas);
        }
    }

    // Método para guardar los registros en un fichero
    private static void guardarRegistrosEnFichero() {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(rutaRegistros);
            pw = new PrintWriter(fw);
            // Escribo los registros en el archivo
            for (Registro registro : registros) {
                pw.println(registro.getTemperatura() + "::" + registro.getFechaHora().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pw != null)
                    pw.close(); // Cerrar PrintWriter
                if (fw != null)
                    fw.close(); // Cerrar FileWriter
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    // Clase interna Registro
    static class Registro {
        private double temperatura;
        private LocalDateTime fechaHora;

        public Registro(double temperatura, LocalDateTime fechaHora) {
            this.temperatura = temperatura;
            this.fechaHora = fechaHora;
        }

        public double getTemperatura() {
            return temperatura;
        }

        public LocalDateTime getFechaHora() {
            return fechaHora;
        }

        @Override
        public String toString() {
            return temperatura + "°C a las " + fechaHora.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        }
    }
}