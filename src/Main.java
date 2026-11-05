import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MAX = 3;

        ProductoDigital productos[] = new ProductoDigital[MAX];

        for(int i = 0; i < productos.length; i++){

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Precio: ");
            double precio = Double.parseDouble(sc.nextLine());

            System.out.print("Stock: ");
            int stock = Integer.parseInt(sc.nextLine());

            productos[i] = new ProductoDigital(nombre, precio, stock);
        }

        System.out.println("\nLISTA DE PRODUCTOS");

        for(int i = 0; i < productos.length; i++){
            productos[i].mostrarInfo();
        }
    }
}