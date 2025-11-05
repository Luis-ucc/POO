public class Camara {
    private String marca;
    private String modelo;

    public Camara(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("Cámara: " + marca + " " + modelo);
    }

    public Foto tomarFoto(String nombreArchivo) {
        System.out.println("¡Click! Foto tomada con " + marca + " " + modelo + " -> " + nombreArchivo);
        return new Foto(nombreArchivo);
    }
}