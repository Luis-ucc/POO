import java.util.Scanner;

public class EjecutarOpeMat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("digite el primer numero...");
        int a = sc.nextInt();
        System.out.print("digite el segundo numero...");
        int b = sc.nextInt();
        OperacionesMatematicas objOp = new OperacionesMatematicas(a,b);


        System.out.println("El resultado de la suma es: " + objOp.sumar());
        System.out.println("El resultado de la resta es: " + objOp.restar());
        System.out.println("El resultado de la multiplicacion es: " + objOp.multiplicar());
        System.out.println("el resultado de la division es: " + objOp.dividir());


        sc.close();

       //tarea: implementar los métodos: elevar el cuadrado
       // -elevar al cubo
       // - elevar a la n
       // - sacar la raiz cuadrada
       // - sacar la raiz cubica
       // - sacar la raiz n 
       // todo con menu de opciones  
    }
}
