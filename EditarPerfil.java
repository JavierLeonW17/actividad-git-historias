import java.util.HashMap;
import java.util.Scanner;

public class EditarPerfil {
    public void editarPerfil(String nombreUsuario, String nuevoCorreo) {
        System.out.println("Perfil actualizado para " + nombreUsuario + ": " + nuevoCorreo);
    }
}


public class EditarPerfil {
    private static HashMap<String, String> usuarios = new HashMap<>();

    public static void editarPerfil(String usuario, String nuevoNombre) {
        if (usuarios.containsKey(usuario)) {
            usuarios.put(usuario, nuevoNombre);
            System.out.println("Perfil actualizado.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    public static void main(String[] args) {
        usuarios.put("juan123", "Juan Pérez");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Usuario a editar: ");
        String usuario = scanner.nextLine();

        System.out.print("Nuevo nombre: ");
        String nuevo = scanner.nextLine();

        editarPerfil(usuario, nuevo);
        scanner.close();
    }
}
