public class ProductoDigital {
    private String nombre;
    private double precio;
    private int stock;

    public ProductoDigital(String nombre, double precio, int stock) {
        this.nombre = nombre;

        if(precio > 0)
            this.precio = precio;
        else
            this.precio = 1;

        if(stock >= 0)
            this.stock = stock;
        else
            this.stock = 0;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
        System.out.println();
    }
}