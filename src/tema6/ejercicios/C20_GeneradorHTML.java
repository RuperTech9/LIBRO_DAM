
package tema6.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class C20_GeneradorHTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el título de la página web
        System.out.print("Ingrese el título de la página web: ");
        String titulo = scanner.nextLine();

        // Leer el contenido de la página web
        System.out.print("Ingrese el contenido de la página web: ");
        String contenido = scanner.nextLine();

        // Generar el documento HTML
        String html = generarDocumentoHTML(titulo, contenido);

        // Imprimir el documento HTML
        System.out.println(html);
    }

    public static String generarDocumentoHTML(String titulo, String contenido) {
        StringBuilder html = new StringBuilder();

        // Iniciar el documento HTML
        html.append("<!DOCTYPE html>\n");
        html.append("<html>\n");
        html.append("<head>\n");
        html.append("<title>").append(titulo).append("</title>\n");
        html.append("</head>\n");
        html.append("<body>\n");

        // Agregar el título como un encabezado de primer nivel
        html.append("<h1>").append(titulo).append("</h1>\n");

        // Agregar el contenido como un párrafo
        html.append("<p>").append(contenido).append("</p>\n");

        // Cerrar el documento HTML
        html.append("</body>\n");
        html.append("</html>");

        return html.toString();
    }
}