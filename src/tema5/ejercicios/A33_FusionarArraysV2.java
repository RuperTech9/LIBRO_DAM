
package tema5.ejercicios;

/**
 *
 * @author Ruper
 */
public class A33_FusionarArraysV2 {
    public static void merge(int[] arr, int l, int m, int r) {
        // Calcular el tamaño de los subarreglos
        int n1 = m - l + 1;
        int n2 = r - m;

        // Crear arreglos temporales
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copiar datos a los arreglos temporales
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Fusionar los arreglos temporales
        int i = 0, j = 0;

        // Índice inicial del subarreglo fusionado
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de L[] si los hay
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copiar los elementos restantes de R[] si los hay
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            // Encontrar el punto medio
            int m = l + (r - l) / 2;

            // Ordenar la primera mitad
            mergeSort(arr, l, m);
            // Ordenar la segunda mitad
            mergeSort(arr, m + 1, r);

            // Fusionar las mitades ordenadas
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Arreglo original:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Arreglo ordenado:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
