
package tema7.ejemplos.sintonizadorFM;

/**
 *
 * @author Ruper
 */
public class SintonizadorFM {
    // ATRIBUTOS
    double frecuencia;
    
    // CONSTRUCTOR
    public SintonizadorFM(double frecuenciaInicial){
        if(frecuenciaInicial < 80){
            frecuencia = 80;
        } else if(frecuenciaInicial > 108){
            frecuencia = 108;
        } else {
            frecuencia = frecuenciaInicial;
        }
    }
    public SintonizadorFM(){
        this(80);
    }
    
    // METODOS PUBLICOS
    public double subir(){
        frecuencia += 0.5;
        comprobarRango();
        return frecuencia;
    }
    public double bajar(){
        frecuencia -= 0.5;
        comprobarRango();
        return frecuencia;
    }
    public void display(){
        System.out.println("Sintonizando: "+ frecuencia + " MHz");
    }
    
    // METODO PRIVADO
    private void comprobarRango(){
        if(frecuencia < 80){
            frecuencia = 108;
        } else if (frecuencia > 108) {
            frecuencia = 80;
        }
    }
}
