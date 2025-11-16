class Piso { 

    private int numero; 
    private BotonPiso subir; 
    private BotonPiso bajar; 

 
    // dependiendo del piso el ascensor subira o bajara
    public Piso(int numero, int totalPisos) { 
        this.numero = numero; 
        if (numero < totalPisos) 
            subir = new BotonPiso(numero, "subir"); 
        if (numero > 1) 
            bajar = new BotonPiso(numero, "bajar"); 
    } 

    public int getNumero() { 
        return numero; 
    } 

} 