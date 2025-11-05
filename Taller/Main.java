import java.util.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("---- SISTEMA DE GESTIÓN DE FOTOGRAFÍA ---\n");

        Cliente cliente1 = new Cliente("12345678", "María González");
        Cliente cliente2 = new Cliente("87654321", "Carlos Rodríguez");

        Producto producto1 = new Producto(1011);
        Producto producto2 = new Producto(1022);
        Producto producto3 = new Producto(1033);

        Camara camara1 = new Camara("Nikon", "D3500");
        Camara camara2 = new Camara("Sony", "A6400");

        Foto foto1 = new Foto("vacaciones_playa.jpg");
        Foto foto2 = new Foto("cumpleaños_familia.jpg");
        Foto foto3 = new Foto("bodas_amigos.jpg");
        Foto foto4 = new Foto("paisaje_montaña.jpg");

        ArrayList<Foto> fotosImpresion1 = new ArrayList<>();
        fotosImpresion1.add(foto1);
        fotosImpresion1.add(foto2);

        ArrayList<Foto> fotosImpresion2 = new ArrayList<>();
        fotosImpresion2.add(foto3);
        fotosImpresion2.add(foto4);

        Impresion impresion1 = new Impresion("Color", fotosImpresion1);
        Impresion impresion2 = new Impresion("Blanco y Negro", fotosImpresion2);

        ArrayList<Producto> productosPedido1 = new ArrayList<>();
        productosPedido1.add(producto1);
        productosPedido1.add(producto2);

        ArrayList<Producto> productosPedido2 = new ArrayList<>();
        productosPedido2.add(producto3);

        Pedido pedido1 = new Pedido(cliente1, productosPedido1, new Date(), "4111111111111111");
        Pedido pedido2 = new Pedido(cliente2, productosPedido2, new Date(), "4222222222222222");

        System.out.println("--- CLIENTES REGISTRADOS ---");
        cliente1.mostrarInfo();
        cliente2.mostrarInfo();

        System.out.println("\n--- CÁMARAS DISPONIBLES ---");
        camara1.mostrarInfo();
        camara2.mostrarInfo();

        System.out.println("\n--- PEDIDOS REALIZADOS ---");
        pedido1.mostrarInfo();
        System.out.println();
        pedido2.mostrarInfo();

        System.out.println("\n--- IMPRESIONES ---");
        impresion1.mostrarInfo();
        impresion2.mostrarInfo();

        System.out.println("\n--- DEMOSTRACIÓN DE IMPRESIÓN ---");
        foto1.print();
        foto3.print();

        System.out.println("\n--- ESTADÍSTICAS DEL SISTEMA ---");
        System.out.println("Total de clientes: 2");
        System.out.println("Total de pedidos: 2");
        System.out.println("Total de productos: 3");
        System.out.println("Total de fotos: 4");
        System.out.println("Total de impresiones: 2");
    }
}