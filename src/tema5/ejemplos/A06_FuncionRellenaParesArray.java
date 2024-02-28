package tema5.ejemplos;

import java.util.Arrays;

public class A06_FuncionRellenaParesArray {
    public static void main(String[] args) {
	int r[]=rellenaPares(5,50);
	System.out.println(Arrays.toString(r));
    }
    static int[] rellenaPares(int longitud, int fin) {
	int pares[]= new int[longitud];
	int i= 0;
		
	while (i <pares.length) {
            int num = (int) (Math.random()*fin +1);
            if (num % 2==0) {
		pares[i] = num;
		i++;
            }
	}
	Arrays.sort(pares); // ordenamos la tabla
	return pares;
    }
}


