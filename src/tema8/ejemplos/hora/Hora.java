
package tema8.ejemplos.hora;

/**
 *
 * @author Ruper
 */
public class Hora {
    protected int hora, minutos; //atributos protegidos pensados para heredar
	
    Hora (int hora, int minutos){ //Constructor
	this.hora = 0;
	this.minutos = 0;
		
	if (!setHora(hora)) {
            System.out.println("La hora es incorrecta");
	}
	if (!setMinutos(minutos)) {
            System.out.println("Los minutos no son válidos");
	}
    }
    public void inc() {
	minutos++;
        if (minutos > 59) {
            minutos = 0;
            hora++;
            if (hora > 23) {
		hora = 0;
            }
	}
    }	
    public boolean setMinutos(int minutos) {
	boolean correcto = false;
        if(0 <= minutos && minutos < 60) {
            this.minutos = minutos;
            correcto = true;
        }
        return correcto;
    }	
    public boolean setHora (int hora) {
	boolean correcto = false;
        if(0 <= hora && hora < 24) {
            this.hora = hora;
            correcto = true;
        }
	return correcto;			
    }
    @Override
    public String toString() {
	String resultado;
	resultado = hora + ":" + minutos;
	return resultado;
    }
}
