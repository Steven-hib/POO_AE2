public class PrincipalProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto("A001", "Audífonos", 2, 120000);

        p1.mostrarInfo();

        double totalConDescuento = p1.aplicarDescuento(10);
        System.out.println("Total con 10% de descuento: " + totalConDescuento);
    }
}

/*
 * Se crea un producto con:
 * Codigo A001
 * Descripcion: Audifonos
 * Cantidad: 2
 * Precio:  120000
 * Subtotal: 2 * 120000 = 240000.
 * Descuento del 10% = 240000 * 0.10 = 24000
 * Total con descuento = 240000 - 24000 = 216000
 * 
 * El programa muestra ese resultado.
 */

