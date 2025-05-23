import java.util.ArrayList;
import java.util.HashMap;

public class HistorialActividad {
    public void mostrarHistorial(String nombreUsuario) {
        System.out.println("Mostrando historial de actividad para: " + nombreUsuario);
    }
}


public class HistorialActividad {
    private static HashMap<String, ArrayList<String>> historial = new HashMap<>();

    public static void registrarActividad(String usuario, String actividad) {
        historial.putIfAbsent(usuario, new ArrayList<>());
        historial.get(usuario).add(actividad);
    }

    public static void mostrarHistorial(String usuario) {
        System.out.println("Historial de " + usuario + ":");
        if (historial.containsKey(usuario)) {
            for (String act : historial.get(usuario)) {
                System.out.println("- " + act);
            }
        } else {
            System.out.println("No hay actividades registradas.");
        }
    }

    public static void main(String[] args) {
        registrarActividad("juan123", "Inicio de sesión");
        registrarActividad("juan123", "Editó perfil");

        mostrarHistorial("juan123");
    }
}

