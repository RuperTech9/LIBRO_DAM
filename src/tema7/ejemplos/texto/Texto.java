
package tema7.ejemplos.texto;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Ruper
 */
public class Texto {
    // ATRIBUTOS
    private String texto;
    LocalDate creacion;
    LocalDateTime ultimaModificacion;
    private final int LONGITUD_MAX;
    static final String VOCALES = "aeiouáéíóú";
    
    // CONSTRUCTORES
    public Texto(int LONGITUD_MAX) {
        texto = "";
        this.LONGITUD_MAX = LONGITUD_MAX;
        creacion = LocalDate.now();
        ultimaModificacion = null;
    }
    
    // METODOS para añadir al FINAL
    public void añadirFinal(char c) { // añade carácter al final del texto
        if(LONGITUD_MAX > texto.length()){
            texto = texto + c; // Concatena carácter al final
            ultimaModificacion = LocalDateTime.now();
        }
    }
    public void añadirFinal(String c) { // añade cadena al final del texto
        if(LONGITUD_MAX >= texto.length() + c.length()){
            texto = texto + c; // Concatena cadena al final
            ultimaModificacion = LocalDateTime.now();
        }
    }
    
    // METODOS para añadir al PRINCIPIO
    public void añadirPrincipio(char c) { // añade cadena al principio del texto
        if(LONGITUD_MAX > texto.length()){
            texto = c + texto; // Concatena cadena al final
            ultimaModificacion = LocalDateTime.now();
        }
    }
    public void añadirPrincipio(String c) { // añade cadena al principio del texto
        if(LONGITUD_MAX >= texto.length() + c.length()){
            texto = c + texto; // Concatena cadena al final
            ultimaModificacion = LocalDateTime.now();
        }
    }
    
    public void mostrar(){
        System.out.println(texto);
        System.out.println("\nTexto creado el " + creacion);
        System.out.println("Ultima modificación: " + ultimaModificacion);
    }
    
    public int numVocales() {
        int vocales = 0;
        for (int i = 0; i< texto.length(); i++){
            if(esVocal(texto.charAt(i))){
                vocales++;
            }
        }
        return vocales;
    }
    
    private boolean esVocal(char c) {
        boolean vocal = false;
        
        c = Character.toLowerCase(c);
        if(VOCALES.indexOf(c) != -1){
            vocal = true;
        }
        return vocal;
    }
}
