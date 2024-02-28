
package tema7.ejemplos.estacionTren.maquinaria;

import tema7.ejemplos.estacionTren.personal.Mecanico;




/**
 *
 * @author Ruper
 */
public class Locomotora {
    // ATRIBUTOS
    public String matricula;
    public int potencia;
    public int añoFabricacion;
    Mecanico mec;
    
    // CONSTRUCTOR
    public Locomotora(String matricula, int potencia, int añoFabricacion, Mecanico mec) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.añoFabricacion = añoFabricacion;
        this.mec = mec;
    }   

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public Mecanico getMec() {
        return mec;
    }

    public void setMec(Mecanico mec) {
        this.mec = mec;
    }
    
    
}
