
package Problema1_SistemasDeVentas;
import java.util.Scanner;
public class Ejecutor {

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);


        Producto[] inventario = {
            new Producto("Laptop", 800.0, 5),
            new Producto("Celular", 300.0, 10),
            new Producto("Monitor", 150.0, 8)
        };

        System.out.println("---------------------------------");
        System.out.println("BIENVENIDO A LA TIENDA");
        System.out.println("------------STOCK------------");
        System.out.println("LAPTOP -- Precio: $800 -- Cantidad: 5");
        System.out.println("CELULAR -- Precio: $300 -- Cantidad: 10");
        System.out.println("Monitor -- Precio: $150 -- Cantidad: 8");
        System.out.println("Ingrese la cantidad de productos que desea comprar:");
        int n = e.nextInt();
        
        CarritoDeCompras carrito = new CarritoDeCompras(n, 0.15);
        System.out.println("----------------------------------");

        for (int i = 0; i < n; i++) {
            e.nextLine(); 
            System.out.println("Nombre del producto " + (i + 1) + ":");
            String nombreProd = e.nextLine();
            System.out.println("Cantidad a comprar:");
            int cantProd = e.nextInt();
            
            carrito.agregarProducto(nombreProd, cantProd, inventario);
        }

        carrito.mostrarDetalleCompra();
        
        double totalAprox = carrito.calcularTotal();
        System.out.println("\nTotal acumulado: $" + totalAprox);
        System.out.println("Ingrese su monto de pago:");
        double pago = e.nextDouble();

        carrito.realizarPago(pago, inventario);
        
        System.out.println("---------------------------------");
    }
} 

