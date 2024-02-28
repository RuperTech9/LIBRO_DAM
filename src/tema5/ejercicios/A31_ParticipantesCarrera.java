
package tema5.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
public class A31_ParticipantesCarrera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ingresar los dorsales de los corredores al llegar a la meta
        int[] llegadas = new int[1000]; // Suponemos que no habrá más de 1000 corredores
        int numCorredores = 0;

        System.out.println("Introduce el número de dorsal de cada corredor al llegar a la meta (-1 para finalizar):");
        int dorsal;
        do {
            dorsal = scanner.nextInt();
            if (dorsal != -1) {
                llegadas[numCorredores] = dorsal;
                numCorredores++;
            }
        } while (dorsal != -1);

        // Solicitar información extra de los corredores
        int[] menoresEdad = new int[numCorredores];
        int numMenoresEdad = 0;

        int[] positivosAntidopaje = new int[numCorredores];
        int numPositivosAntidopaje = 0;

        int[] noPagaronInscripcion = new int[numCorredores];
        int numNoPagaronInscripcion = 0;

        System.out.println("Introduce los dorsales de los corredores menores de edad (0 para finalizar):");
        int menorEdad;
        do {
            menorEdad = scanner.nextInt();
            if (menorEdad != 0) {
                menoresEdad[numMenoresEdad] = menorEdad;
                numMenoresEdad++;
            }
        } while (menorEdad != 0);

        System.out.println("Introduce los dorsales de los corredores que han dado positivo en el test antidopaje (0 para finalizar):");
        int positivo;
        do {
            positivo = scanner.nextInt();
            if (positivo != 0) {
                positivosAntidopaje[numPositivosAntidopaje] = positivo;
                numPositivosAntidopaje++;
            }
        } while (positivo != 0);

        System.out.println("Introduce los dorsales de los corredores que no han pagado su inscripción (0 para finalizar):");
        int noPago;
        do {
            noPago = scanner.nextInt();
            if (noPago != 0) {
                noPagaronInscripcion[numNoPagaronInscripcion] = noPago;
                numNoPagaronInscripcion++;
            }
        } while (noPago != 0);

        // Aplicar modificaciones en el ranking según la información extra
        for (int i = 0; i < numCorredores; i++) {
            for (int j = 0; j < numMenoresEdad; j++) {
                if (llegadas[i] == menoresEdad[j]) {
                    if (i < numCorredores - 1) {
                        int temp = llegadas[i];
                        llegadas[i] = llegadas[i + 1];
                        llegadas[i + 1] = temp;
                    }
                    break;
                }
            }

            for (int j = 0; j < numPositivosAntidopaje; j++) {
                if (llegadas[i] == positivosAntidopaje[j]) {
                    for (int k = i; k < numCorredores - 1; k++) {
                        llegadas[k] = llegadas[k + 1];
                    }
                    numCorredores--;
                    break;
                }
            }

            for (int j = 0; j < numNoPagaronInscripcion; j++) {
                if (llegadas[i] == noPagaronInscripcion[j]) {
                    for (int k = i; k > 0; k--) {
                        int temp = llegadas[k];
                        llegadas[k] = llegadas[k - 1];
                        llegadas[k - 1] = temp;
                    }
                    break;
                }
            }
        }

        // Determinar los dorsales de los corredores que han conseguido las medallas de oro, plata y bronce
        int oro = llegadas[0];
        int plata = llegadas[1];
        int bronce = llegadas[2];

        // Mostrar los dorsales de los corredores que han conseguido las medallas de oro, plata y bronce
        System.out.println("Medalla de Oro: " + oro);
        System.out.println("Medalla de Plata: " + plata);
        System.out.println("Medalla de Bronce: " + bronce);
    }
}
