
package tema4.ejemplos;

/**
 *
 * @author Ruper
 */
public class F11_EnumDias {
    public enum Dias{Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo};
	
	public static void main(String[] args){
		//codigo de la aplicacion
	Dias diaActual = Dias.Lunes;
	Dias diaSiguiente = Dias.Martes;
	
	System.out.println("Hoy es:" +diaActual+"\nMañana es:"+diaSiguiente+"\n");
	}
}