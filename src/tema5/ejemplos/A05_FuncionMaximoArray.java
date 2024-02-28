package tema5.ejemplos;


public class A05_FuncionMaximoArray {
    public static void main(String[] args) {
	int r[] = {8, 41, 37, 122, 19};
	System.out.println(maximo(r));
    }
    static int maximo(int t[]) {
	int max=t[0];
	for(int i=0; i<t.length; i++) {
            if(t[i]>max) {
		max=t[i];
            }
	}
	return max;
    }
}

