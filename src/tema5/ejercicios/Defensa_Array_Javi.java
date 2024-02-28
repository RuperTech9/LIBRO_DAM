package Defensa;
import java.util.Arrays;

//Crea un programa en java que cambie cada elemento de un array de 0 a 1.

public class Defensa_Array_Javi {

	public static void main(String[] args) {
		
int[] array = {0, 0, 0, 0, 5, 0, 0, 0, 0, 0};
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0) {
            	array[i]=1;
            	
            }
        }
        
        System.out.println("Array cambiado: " + Arrays.toString(array));
		
	    
	  }
	}
