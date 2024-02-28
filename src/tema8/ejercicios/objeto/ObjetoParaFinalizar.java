
package tema8.ejercicios.objeto;

/**
 *
 * @author Ruper
 */
public class ObjetoParaFinalizar {
    private static int creados = 0;
    private static int finalizados = 0;
    private int id;

    public ObjetoParaFinalizar() {
        this.id = ++creados;
    }

    @Override
    protected void finalize() {
        finalizados++;
        System.out.println("Objeto " + id + " finalizado, contador: " + finalizados);
    }

    public static void imprimirContadores() {
        System.out.println("Total creados: " + creados + ", Total finalizados: " + finalizados);
    }
}