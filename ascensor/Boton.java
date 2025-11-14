class Boton {

    protected boolean presionado;

    public void presionar() {
        presionado = true;
    }

    public void reset() {
        presionado = false;
    }

    public boolean isPresionado() {
        return presionado;
    }

}
