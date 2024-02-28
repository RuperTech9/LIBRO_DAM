
package tema5.ejemplos;

/**
 *
 * @author Ruper
 */
public class A01_SumaNumerosArray {
    public static void main(String[] args) {
        double tabla[]= new double[10];//creamos la tabla con 10 elementos
	double suma=0;
		
	for(int i=0; i<10; i++) {//recorremos la tabla para 
            tabla[i]=Math.random()*100;//inicializar con valores aleatorios
            suma = suma + tabla[i];//suma de los elementos de la tabla
	}
	System.out.println("Suma: " +suma);
	System.out.println("Media: "+suma/10);
    }
}
