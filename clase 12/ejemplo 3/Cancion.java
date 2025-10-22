class Cancion {
    protected String titulo;
    protected String artista;
    protected int duracionSegundos;
    
    public Cancion(String titulo, String artista, int duracionSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracionSegundos = duracionSegundos;
    }
    
    public String getDuracion() {
        int minutos = duracionSegundos / 60;
        int segundos = duracionSegundos % 60;
        return minutos + ":" + String.format("%02d", segundos);
    }
    
    public void reproducir() {
        System.out.println("♪ " + titulo + " - " + artista);
        System.out.println("Duración: " + getDuracion());
    }
}