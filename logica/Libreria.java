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

    // Tampoco controla si se encontraba o no disponible.
    public static List<Libro> agregarLibro(String titulo, String autor, String genero)
    {
        Libro libro = new Libro(titulo, autor, genero);
        System.out.println("libro " + libro.toString() + " agregado! ");
        _libros.add(libro);
        return _libros;
    }

    // NO controla si se encontraba o no disponible.
    public static List<Libro> eliminarLibro(String titulo, String autor, String genero)
    {
        Libro libro = new Libro(titulo, autor, genero);
        System.out.println("libro " + libro.toString() + " ELIMINADO! ");
        _libros.remove(libro);
        return _libros;
    }

    // NO controla si se encontraba o no disponible.
    public static Libro alquilarLibro (String titulo, String autor, String genero)
    {
        Libro libro = new Libro(titulo, autor, genero);
        if (!_libros.contains(libro))
        {
            throw new RuntimeException("libro no encontrado en listado.");
        }
        return libro;
    }

    // NO controla si se encontraba o no disponible.
    public static Libro devolverLibro (String titulo, String autor, String genero)
    {
        Libro libro = new Libro(titulo, autor, genero);
        if (!_libros.contains(libro))
        {
            throw new RuntimeException("libro no encontrado en listado.");
        }
        return libro;
    }
}
