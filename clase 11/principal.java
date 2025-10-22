public class principal {
    public static void main(String[] args) {
        CuentaBancaria banco = new CuentaBancaria("juan camilo", "100001", 1000);
        banco.depositar(1);
        banco.retiro(1020);
        System.out.println(banco.toString());

        CuentaBancaria cuenta2 = new CuentaBancaria("diego", "123423", 19000);
        cuenta2.depositar(-100);
        cuenta2.retiro(20000);
        System.out.println(cuenta2.toString());

        System.out.println("-------------------------------------");

        Producto p0 = new Producto("pantalon", "ropa", 300, 200);
        System.out.println(p0.calcularSubT());
        System.out.println(p0.Apliclardescuento());
        System.out.println(p0.toString());

        System.out.println("despues de agregar mas cantidad");
        p0.agregarCantidad(20);
        System.out.println(p0.toString());
        

    }
} 

