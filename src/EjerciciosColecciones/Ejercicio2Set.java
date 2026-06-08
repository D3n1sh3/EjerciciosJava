package EjerciciosColecciones;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio2Set {
    public static void main(String[] args) {
        HashSet<String> usuarios = new HashSet<>();
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuántos usuarios desea registrar? ");
        int cantidad = entrada.nextInt();

        for(int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre: ");
            String usuario = entrada.next();

            boolean agregado = usuarios.add(usuario);
            if (!agregado) {
                System.out.println("Usuario repetido");
            }
        }

        for(String usuario : usuarios) {
            System.out.println(usuario);
        }

        System.out.println("Total usuarios únicos: " + usuarios.size());

    }
}
