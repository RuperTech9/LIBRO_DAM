package tema5.ejemplos;

import java.util.Arrays;

public class A10_FuncionSinRepetidos {

	public static void main(String[] args) {
		int t[] = {7, 5, 3, 1, 0, -2, 5, 3, 5, 2, 0};
		int r[] = sinRepetidos(t);
		System.out.println(Arrays.toString(r));
	}
	
	static int[] sinRepetidos(int t[]){
		int tablaSin[]= new int[0];
		int tablaTemp[]=Arrays.copyOf(t, t.length);
		Arrays.sort(tablaTemp);
		
		for(int i=1; i<tablaTemp.length; i++) {
			if (tablaTemp[i]!=tablaTemp[i-1]) {
				tablaSin =Arrays.copyOf(tablaSin, tablaSin.length+1);
				tablaSin[tablaSin.length-1]=tablaTemp[i-1];
			}
		}
		if((tablaTemp[tablaTemp.length-1]!=tablaTemp[tablaTemp.length-2])) {
			tablaSin =Arrays.copyOf(tablaSin, tablaSin.length+1);
			tablaSin[tablaSin.length-1]=tablaTemp[tablaTemp.length-1];
		}
		return tablaSin;
	}
}

