class CancionRock extends Cancion {
    private String subgenero;

    public CancionRock(String titulo, String artista, int duracionSegundos, String subgenero) {
        super(titulo, artista, duracionSegundos);
        this.subgenero = subgenero;
    }

    @Override
    public void reproducir() {
        System.out.println(" ROCK - " + subgenero);
        super.reproducir();
    }
}