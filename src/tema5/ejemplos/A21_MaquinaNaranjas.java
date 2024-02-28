
package tema5.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class A21_MaquinaNaranjas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir la cantidad de clasificaciones para cada criterio
        int clasificacionesDiametro = 3;
        int clasificacionesColor = 3;
        int clasificacionesMaduracion = 4;
        int clasificacionesForma = 2;
        int clasificacionesPeso = 6;
        
        // Crear la matriz para clasificar naranjas con los 5 criterios
        int[][][][][] naranjas = new int[clasificacionesDiametro][clasificacionesColor]
                                         [clasificacionesMaduracion][clasificacionesForma]
                                         [clasificacionesPeso];
        
        // Pedir al usuario que seleccione las clasificaciones de cada criterio
        System.out.println("Selecciona el diámetro de la naranja:");
        System.out.println("0 - Pequeño (< 4 cm)");
        System.out.println("1 - Mediano (entre 4 y 8 cm)");
        System.out.println("2 - Grande (> 8 cm)");
        int diametro = scanner.nextInt();
        
        System.out.println("Selecciona el color de la naranja:");
        System.out.println("0 - Naranja");
        System.out.println("1 - Amarillo");
        System.out.println("2 - Verde");
        int color = scanner.nextInt();
        
        System.out.println("Selecciona la maduración de la naranja:");
        System.out.println("0 - Pasada");
        System.out.println("1 - Óptima");
        System.out.println("2 - Algo inmadura");
        System.out.println("3 - Totalmente inmadura");
        int maduracion = scanner.nextInt();
        
        System.out.println("Selecciona la forma de la naranja:");
        System.out.println("0 - Redondeada");
        System.out.println("1 - Otra forma");
        int forma = scanner.nextInt();
        
        System.out.println("Selecciona el peso de la naranja:");
        System.out.println("0 - < 100 g");
        System.out.println("1 - 100-200 g");
        System.out.println("2 - 200-300 g");
        System.out.println("3 - 300-400 g");
        System.out.println("4 - 400-500 g");
        System.out.println("5 - > 500 g");
        int peso = scanner.nextInt();
        
        // Clasificar la naranja en la matriz con los criterios seleccionados por el usuario
        naranjas[diametro][color][maduracion][forma][peso]++;
        
        // Mostrar los datos de la clasificación de la naranja
        System.out.println("Has clasificado una naranja con las siguientes características:");
        System.out.println("Diámetro: " + (diametro == 0 ? "Pequeño" : diametro == 1 ? "Mediano" : "Grande"));
        System.out.println("Color: " + (color == 0 ? "Naranja" : color == 1 ? "Amarillo" : "Verde"));
        System.out.println("Maduración: " + (maduracion == 0 ? "Pasada" : maduracion == 1 ? "Óptima" :
                         maduracion == 2 ? "Algo inmadura" : "Totalmente inmadura"));
        System.out.println("Forma: " + (forma == 0 ? "Redondeada" : "Otra forma"));
        System.out.println("Peso: " + (peso == 0 ? "< 100 g" : peso == 1 ? "100-200 g" : peso == 2 ? "200-300 g" :
                         peso == 3 ? "300-400 g" : peso == 4 ? "400-500 g" : "> 500 g"));
        System.out.println("Cantidad clasificada en esta categoría: " + naranjas[diametro][color][maduracion][forma][peso]);
        
        scanner.close();
    }
}
