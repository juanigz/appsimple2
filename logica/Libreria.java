package logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Gestiona los libros de biblioteca e inventario del usuario.
public class Libreria
{
    public static List<Libro> _libros = new ArrayList<>();
    public static List<Libro> _librosUsuario = new ArrayList<>();

    public static ArrayList<Cliente> _listaUsuarios = new ArrayList<>();

    // Registro de usuario (cliente).
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

        // lo elimina de la biblioteca hasta que el cliente lo devuelva..
        _librosUsuario.add(libro);
        eliminarLibro(libro);
        return _librosUsuario;
    }

    public static List<Libro> devolverLibro (Libro libro)
    {
        // si el cliente no lo tiene, tira excepcion.
        if (!_librosUsuario.contains(libro))
        {
            throw new RuntimeException("libro no encontrado en listado.");
        }

        // chequea que la biblioteca no lo tenga, y que el cliente si.
        else {
            // lo elimina del inventario de usuario, y lo devuelve a libros de biblioteca.
            agregarLibro(libro);
            _librosUsuario.remove(libro);
        }
        return _librosUsuario;
    }

    // busqueda dentro del inventario de usuario.
    public static Libro buscarLibroUsuario(String titulo, String autor, String genero)
    {
        Optional<Libro> librosUsuarioBuscados = _librosUsuario.stream().filter(l -> l.getTitulo().equals(titulo)).findFirst();

        Libro libro = librosUsuarioBuscados.get();

        return libro;
    }

    // busqueda en libreria.
    public static Libro buscarLibro(String titulo, String autor, String genero)
    {
        // tomo un solo buscador, ya que asumo que si el libro existe, todo lo demás también.
        Optional<Libro> librosBuscados = _libros.stream().filter(l -> l.getTitulo().equals(titulo)).findFirst();

        Libro libro = librosBuscados.get();

        System.out.println("libro encontrado!. " + libro.toString() + " / por titulo: " + libro.getTitulo());

        return libro;
    }

}
