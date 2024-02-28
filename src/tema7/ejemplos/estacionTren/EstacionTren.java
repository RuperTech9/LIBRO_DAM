package tema7.ejemplos.estacionTren;


import java.util.Date; // Cambio a java.util.Date
import tema7.ejemplos.estacionTren.maquinaria.Locomotora;
import tema7.ejemplos.estacionTren.maquinaria.Tren;
import tema7.ejemplos.estacionTren.maquinaria.Vagon;
import tema7.ejemplos.estacionTren.personal.JefeEstacion;
import tema7.ejemplos.estacionTren.personal.Maquinista;
import tema7.ejemplos.estacionTren.personal.Mecanico;

public class EstacionTren {

    public static void main(String[] args) {
        // Crear instancias de personal
        Maquinista maquinista = new Maquinista("Ana García", "12345678A", 3000.0, "Jefe de tren");
        System.out.println("Maquinista: " + maquinista.getNombre() + ", DNI: " + maquinista.getDni() + ", Sueldo: " + maquinista.getSueldo() + ", Rango: " + maquinista.getRango());

        Mecanico mecanico = new Mecanico("Luis Martínez", "987654321", Mecanico.Especialidad.MOTOR);
        System.out.println("Mecánico: " + mecanico.getNombre() + ", Teléfono: " + mecanico.getTelefono() + ", Especialidad: " + mecanico.getEspecialidad());

        JefeEstacion jefeEstacion = new JefeEstacion("Carlos Ruiz", "87654321B", new Date());
        System.out.println("Jefe de estación: " + jefeEstacion.getNombre() + ", DNI: " + jefeEstacion.getDni() + ", Nombramiento: " + jefeEstacion.getNombramiento());

        // Crear la locomotora y asignarle un mecánico
        Locomotora locomotora = new Locomotora("1234ABC", 5000, 2020, mecanico);
        System.out.println("Locomotora: Matrícula: " + locomotora.getMatricula() + ", Potencia: " + locomotora.getPotencia() + ", Año de fabricación: " + locomotora.getAñoFabricacion());

        // Crear el tren y asignarle una locomotora y un maquinista
        Tren tren = new Tren(locomotora, maquinista);

        // Enganchar vagones al tren
        tren.enganchaVagon(10000, 5000, "Mercancías peligrosas");
        tren.enganchaVagon(8000, 4000, "Alimentos perecederos");
        tren.enganchaVagon(7500, 3000, "Electrodomésticos");

        // Imprimir información del tren y sus vagones
        System.out.println("Tren con locomotora " + tren.getLocomotora().getMatricula() + " y maquinista " + tren.getResponsable().getNombre());
        for (int i = 0; i < tren.getNumVagones(); i++) {
            Vagon vagon = tren.getVagones()[i];
            System.out.println("Vagón " + vagon.getNumIdentificativo() + ": carga máxima " + vagon.getCargaMax() + ", carga actual " + vagon.getCargaActual() + ", mercancía " + vagon.getMercancia());
        }
    }
}
