package tema4.ejemplos;

import java.util.Scanner;

public class F10_MaximoComunDivisorMinimoComunMultiplo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, resultado, resultado2;
        System.out.println("Introduzca el primer numero: ");
        a = teclado.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        b = teclado.nextInt();
        resultado = mcd(a, b);
        System.out.println("El mcd es "+ resultado);
        resultado2 = (int) mcm(a, b);
        System.out.println("El mcm es " + resultado2);
        
    }
    
    public static int mcd(int a, int b){
        int resultado;
        if(a==0){
            resultado = b;
        }else if(b==0){
            resultado = a;
        }else{
            int min = a <= b ? a:b;
            int max = a <= b ? b:a;
            resultado = mcd(min, max-min);
        }
        return resultado;
    }
    
    public static long mcm(int a, int b){
        // Calculamos el MCD primero
        int mcd = mcd(a, b);
        // Ahora calculamos el MCM
        return ((long)a * b) / mcd; // Cast a long para evitar overflow en la multiplicación
    }

}
