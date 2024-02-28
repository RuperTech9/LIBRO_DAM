
package tema7.ejemplos.lista;

/**
 *
 * @author Ruper
 */
public class ListaMAIN {
    public static void main(String[] args) {
	Lista l1 = new Lista();
	Lista l2 = new Lista();
	l1.insertarFinal(6);
	l1.insertarFinal(7);
	l1.insertarFinal(8);
	l1.insertarFinal(9);
	l1.insertarFinal(10);
	l1.mostrar();
	l1.insertarPrincipio(5);
	l1.insertarPrincipio(4);
	l1.insertarPrincipio(3);
	l1.insertarPrincipio(2);
	l1.insertarPrincipio(1);
	l1.mostrar();
	System.out.println();
	l1.insertar(2, 99);
	l1.mostrar();
	l1.eliminar(2);
	l1.mostrar();
	System.out.println(l1.buscar(4));
	System.out.println();
	l2.insertarFinal(10);
	l2.insertarFinal(20);
	l2.insertarFinal(30);
	l2.insertarFinal(40);
	l2.insertarFinal(50);		
	l1.insertarFinal(12);
	l1.mostrar();
	l2.mostrar();
	System.out.println("\nNúmero de elementos de la Lista 1: " + l1.numeroElementos());
	System.out.println("Número de elementos de la Lista 2: " + l2.numeroElementos());
	System.out.println("\nElemento correspondiente a su índice: " + l1.get(2));
	System.out.println("Elemento correspondiente a su índice: " + l1.get(5));
        
        
        Lista l3 = new Lista();
        Lista l4 = new Lista();
	l3.insertarFinal(6);
	l3.insertarFinal(7);
	l3.insertarFinal(8);
	l3.insertarFinal(9);
	l4.insertarFinal(10);
	l4.insertarFinal(20);
	l4.insertarFinal(30);
        Lista concatenacion = Lista.concatena(l3,l4);
        System.out.println("\nLista Concatenada");
        concatenacion.mostrar();
        
    }
}
