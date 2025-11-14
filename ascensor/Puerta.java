class Puerta { 

    private boolean abierta = false; 


    public void abrir() { 
        abierta = true; 
        System.out.println(" Puerta abierta."); 
    } 

 
    public void cerrar() { 
        abierta = false; 
        System.out.println(" Puerta cerrada."); 
    } 

 
    public boolean isAbierta() { 
        return abierta; 
    } 

} 