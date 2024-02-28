
package tema5.ejercicios;

/**
 * DFS significa "Depth-First Search" (Búsqueda en Profundidad).
 * 
 * @author Ruper
 */
public class A28_MapaDosLugaresROL {
    public static boolean esPosibleViajar(int[][] mapa, int lugarInicial, int lugarDestino) {
        // Verificar si el lugar inicial y el lugar destino son válidos
        if (lugarInicial < 0 || lugarInicial >= mapa.length || lugarDestino < 0 || lugarDestino >= mapa.length) {
            return false;
        }

        // Crear un array para marcar los lugares visitados
        boolean[] visitados = new boolean[mapa.length];

        // Llamar a la función auxiliar para realizar la búsqueda en profundidad
        return dfs(mapa, lugarInicial, lugarDestino, visitados);
    }

    // Función auxiliar para realizar la búsqueda en profundidad
    private static boolean dfs(int[][] mapa, int lugarActual, int lugarDestino, boolean[] visitados) {
        // Marcar el lugar actual como visitado
        visitados[lugarActual] = true;

        // Si el lugar actual es el destino, retornar true
        if (lugarActual == lugarDestino) {
            return true;
        }

        // Recorrer los lugares conectados al lugar actual
        for (int lugar = 0; lugar < mapa.length; lugar++) {
            // Verificar si hay una conexión desde el lugar actual hacia el lugar siguiente y si el lugar siguiente no ha sido visitado
            if (mapa[lugarActual][lugar] == 0 && !visitados[lugar]) {
                // Llamar recursivamente a dfs para explorar el lugar siguiente
                if (dfs(mapa, lugar, lugarDestino, visitados)) {
                    return true; // Si se encuentra una ruta, retornar true
                }
            }
        }

        // Si no se encuentra ninguna ruta desde el lugar actual al destino, retornar false
        return false;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int[][] mapa = {
            {0, 1, 1, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0},
            {0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0}
        };

        int lugarInicial = 0;
        int lugarDestino = 4;

        if (esPosibleViajar(mapa, lugarInicial, lugarDestino)) {
            System.out.println("Es posible viajar desde el lugar " + lugarInicial + " al lugar " + lugarDestino + ".");
        } else {
            System.out.println("No es posible viajar desde el lugar " + lugarInicial + " al lugar " + lugarDestino + ".");
        }
    }
}
