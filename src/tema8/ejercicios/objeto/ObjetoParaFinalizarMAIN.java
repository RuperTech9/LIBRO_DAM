
package tema8.ejercicios.objeto;

/**
 *
 * @author Ruper
 */
public class ObjetoParaFinalizarMAIN {
    public static void main(String[] args) throws InterruptedException {
        // Crear una gran cantidad de objetos para forzar al recolector de basura
        for (int i = 0; i < 100; i++) {
            ObjetoParaFinalizar obj = new ObjetoParaFinalizar();
        }

        // Imprimir los contadores antes de solicitar la recolección de basura
        ObjetoParaFinalizar.imprimirContadores();
        
        // Sugerir al recolector de basura que recolecte
        System.gc();
        
        // Proporcionar un poco de tiempo para que el recolector de basura haga su trabajo
        Thread.sleep(1000);
        
        // Imprimir los contadores después de la recolección de basura
        ObjetoParaFinalizar.imprimirContadores();
    }
}
