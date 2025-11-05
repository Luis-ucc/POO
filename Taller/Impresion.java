import java.util.ArrayList;

public class Impresion {
    private String color;
    private ArrayList<Foto> fotos;

    public Impresion(String color, ArrayList<Foto> fotos) {
        this.color = color;
        this.fotos = fotos;
    }

    public String getColor() {
        return color;
    }

    public ArrayList<Foto> getFotos() {
        return fotos;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFotos(ArrayList<Foto> fotos) {
        this.fotos = fotos;
    }

    public void mostrarInfo() {
        System.out.println("=== IMPRESIÓN ===");
        System.out.println("Tipo: " + color);
        System.out.println("Fotos incluidas:");
        for (Foto foto : fotos) {
            System.out.println("  - " + foto.getFichero());
        }
        System.out.println("Total de fotos: " + fotos.size());
    }

    public void agregarFoto(Foto foto) {
        fotos.add(foto);
    }
}