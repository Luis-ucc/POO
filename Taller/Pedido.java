import java.util.Date;
import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private Date fecha;
    private String numeroTarjetaCredito;

    public Pedido(Cliente cliente, ArrayList<Producto> productos, Date fecha, String numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    // Setters
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setNumeroTarjetaCredito(String numeroTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public void mostrarInfo() {
        System.out.println("=== PEDIDO ===");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Tarjeta: ****-****-****-" + numeroTarjetaCredito.substring(12));
        System.out.println("Productos en el pedido:");
        for (Producto producto : productos) {
            System.out.println("  - Producto #" + producto.getNumero());
        }
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
}