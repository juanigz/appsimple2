package logica;

import java.util.ArrayList;
import java.util.List;

// Gestiona los libros y usuarios/clientes (para mostrar por consola la busqueda particular de cada uno).
public class Libreria
{
    public static List<Libro> _libros = new ArrayList<>();

    public static ArrayList<Cliente> _listaUsuarios = new ArrayList<>();

    // Registro de usuarios (clientes).
    public static Cliente generarUsuario(String nombre, String contraseña)
    {
        Cliente usuario = new Cliente(nombre, contraseña);
        return usuario;
    }

    public static List<Cliente> registrarUsuario(Cliente usuario)
    {
        _listaUsuarios.add(usuario);
        System.out.println("persona registrada!");
        return _listaUsuarios;
    }

    
}
