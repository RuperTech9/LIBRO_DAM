package tema5.ejemplos;


import java.util.Arrays;
import java.util.Scanner;

/*
 * Desarrollar el juego de «la cámara secreta», que consiste en abrir una cámara mediante su
combinación secreta, que está formada por una combinación de dígitos del uno al cinco. El
jugador especificará cual es la longitud de la combinación; a mayor longitud, mayor será la
dificultad del juego. La aplicación genera, de forma aleatoria, una combinación secreta que
el usuario tendrá que acertar. En cada intento se muestra como pista, para cada dígito de la
combinación introducido por el jugador, si es mayor, menor o igual que el correspondiente
en la combinación secreta.
 */

public class A18_CamaraSecreta {

    public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Longitud de la combinación secreta: ");
	int longitud = sc.nextInt();
	int combSecreta[] = new int [longitud]; //combinación secreta
	int combJugador[] = new int [longitud]; //combinación del jugador
			
	generaCombinacion(combSecreta); //generamos aleatoramente la combinacion secreta
	System.out.println(Arrays.toString(combSecreta)); //mostramos la combinación secreta para ayudar con la prueba
	System.out.println("Escriba una combinación: ");
	leeTabla(combJugador);
			
	while (!Arrays.equals(combSecreta, combJugador)) {	//no sean iguales (!Arrays.equals)
            muestraPistas(combSecreta,combJugador); //mostramos las pistas
            System.out.println("Escriba una combinación: ");
            leeTabla(combJugador);//volvemos a pedir otra combinacion
	}
	//Sali de while significa que hemos acertado la combinación secreta
	System.out.println("¡La cámara está abierta!");	
    }
	
    //Función que inicializa los valores de la tabla t con valores aleatorios
    static void generaCombinacion (int t[]) {
	final int MAX = 5;
	for (int i = 0; i<t.length; i++) {
            t[i]= (int) (Math.random()*MAX+1);
	}
    }
	
    //Función que recorre t y asigna a cada elemento un valor leído desde el teclado
    static void leeTabla (int t[]) {
    	Scanner sc = new Scanner(System.in);
	for (int i = 0; i <t.length; i++) {	//recorremos para leer
            t[i]= sc.nextInt();
        }
    }
	
    //Función que recorre las 2 tablas, e indica para cada elemento de la comb introducida por el usuario, si es mayor, menor o igual que el equivalente en la comb secreta
    static void muestraPistas (int secret[], int jug[]) {
	System.out.println("Pistas: ");
	for (int i=0; i<jug.length; i++) { //recorremos ambas tablas
            System.out.println(jug[i]);
            if (secret[i]>jug[i]) {
		System.out.println(" mayor");
            }else if (secret[i]<jug[i]) {
		System.out.println(" menor");
            }else {
		System.out.println(" igual");
            }
	}
    }				
}



