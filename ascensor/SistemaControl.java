import java.util.ArrayList;
import java.util.List;

class SistemaControl {
    private Ascensor ascensor;
    private List<Piso> pisos;

    public SistemaControl(int cantidadPisos) {
        ascensor = new Ascensor();
        pisos = new ArrayList<>();
        for (int i = 1; i <= cantidadPisos; i++) {
            pisos.add(new Piso(i, cantidadPisos));
        }
    }

    public void solicitarDesdePiso(int piso) {
        System.out.println(" Llamada desde el piso " + piso);
        ascensor.solicitarPiso(piso);
    }

    public void solicitarDesdeCabina(int destino) {
        System.out.println(" Destino seleccionado: piso " + destino);
        ascensor.solicitarPiso(destino);
    }

    public int getPisoActual() {
        return ascensor.getPisoActual();
    }
}