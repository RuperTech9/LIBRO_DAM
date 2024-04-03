
package tema12.ejemplos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Ruper
 */
public class SociosGestion {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Set<Socio> socios = new TreeSet<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("socios.dat"))){
            socios = (TreeSet<Socio>)in.readObject();  
        } catch (IOException e){
            System.out.println("Lista de socios vacía");
        } catch (ClassNotFoundException e){
            System.out.println(e);
        }
        
        int opcion;
        do {
            System.out.println("1. Alta");
            System.out.println("2. Baja");
            System.out.println("3. Modificación");
            System.out.println("4. Listado por dni");
            System.out.println("5. Listado por antigüedad");
            System.out.println("6. Salir");
            System.out.println("Introduce una opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("DNI: ");
                    String dni;
                    dni = sc.next();
                    alta(socios, dni);
                    break;
                case 2:
                    System.out.println("DNI del socio a eliminar: ");
                    dni = sc.next();
                    socios.remove(new Socio(dni));
                    break;
                case 3:
                    System.out.println("DNI del socio a modificar: ");
                    dni = sc.next();
                    socios.remove(new Socio(dni));
                    alta(socios, dni);
                    break;
                case 4:
                    System.out.println(socios);
                    break;
                case 5:
                    Comparator<Socio> c = new Comparator<>() {
                        @Override
                        public int compare(Socio o1, Socio o2) {
                            return o2.antiguedad() - o1.antiguedad();
                        }
                    };
                    Set<Socio> s = new TreeSet<>(c);
                    s.addAll(socios);
                    System.out.println(s);
                    break;
                default:
                    System.out.println("\nOpción no válida. Introduce un número entre 1 y 6.");
                    break;
            } // FIN SWITCH
        } while (opcion != 6); // FIN DO-WHILE
        try ( ObjectOutputStream out = new ObjectOutputStream ( new FileOutputStream("socios.dat"))) {
            out.writeObject(socios);
        }catch (IOException e) {
            System.out.println(e);
        }
    }
    
    static boolean alta (Set<Socio> socios, String dni) {
        System.out.print("nombre: ");
        String nombre = sc.next();
        System.out.print("fecha de alta: ");
        String fechaAlta = sc.next();
        Socio nuevo = new Socio (dni, nombre, fechaAlta);
        return socios.add(nuevo);
    }
}
