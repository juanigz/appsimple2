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

    public static Libro generarLibro(String titulo, String autor, String genero)
    {
        Libro libro = new Libro(titulo, autor, genero);
        return libro;
    }
    
    public static List<Libro> agregarLibro(Libro libro)
    {
        // if (!yaIngresado(libro, _libros))
        if (!_libros.contains(libro))
        {
            _libros.add(libro);
            System.out.println("libro " + libro.toString() + " agregado! ");
        }
        else System.out.println("libro ya existente en registro.");
        return _libros;
    }

    public static List<Libro> eliminarLibro(Libro libro)
    {
        // if (yaIngresado(libro, _libros))
        if (_libros.contains(libro))
        {
            _libros.remove(libro);
            System.out.println("libro " + libro.toString() + " ELIMINADO! ");
        }
        else System.out.println("libro no existente.");
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

    // public static Libro buscarLibro(String titulo, String autor, String genero)
    // {
    // }

    // private static boolean yaIngresado(Libro libro, List<Libro> libros) 
    // {
    //     for (Libro l : libros) {
	//     	if (l.getTitulo() == libro.getTitulo() && l.getAutor() == libro.getAutor() && l.getGenero() == libro.getGenero()){
	//     		return true;
	//     	}
	//     }
	//     return false;
    // }
}
