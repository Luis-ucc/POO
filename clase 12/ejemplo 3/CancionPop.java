class CancionPop extends Cancion {
    private boolean esHit;
    
    public CancionPop(String titulo, String artista, int duracionSegundos, boolean esHit) {
        super(titulo, artista, duracionSegundos);
        this.esHit = esHit;
    }
    
    @Override
    public void reproducir() {
        System.out.println("POP" + (esHit ? "  HIT" : ""));
        super.reproducir();
    }
}