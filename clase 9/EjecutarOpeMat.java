import java.util.Scanner;

public class EjecutarOpeMat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

                int opcion;
        
        do {
        System.out.print("digite el primer numero...");
        int a = sc.nextInt();
        System.out.print("digite el segundo numero...");
        int b = sc.nextInt();
        OperacionesMatematicas objOp = new OperacionesMatematicas(a,b);
         
            System.out.println("===== CALCULADORA =====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Elevar a la potencia de 2");
            System.out.println("6. Elevar al cubo");
            System.out.println("7. Elevar a la n");
            System.out.println("8. Sacar raíz cuadrada");
            System.out.println("9. Sacar raíz cúbica");
            System.out.println("10. Sacar raíz n");
            System.out.println("11. Salir");
            System.out.println("=======================");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.nextInt();
            
    
            switch (opcion) {
                case 1:
                    System.out.println("\nHa seleccionado: Sumar");
                    System.out.println("El resultado de la suma es: " + objOp.sumar());
                 
                    break;
                    
                case 2:
                    System.out.println("\nHa seleccionado: Restar");
                    System.out.println("El resultado de la resta es: " + objOp.restar());
                 
                    break;
                    
                case 3:
                    System.out.println("\nHa seleccionado: Multiplicar");
                    System.out.println("El resultado de la multiplicacion es: " + objOp.multiplicar());
              
                    break;
                    
                case 4:
                    System.out.println("\nHa seleccionado: Dividir");
                     System.out.println("el resultado de la division es: " + objOp.dividir());
                 
                    break;
                    
                case 5:
                    System.out.println("\nHa seleccionado: Elevar a la potencia de 2");
                     System.out.println("el resultado de elevar los 2 numeros al cuadrado es: " + objOp.potencia());
                  
                    break;
                    

            }
            
        } while (opcion != 11);



        
        
        
       
       


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
