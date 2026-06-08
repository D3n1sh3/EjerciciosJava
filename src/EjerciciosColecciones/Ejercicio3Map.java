package EjerciciosColecciones;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio3Map {
    public static void main(String[] args) {
        HashMap<String,String> agenda = new HashMap<>();
        Scanner entrada = new Scanner(System.in);

        for( int i = 0; i < 5; i++) {
            System.out.print("Ingrese nombre: ");
            String nombre = entrada.next();
            System.out.print("Ingrese teléfono: ");
            String telefono = entrada.next();
            agenda.put(nombre, telefono);
        }

        System.out.print("\nIngrese nombre a buscar: ");
        String buscar = entrada.next();
        String telefono = agenda.get(buscar);

        if(telefono != null) {
            System.out.println("Teléfono: " + telefono);
        } else {
            System.out.println("Contacto no encontrado");
        }
    }
}
