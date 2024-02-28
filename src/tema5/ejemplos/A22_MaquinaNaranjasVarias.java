
package tema5.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class A22_MaquinaNaranjasVarias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear la matriz tridimensional para clasificar naranjas con 5 criterios
        int[][][][][] naranjas = new int[3][3][4][2][6];

        String continuar = "s";

        while (continuar.equals("s")) {
            // Pedir al usuario que ingrese la clasificación para una nueva naranja
            System.out.println("Introduce la clasificación de la nueva naranja:");

            System.out.print("Diámetro (0: Pequeño, 1: Mediano, 2: Grande): ");
            int diametro = scanner.nextInt();

            System.out.print("Color (0: Naranja, 1: Amarillo, 2: Verde): ");
            int color = scanner.nextInt();

            System.out.print("Maduración (0: Pasada, 1: Óptima, 2: Algo inmadura, 3: Totalmente inmadura): ");
            int maduracion = scanner.nextInt();

            System.out.print("Forma (0: Redondeada, 1: Otra forma): ");
            int forma = scanner.nextInt();

            System.out.print("Peso (0: <100g, 1: 100-200g, 2: 200-300g, 3: 300-400g, 4: 400-500g, 5: >500g): ");
            int peso = scanner.nextInt();

            // Aumentar el contador en la posición de la matriz que corresponde a la clasificación de la naranja
            naranjas[diametro][color][maduracion][forma][peso]++;

            // Preguntar al usuario si quiere clasificar otra naranja
            System.out.print("¿Quieres clasificar otra naranja? (s/n): ");
            continuar = scanner.next();
        }

        // Mostrar la clasificación de todas las naranjas
        System.out.println("Clasificación de todas las naranjas:");
        for (int i = 0; i < naranjas.length; i++) {
            for (int j = 0; j < naranjas[i].length; j++) {
                for (int k = 0; k < naranjas[i][j].length; k++) {
                    for (int l = 0; l < naranjas[i][j][k].length; l++) {
                        for (int m = 0; m < naranjas[i][j][k][l].length; m++) {
                            if (naranjas[i][j][k][l][m] > 0) {
                                System.out.println("Diámetro " + i + ", Color " + j + ", Maduración " + k + ", Forma " + l + ", Peso " + m + ": " + naranjas[i][j][k][l][m] + " naranja(s)");
                            }
                        }
                    }
                }
            }
        }
    }
}
