package EjercicioGestionFrutas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaFrutas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> frutas = new ArrayList<>();

        agregarFrutas(frutas, sc);
        mostrarFrutas(frutas);
        mostrarCantidad(frutas);
        reemplazarFruta(frutas, sc);
        eliminarFruta(frutas, sc);

        System.out.println("\n--- Lista final ---");
        mostrarFrutas(frutas);
        sc.close();
    }

    static void agregarFrutas(List<String> frutas, Scanner sc) {

        System.out.print("¿Cuántas frutas desea ingresar? ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese fruta: ");
            String fruta = sc.nextLine();
            frutas.add(fruta);
        }
    }

    static void mostrarFrutas(List<String> frutas) {

        System.out.println("\nFrutas:");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }

    static void mostrarCantidad(List<String> frutas) {

        System.out.println("\nCantidad de frutas: " + frutas.size());
    }

    static void reemplazarFruta(List<String> frutas, Scanner sc) {

        System.out.print("\nFruta a reemplazar: ");
        String vieja = sc.nextLine();

        if (frutas.contains(vieja)) {

            System.out.print("Nueva fruta: ");
            String nueva = sc.nextLine();

            int pos = frutas.indexOf(vieja);
            frutas.set(pos, nueva);

        } else {
            System.out.println("La fruta no se encuentra en la lista.");
        }
    }

    static void eliminarFruta(List<String> frutas, Scanner sc) {

        System.out.print("\nFruta a eliminar: ");
        String fruta = sc.nextLine();

        if (frutas.contains(fruta)) {
            frutas.remove(fruta);
        } else {
            System.out.println("La fruta no se encuentra en la lista.");
        }
    }
}
