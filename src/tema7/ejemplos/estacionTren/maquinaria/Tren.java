
package tema7.ejemplos.estacionTren.maquinaria;

import tema7.ejemplos.estacionTren.personal.Maquinista;


/**
 *
 * @author Ruper
 */
public class Tren {
    // ATRIBUTOS
    private Locomotora locomotora;
    private Vagon vagones[];
    private Maquinista responsable;
    private int numVagones; //num de vagones que forman el tren
    
    // CONSTRUCTOR
    public Tren(Locomotora locomotora, Maquinista responsable) {
        this.locomotora = locomotora;
        this.responsable = responsable;
        vagones = new Vagon [5];
        numVagones = 0;
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public Vagon[] getVagones() {
        return vagones;
    }

    public void setVagones(Vagon[] vagones) {
        this.vagones = vagones;
    }

    public Maquinista getResponsable() {
        return responsable;
    }

    public void setResponsable(Maquinista responsable) {
        this.responsable = responsable;
    }

    public int getNumVagones() {
        return numVagones;
    }

    public void setNumVagones(int numVagones) {
        this.numVagones = numVagones;
    }
    
    
    // METODOS
    public void enganchaVagon(int cargaMax, int cargaActual, String mercancia){
        if (numVagones >= 5){
            System.out.println("El tren no admite más vagones");
        } else {
            Vagon v = new Vagon(numVagones, cargaMax, cargaActual, mercancia);
            vagones[numVagones] = v;
            numVagones++;
        }
    }   
}