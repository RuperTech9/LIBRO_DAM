
package tema8.ejercicios.punto;

import java.util.Objects;

/**
 *
 * @author Ruper
 */
public class Suceso extends Punto3D {
    private String descripcion;
    private int tiempo;

    public Suceso(int x, int y, int z, String descripcion, int tiempo) {
        super(x, y, z);
        this.descripcion = descripcion;
        this.tiempo = tiempo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getTiempo() {
        return tiempo;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Suceso suceso = (Suceso) o;
        return tiempo == suceso.tiempo &&
            Objects.equals(descripcion, suceso.descripcion) &&
            super.equals(o); // Llamamos al equals de la clase padre (Punto3D)
    }
    
    @Override
    public String toString() {
        return "Suceso{" +
                "descripcion='" + descripcion + '\'' +
                ", tiempo=" + tiempo +
                ", coordenadas=" + super.toString() +
                '}';
    }

    
}
