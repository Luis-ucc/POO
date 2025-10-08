public class OperacionesMatematicas {
//atributos
    private int n1;
    private int n2;

    //constructor de la clase

    public OperacionesMatematicas(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    
    //metodos
    public int sumar(){
        return n1 + n2;
    }

    public int restar(){
        return n1 - n2;
    }

    public int multiplicar(){
        return n1 * n2;
    }

    public double dividir(){
        double resultado;
        if(n2 == 0){
            resultado = 0.0;
        }else {
            resultado = (double) n1 / (double) n2;
        }
        return resultado;
    }

    public double potencia(){
        return Math.pow(n1, 2);
        
    }
}
