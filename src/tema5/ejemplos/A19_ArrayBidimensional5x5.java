package tema5.ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class A19_ArrayBidimensional5x5 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int datos [][];	//Declaramos "datos" como una tabla bidimensional.
	datos = new int [5][5];	//Tabla de 5x5.
		
	for (int i=0; i<5; i++) { //eje X.
            for (int j=0; j<5; j++) { //eje Y.
		System.out.print((datos [i][j] = 10*i + j)+" ");  
            }
            System.out.println();
	}
        System.out.println("");
	System.out.println(Arrays.deepToString(datos)); //mostramos con array.		
    }		
}
