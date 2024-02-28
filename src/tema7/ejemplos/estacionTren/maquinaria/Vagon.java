
package tema7.ejemplos.estacionTren.maquinaria;


/**
 *
 * @author Ruper
 */
public class Vagon { // solo visible por clases vecinas
    // ATRIBUTOS
    private int numIdentificativo;
    private int cargaMax;
    private int cargaActual;
    private String mercancia;
    
    // CONSTRUCTOR
    public Vagon(int numIdentificativo, int cargaMax, int cargaActual, String mercancia) {
	this.numIdentificativo = numIdentificativo;
	this.cargaMax = cargaMax;
	this.cargaActual = cargaActual;
	this.mercancia = mercancia;
    }

    public int getNumIdentificativo() {
        return numIdentificativo;
    }

    public void setNumIdentificativo(int numIdentificativo) {
        this.numIdentificativo = numIdentificativo;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public String getMercancia() {
        return mercancia;
    }

    public void setMercancia(String mercancia) {
        this.mercancia = mercancia;
    }
    
    
}
