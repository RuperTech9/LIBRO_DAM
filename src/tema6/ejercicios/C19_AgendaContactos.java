
package tema6.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Ruper
 */
class Contacto {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}

public class C19_AgendaContactos {
    private static final int MAX_CONTACTOS = 100;
    private Contacto[] contactos = new Contacto[MAX_CONTACTOS];
    private int numContactos = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        C19_AgendaContactos agenda = new C19_AgendaContactos();

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Añadir un nuevo contacto");
            System.out.println("2. Buscar teléfono de un contacto");
            System.out.println("3. Mostrar todos los contactos");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner
            
            switch (opcion) {
                case 1:
                    agenda.agregarContacto(scanner);
                    break;
                case 2:
                    agenda.buscarContacto(scanner);
                    break;
                case 3:
                    agenda.mostrarContactos();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    public void agregarContacto(Scanner scanner) {
        if (numContactos < MAX_CONTACTOS) {
            System.out.print("Ingrese el nombre del contacto: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el teléfono del contacto: ");
            String telefono = scanner.nextLine();
            contactos[numContactos] = new Contacto(nombre, telefono);
            numContactos++;
            System.out.println("Contacto añadido correctamente.");
        } else {
            System.out.println("La agenda está llena. No se pueden agregar más contactos.");
        }
    }

    public void buscarContacto(Scanner scanner) {
        System.out.print("Ingrese el nombre del contacto a buscar: ");
        String nombre = scanner.nextLine().toLowerCase();
        boolean encontrado = false;
        for (int i = 0; i < numContactos; i++) {
            if (contactos[i].getNombre().toLowerCase().equals(nombre)) {
                System.out.println("El teléfono de " + contactos[i].getNombre() + " es: " + contactos[i].getTelefono());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El contacto no se encuentra en la agenda.");
        }
    }

    public void mostrarContactos() {
        if (numContactos == 0) {
            System.out.println("No hay contactos en la agenda.");
        } else {
            System.out.println("Lista de contactos:");
            for (int i = 0; i < numContactos; i++) {
                System.out.println(contactos[i].getNombre() + ": " + contactos[i].getTelefono());
            }
        }
    }
}