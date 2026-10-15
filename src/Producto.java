public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private static int contadorProductos = 0;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        contadorProductos++;
        this.id = contadorProductos;
    }

    public static int getContadorProductos(){
        return contadorProductos;
    }
}
