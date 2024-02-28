
package tema7.ejercicios.cambioImporte;

/**
 *
 * @author Ruper
 */
public class CambioImporte {
    // ATRIBUTOS
    // Aray de billetes y monedas
    private static final int[] BILLETES_MONEDAS = {100, 50, 20, 10, 5, 2, 1};
    
    // CONSTRUCTOR
    public CambioImporte(){}
    
    // METODO1
    public static int[] calcularCambio(int importe) {
        int[] cambio = new int[BILLETES_MONEDAS.length];
        
        for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
            if (importe >= BILLETES_MONEDAS[i]) {
                cambio[i] = importe / BILLETES_MONEDAS[i];
                importe = importe % BILLETES_MONEDAS[i];
            }
        }
        return cambio;
    }
    
    // METODO2
    public static void calcularCambio2(int importe) {
        System.out.println("Importe: " + importe + "€");
    
        //EL MÉTODO ITERA SOBRE EL ARRAY DE BILLETES Y MONEDAS Y, PARA CADA UNO DE ELLOS, 
        for (int billeteMoneda : BILLETES_MONEDAS) {
            int numeroBilletesMonedas = importe / billeteMoneda; //DIVIDE EL IMPORTE POR SU VALOR PARA CALCULAR EL NÚMERO DE BILLETES O MONEDAS NECESARIOS PARA DAR EL CAMBIO
            importe %= billeteMoneda; //EL IMPORTE RESTANTE SE ACTUALIZA UTILIZANDO EL OPERADOR MÓDULO
            System.out.println(numeroBilletesMonedas + " x " + billeteMoneda + "€");
        }
    }
    
    public static void mostrarCambio(int importe) {
        int[] cambio = calcularCambio(importe);
        System.out.println("Cambio para " + importe + " con el menor número de monedas y billetes:");
        for (int i = 0; i < cambio.length; i++) {
            if (cambio[i] != 0) {
                System.out.println(BILLETES_MONEDAS[i] + " : " + cambio[i]);
            }
        }
    }

}
