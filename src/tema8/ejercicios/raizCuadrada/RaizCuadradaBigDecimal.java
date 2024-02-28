
package tema8.ejercicios.raizCuadrada;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Ruper
 */
public class RaizCuadradaBigDecimal {
    public static void main(String[] args) {
        // Definir el número 2 como un BigDecimal con alta precisión
        BigDecimal numeroDos = new BigDecimal("2");

        // Establecer la escala para la precisión deseada (100 cifras significativas)
        int escala = 100;

        // Calcular la raíz cuadrada de 2 con la precisión especificada
        BigDecimal raizCuadrada = calcularRaizCuadrada(numeroDos, escala);

        // Imprimir el resultado
        System.out.println("Raíz cuadrada de 2 con 100 cifras significativas:");
        System.out.println(raizCuadrada);
    }

    // Método para calcular la raíz cuadrada con precisión personalizada
    public static BigDecimal calcularRaizCuadrada(BigDecimal numero, int escala) {
        BigDecimal uno = BigDecimal.ONE;
        BigDecimal dos = new BigDecimal("2");

        BigDecimal aproximacionInicial = numero.divide(dos, escala, RoundingMode.HALF_UP);
        BigDecimal resultadoAnterior = BigDecimal.ZERO;
        BigDecimal resultado = aproximacionInicial;

        while (!resultado.equals(resultadoAnterior)) {
            resultadoAnterior = resultado;
            resultado = numero.divide(resultadoAnterior, escala, RoundingMode.HALF_UP);
            resultado = resultado.add(resultadoAnterior);
            resultado = resultado.divide(dos, escala, RoundingMode.HALF_UP);
        }

        return resultado;
    }
}
