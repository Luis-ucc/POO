public class Ejecutarpersona {

    public static void main(String[] args) {
        

        persona objpersona1 = new persona(10000, "juan manuel", "quijano lopez", 23, 1.80, 70.1);

        System.out.println(objpersona1.estudiar("ingenieria de sistemas"));


        persona objpersona2 = new persona(1020203, "camilo", "escobar", 23, 1.79, 85);
        System.out.println("edad: " + objpersona1.getEdad());

        System.out.println(objpersona2.estudiar("ingeniera de industrial"));


        objpersona2.setEdad(30);
        System.out.println("modificacion de edad: " + objpersona2.getEdad());
    }
        //implementar los metodos get y set en la clase persona
        // dichos metodos utilizarlos en la clase para la proxima clase
}
