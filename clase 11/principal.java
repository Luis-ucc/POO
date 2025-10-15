public class principal {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("juan camilo", "100001", 1000);
        cuenta.depositar(70000);
        cuenta.retiro(30000);
        System.out.println(cuenta.toString());

        CuentaBancaria cuenta2 = new CuentaBancaria("diego", "123423", 19000);
        cuenta2.depositar(-100);
        cuenta2.retiro(20000);
        System.out.println(cuenta2.toString());

        System.out.println("-------------------------------------");

        Producto p1 = new Producto("camiseta", "ropa", 300, 200);
        System.out.println(p1.calcularSubT());
        System.out.println(p1.Apliclardescuento());
        System.out.println(p1.toString());

        System.out.println("despues de agregar mas cantidad");
        p1.agregarCantidad(20);
        System.out.println(p1.toString());
        

    }
} 

