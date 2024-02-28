package tema5.ejemplos;
import java.util.Scanner;

public class A04_ArrayOrdenInverso {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introducir el tamaño de la tabla: ");
	int tamanio = sc.nextInt();
			
	int tabla[] = new int[tamanio];
	for(int i=0; i<tamanio; i++) {
            System.out.println("Introduce un número");
            tabla[i]= sc.nextInt();
	}
		
	for(int i=tamanio-1; i>=0; i--) {
            System.out.println("Orden inverso: " + tabla[i]);
	}
    }
}

