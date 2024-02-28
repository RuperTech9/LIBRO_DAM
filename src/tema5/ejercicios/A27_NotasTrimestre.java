
package tema5.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class A27_NotasTrimestre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de alumnos en el grupo
        System.out.print("Introduce el número de alumnos en el grupo: ");
        int numAlumnos = scanner.nextInt();

        // Crear arrays para almacenar las notas de cada trimestre
        double[] notasTrimestre1 = new double[numAlumnos];
        double[] notasTrimestre2 = new double[numAlumnos];
        double[] notasTrimestre3 = new double[numAlumnos];

        // Leer las notas de cada trimestre para cada alumno
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            System.out.print("Nota del primer trimestre: ");
            notasTrimestre1[i] = leerNota(scanner.nextDouble());
            System.out.print("Nota del segundo trimestre: ");
            notasTrimestre2[i] = leerNota(scanner.nextDouble());
            System.out.print("Nota del tercer trimestre: ");
            notasTrimestre3[i] = leerNota(scanner.nextDouble());
        }

        // Calcular la nota media del grupo en cada trimestre
        double mediaTrimestre1 = calcularMedia(notasTrimestre1);
        double mediaTrimestre2 = calcularMedia(notasTrimestre2);
        double mediaTrimestre3 = calcularMedia(notasTrimestre3);

        // Imprimir la nota media del grupo en cada trimestre
        System.out.println("Nota media del grupo en el primer trimestre: " + mediaTrimestre1);
        System.out.println("Nota media del grupo en el segundo trimestre: " + mediaTrimestre2);
        System.out.println("Nota media del grupo en el tercer trimestre: " + mediaTrimestre3);

        // Leer la posición del alumno para calcular su media
        System.out.print("Introduce la posición del alumno para calcular su media (empezando desde 1): ");
        int posicion = scanner.nextInt();

        // Verificar si la posición es válida
        if (posicion >= 1 && posicion <= numAlumnos) {
            // Calcular la media del alumno en las tres notas
            double notaMediaAlumno = (notasTrimestre1[posicion - 1] + notasTrimestre2[posicion - 1] + notasTrimestre3[posicion - 1]) / 3;
            System.out.println("La media del alumno en las tres notas es: " + notaMediaAlumno);
        } else {
            System.out.println("La posición del alumno es inválida.");
        }
    }

    // Método para calcular la media de un array de notas
    public static double calcularMedia(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    // Método para redondear las notas al entero más cercano, si está en el rango de 4.5 a 5
    public static double leerNota(double nota) {
        if (nota >= 4.5 && nota <= 5) {
            return 5;
        } else {
            return nota;
        }
    }
}