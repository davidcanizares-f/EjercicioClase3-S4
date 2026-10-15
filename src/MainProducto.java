public class MainProducto {
    public static void main(){
        Producto p1 = new Producto("Mouse", 25.5, 10);
        Producto p2 = new Producto("Teclado", 40, 5);
        Producto p3 = new Producto("Monitor", 200, 15);
        Producto p4 = new Producto("Tablet", 250, 7);
        Producto p5 = new Producto("Camara", 15, 6);

        System.out.println("Total de productos: " + Producto.getContadorProductos());

    }
}
