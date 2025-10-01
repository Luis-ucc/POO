public class EjecutarOpeMat {

    public static void main(String[] args) {
        
        OperacionesMatematicas objOp = new OperacionesMatematicas(8,6);


        System.out.println("El resultado de la suma es: " + objOp.sumar());
        System.out.println("El resultado de la resta es: " + objOp.restar());
        System.out.println("El resultado de la multiplicacion es: " + objOp.multiplicar());
        System.out.println("el resultado de la division es: " + objOp.dividir());


    }
    
}
