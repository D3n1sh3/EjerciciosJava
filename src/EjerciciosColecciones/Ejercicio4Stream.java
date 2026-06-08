package EjerciciosColecciones;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4Stream {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();

        notas.add(3.5);
        notas.add(6.1);
        notas.add(4.0);
        notas.add(2.9);
        notas.add(5.8);
        notas.add(7.0);

        System.out.println("Notas aprobadas:");
        notas.stream()
                .filter(nota -> nota >= 4.0)
                .forEach(nota -> System.out.println(nota));

        long cantidadAprobadas = notas.stream()
                .filter(nota -> nota >= 4.0)
                .count();

        System.out.println("Cantidad de aprobadas: " + cantidadAprobadas);
    }
}
