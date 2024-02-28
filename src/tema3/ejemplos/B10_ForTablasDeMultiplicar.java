package tema3.ejemplos;

public class B10_ForTablasDeMultiplicar {

	public static void main(String[] args) {
		for (int tabla = 1; tabla <= 10; tabla++) {
			System.out.println("\nTabla del " + tabla);
			for (int i = 1; i <= 10; i++) {
				System.out.println(tabla + " x " + i + " = " + tabla * i);
			}
		}
	}
}
