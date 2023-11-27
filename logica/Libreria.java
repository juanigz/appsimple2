package logica;

import java.util.ArrayList;
import java.util.List;

// Gestiona los libros y usuarios/clientes (para mostrar por consola la busqueda particular de cada uno).
public class Libreria
{
    public static List<Libro> _libros = new ArrayList<>();
    public static List<Libro> _librosUsuario = new ArrayList<>();

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
    public static List<Libro> alquilarLibro (Libro libro)
    {
        if (!_libros.contains(libro))
        {
            throw new RuntimeException("libro no encontrado en listado.");
        }

        // lo elimina hasta que el cliente lo devuelva..
        _librosUsuario.add(libro);
        eliminarLibro(libro);
        return _librosUsuario;
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

    public static Libro buscarLibro(String titulo, String autor, String genero)
    {
        // tomo un solo buscador, ya que asumo que si el libro existe, todo lo demás también.
        Libro libro = buscarPorTitulo(titulo);

        return libro;
    }

    public static Libro buscarPorTitulo(String titulo)
    {
        for(Libro l: _libros)
        {
            if (l.getTitulo().equals(titulo))
            {
                System.out.println("libro encontrado!. " + l.toString() + " / por titulo: " + l.getTitulo());
                return l;
            }
        }

        System.out.println("libro no existente.");
        return null;
    }

    public static Libro buscarPorAutor(String autor)
    {
        for(Libro l: _libros)
        {
            if (l.getAutor().equals(autor))
            {
                System.out.println("libro encontrado!. " + l.toString() + " / del autor: " + l.getAutor());
                return l;
            }
        }

        System.out.println("libro no existente.");
        return null;
    }

    public static Libro buscarPorGenero(String genero)
    {
        for(Libro l: _libros)
        {
            if (l.getGenero().equals(genero))
            {
                System.out.println("libro encontrado!. " + l.toString() + " / del genero: " + l.getGenero());
                return l;
            }
        }

        System.out.println("libro no existente.");
        return null;
    }

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
