package Defensa;
import java.util.Arrays;

public class Defensa_Array_Yassin2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 3, 6, 7, 8, 9};
        int numero = 3;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                break;
            }
        }
        
        System.out.println(Arrays.toString(array));
    }
}

