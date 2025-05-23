import java.util.ArrayList;

public class EliminarUsuarios {
    public void eliminar(String nombreUsuario) {
        System.out.println("Usuario eliminado: " + nombreUsuario);
    }
}


public class EliminarUsuarios {
    private static ArrayList<String> usuarios = new ArrayList<>();

    public static void eliminarUsuario(String nombre) {
        if (usuarios.remove(nombre)) {
            System.out.println("Usuario eliminado: " + nombre);
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    public static void main(String[] args) {
        usuarios.add("juan123");
        usuarios.add("maria456");

        eliminarUsuario("juan123");
    }
}

