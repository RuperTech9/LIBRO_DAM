
package tema7.ejemplos.hora;

/**
 *
 * @author Ruper
 */
public class Hora {
    // ATRIBUTOS
    private byte hora;
    private byte minuto;
    private byte segundo;
    
 
    // GETTERS
    public byte getHora() {
        return hora;
    }
    public byte getMinuto() {
        return minuto;
    }
    public byte getSegundo() {
        return segundo;
    }
    // SETTERS
    public void setHora(int hora) {
        if(0 <= hora && hora <=23){
            this.hora = (byte) hora;
        } else {
            this.hora = 0;
        } 
    }
    public void setMinuto(int minuto) {
        if(0 <= minuto && minuto <=59){
            this.minuto = (byte) minuto;
        } else {
            this.minuto = 0;
        } 
    }
    public void setSegundo(int segundo) {
        if(0 <= segundo && segundo <=59){
            this.segundo = (byte) segundo;
        } else {
            this.segundo = 0;
        } 
    }
    
    // METODOS
    public void incrementarSegundo(){
        segundo++;
        if(segundo == 60){
            segundo =0;
            minuto++;
        }if(minuto==60){
            minuto=0;
            hora++;
        }if(hora==24){
            hora=0;
        } 
    }
    
    
}
