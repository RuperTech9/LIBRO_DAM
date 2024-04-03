
package tema12.ejemplosPropuestos;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Crea un conjunto con los mismos elementos ordenados por edad y otro con los clientes ordenados por nombre
 * @author Ruper
 */
public class ClienteTreeSetOrdenados {
    public static void main(String[] args){
        TreeSet<Cliente> conjuntoClientes = new TreeSet<>();
        // Agregar clientes
        conjuntoClientes.add(new Cliente("111", "Marta", "12/02/2000"));
        conjuntoClientes.add(new Cliente("115", "Jorge", "16/03/1999"));
        conjuntoClientes.add(new Cliente("112", "Carlos", "01/10/2002"));
        // Mostrar clientes ordenados por DNI
        System.out.println("Clientes ordenados por DNI:");
        for (Cliente cliente : conjuntoClientes) {
            System.out.println(cliente);
        }
        
        
        // Crear TreeSet para ordenar por edad
        TreeSet<Cliente> clientesPorEdad = new TreeSet<>(Comparator.comparing(Cliente::getFechaNacimiento));
        // Agregar clientes
        clientesPorEdad.add(new Cliente("111", "Marta", "12/02/2000"));
        clientesPorEdad.add(new Cliente("115", "Jorge", "16/03/1999"));
        clientesPorEdad.add(new Cliente("112", "Carlos", "01/10/2002"));
        // Mostrar clientes ordenados por edad
        System.out.println("\nClientes ordenados por edad:");
        for (Cliente cliente : clientesPorEdad) {
            System.out.println(cliente);
        }
        
        
        // Crear TreeSet para ordenar por nombre
        TreeSet<Cliente> clientesPorNombre = new TreeSet<>(Comparator.comparing(Cliente::getNombre));
        // Agregar clientes
        clientesPorNombre.add(new Cliente("111", "Marta", "12/02/2000"));
        clientesPorNombre.add(new Cliente("115", "Jorge", "16/03/1999"));
        clientesPorNombre.add(new Cliente("112", "Carlos", "01/10/2002"));
        // Mostrar clientes ordenados por nombre
        System.out.println("\nClientes ordenados por nombre:");
        for (Cliente cliente : clientesPorNombre) {
            System.out.println(cliente);
        }
    }
}
