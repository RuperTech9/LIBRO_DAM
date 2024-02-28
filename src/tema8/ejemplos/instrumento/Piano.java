
package tema8.ejemplos.instrumento;

/**
 *
 * @author Ruper
 */
public class Piano extends Instrumento{
    // CONSTRUCTOR
    public Piano() {
	super(); // Constructor superclase
    }
    @Override // implementamos el metodo abstracto
	public void interpretar() {
            for (Nota nota: melodia) { // Recorremos las notas
		switch (nota) {
                    case DO: 
                        System.out.println("do ");
                        break;
                    case RE: 
                        System.out.println("re ");
			break;
                    case MI:
                        System.out.println("mi ");
			break;
                    case FA: 
                        System.out.println("fa ");
			break;
                    case SOL: 
                        System.out.println("sol ");
			break;
                    case LA: 
                        System.out.println("la ");
			break;
                    case SI: 
                        System.out.println("si ");
			break;	
		}
            }
            System.out.println("");
	}
}
