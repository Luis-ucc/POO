import java.util.LinkedList;

import java.util.Queue;

class Ascensor {

    private int pisoActual;
    private String direccion;
    private Puerta puerta;
    private Sensor sensor;
    private Queue<Integer> solicitudes;

    public Ascensor() {

        pisoActual = 1;

        direccion = "detenido";

        puerta = new Puerta();

        sensor = new Sensor();

        solicitudes = new LinkedList<>();

    }

    public void solicitarPiso(int destino) {
        if (!solicitudes.contains(destino)) {
            solicitudes.add(destino);
            System.out.println(" Solicitud registrada para el piso " + destino);
            moverAutomatico();

        }

    }

    private void moverAutomatico() {
        while (!solicitudes.isEmpty()) {

            int destino = solicitudes.peek();

            if (sensor.detectarFalla()) {
                System.out.println(" Falla detectada. Ascensor detenido en el piso " + pisoActual);
                puerta.abrir();
                solicitudes.clear();
                return;

            }

            if (pisoActual < destino) {
                direccion = "subiendo";
                pisoActual++;
            } else if (pisoActual > destino) {
                direccion = "bajando";
                pisoActual--;
            } else {

                direccion = "detenido";

                puerta.abrir();
                System.out.println(" Llegó al piso " + pisoActual);
                solicitudes.poll();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                puerta.cerrar();
            }

            System.out.println(" Piso actual: " + pisoActual + " (" + direccion + ")");

            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {

            }

        }

        direccion = "detenido";

        System.out.println(" No hay más solicitudes pendientes.");

    }

    public int getPisoActual() {
        return pisoActual;
    }

}