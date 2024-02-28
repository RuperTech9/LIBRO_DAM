
package tema8.ejemplos.hora;

/**
 *
 * @author Ruper
 */
public class HoraExacta extends Hora{ // Heredamos de la clase Hora
    // ATRIBUTO
    protected int segundos;
    
    // CONSTRUCTOR
    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos); // Constructor de la superclase
        if (!setSegundos(segundos)){ // Asignar valores
            System.out.println("Segundos incorrectos");
        }
    }
    
    // METODO para asignar segundos
    public boolean setSegundos(int segundos){
        boolean correcto = false;
        if(0<= segundos && segundos <60){
            this.segundos=segundos;
            correcto = true;
        }
        return correcto;
    }
    
    // METODO para incrementar segundos en vez de minutos 
    @Override //sobreescribimos método
    public void inc(){
        segundos++;
        if(segundos>59){
            segundos = 0;
            super.inc();
        }
    }
    
    // METODO para mostrar los segundos
    @Override //sobreescribimos método
    public String toString() {
	String result = super.toString(); // toString() de la superclase
	result += ":" + segundos; // añadimos los segundos
	return result;
    }
    
    // METODO para comparar 2 horas
    @Override
    public boolean equals(Object o) { // Sobreescribimos metodo equals() heredado de la clase Object
	HoraExacta otroReloj = (HoraExacta) o; // mismo objeto está referenciado (objeto que convertimos a HoraExacta (cast))
	boolean iguales;
	if (this.hora == otroReloj.hora // si las horas son iguales
            && this.minutos == otroReloj.minutos // y los minutos son iguales
            && this.segundos == otroReloj.segundos) { // y los segundos son iguales
                iguales = true; // son iguales
	} else {
            iguales = false; // no son iguales
	}
	return iguales;
    }
    
}
