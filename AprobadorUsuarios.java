import java.util.ArrayList;

public class AprobadorUsuarios {
    public void aprobar(String nombreUsuario) {
        System.out.println("Usuario aprobado: " + nombreUsuario);
    }
}

public class AprobadorUsuarios {
    private static ArrayList<String> pendientes = new ArrayList<>();
    private static ArrayList<String> aprobados = new ArrayList<>();

    public static void aprobarUsuario(String nombre) {
        if (pendientes.contains(nombre)) {
            pendientes.remove(nombre);
            aprobados.add(nombre);
            System.out.println("Usuario aprobado: " + nombre);
        } else {
            System.out.println("Usuario no encontrado en pendientes.");
        }
    }

    public static void agregarPendiente(String nombre) {
        pendientes.add(nombre);
    }

    public static void main(String[] args) {
        agregarPendiente("juan123");
        agregarPendiente("maria456");

        aprobarUsuario("juan123");
    }
}
