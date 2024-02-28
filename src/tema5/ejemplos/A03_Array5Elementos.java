package tema5.ejemplos;


import java.util.Arrays;
import java.util.Scanner;

public class A03_Array5Elementos {
    public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
		
	double tabla[] = new double[5];
	for(int i=0; i<5; i++) {
            System.out.println("Introduce un número");
            tabla[i]= teclado.nextDouble();
	}
	System.out.println("La tabla es: "+ Arrays.toString(tabla));
	
    }
}



