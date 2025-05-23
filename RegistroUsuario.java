import java.util.ArrayList;
import java.util.Scanner;

public class RegistroUsuario {
    public void registrar(String nombre, String correo) {
        System.out.println("Usuario registrado: " + nombre + ", correo: " + correo);
    }
}

public class RegistroUsuario {
    private static ArrayList<String> usuariosRegistrados = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Registro de Usuario ===");
        System.out.print("Ingrese su nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        if (registrarUsuario(nombreUsuario)) {
            System.out.println("Usuario registrado correctamente.");
        } else {
            System.out.println("El nombre de usuario ya existe.");
        }

        System.out.println("\nUsuarios registrados:");
        for (String user : usuariosRegistrados) {
            System.out.println("- " + user);
        }

        scanner.close();
    }

    public static boolean registrarUsuario(String nombre) {
        if (usuariosRegistrados.contains(nombre)) {
            return false; // Ya está registrado
        } else {
            usuariosRegistrados.add(nombre);
            return true;
        }
    }
}
