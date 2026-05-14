package Problema1_SistemasDeVentas;

public class CarritoDeCompras {

    private Producto[] productosSeleccionados;
    private int contador;
    private double descuento;

    public CarritoDeCompras(int capacidad, double descuento) {
        this.productosSeleccionados = new Producto[capacidad];
        this.contador = 0;
        this.descuento = descuento; 
    }

    public void agregarProducto(String nombre, int cantidad, Producto[] inventario) {
        Producto productoEnTienda = null;
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].getNombre().equalsIgnoreCase(nombre)) {
                productoEnTienda = inventario[i];
                break;
            }
        }

        if (productoEnTienda != null) {
            if (productoEnTienda.getCantidad() >= cantidad) {
               
                Producto nuevoItem = new Producto(productoEnTienda.getNombre(), productoEnTienda.getPrecio(), cantidad);
                productosSeleccionados[contador] = nuevoItem;
                contador++;
                System.out.println("Producto agregado exitosamente.");
            } else {
                System.out.println("Error: No hay suficiente stock. Disponible: " + productoEnTienda.getCantidad());
            }
        } else {
            System.out.println("Error: El producto no existe en la tienda.");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += productosSeleccionados[i].getPrecio() * productosSeleccionados[i].getCantidad();
        }
        return total;
    }

    public void mostrarDetalleCompra() {
        System.out.println("-------- DETALLE DEL CARRITO ------------");
        for (int i = 0; i < contador; i++) {
            System.out.println("Producto: " + productosSeleccionados[i].getNombre()
                    + " | Cantidad: " + productosSeleccionados[i].getCantidad());
        }
    }

    public void realizarPago(double montoPagado, Producto[] inventario) {
        double total = calcularTotal();
        if (total > 1000) {
            double ahorro = total * descuento;
            total -= ahorro;
            System.out.println("¡Descuento aplicado! Nuevo total: $" + total);
        }

        if (montoPagado >= total) {
            System.out.println("¡Gracias por su compra!");
            for (int i = 0; i < contador; i++) {
                for (int j = 0; j < inventario.length; j++) {
                    if (productosSeleccionados[i].getNombre().equalsIgnoreCase(inventario[j].getNombre())) {
                        int nuevoStock = inventario[j].getCantidad() - productosSeleccionados[i].getCantidad();
                        inventario[j].setCantidad(nuevoStock);
                    }
                }
            }
        } else {
            System.out.println("Monto insuficiente. Falta: $" + (total - montoPagado));
        }
    }
}
