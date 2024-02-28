package tema3.ejemplos;

import java.util.Scanner;

public class B05_AdivinaSuma {

	public static void main(String[] args) {
		int resultado, operando1, operando2;
		int numOperaciones = 0;
		do {
			operando1 = (int) (Math.random()*100+1);
			operando2 = (int) (Math.random()*100+1);
			System.out.println(operando1 + " + " + operando2 + " = ");
			Scanner sc = new Scanner(System.in);
			resultado = sc.nextInt();
			numOperaciones++;
			sc.close();
			
		} while (resultado == operando1 + operando2);
		System.out.println("A conseguido realizar: " + (numOperaciones -1) + " sumas consecutivas");
		

	}

}
