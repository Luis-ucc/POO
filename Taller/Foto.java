public class Foto {
    private String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public String getFichero() {
        return fichero;
    }

    public void setFichero(String fichero) {
        this.fichero = fichero;
    }

    public void print() {
        System.out.println("Imprimiendo foto: " + fichero + " | Tamaño: 4x6 | Calidad: Alta");
    }

    public void mostrarInfo() {
        System.out.println("Foto: " + fichero);
    }
}