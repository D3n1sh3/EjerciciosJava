package EjerciciosColecciones;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1ArrayList {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuántos productos desea registrar? ");
        int cantidad = entrada.nextInt();

        for(int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese producto: ");
            String producto = entrada.next();
            productos.add(producto);
        }

        System.out.println("\nProductos registrados:");

        for(String producto : productos) {
            System.out.println(producto);
        }

        System.out.println("Cantidad de productos ingresados: " + productos.size());

    }
}
