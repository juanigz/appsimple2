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
            //generarLibro(libro.getTitulo(), libro.getAutor(), libro.getGenero());
            agregarLibro(libro);
            _librosUsuario.remove(libro);
        }
        return _librosUsuario;

        // Optional<Libro> usuarioExistente = this.libros.stream().filter(Libro l -> libro.nombre.equals(nombre)).findFirst()
    }

    // busqueda dentro del inventario de usuario.
    public static Libro buscarLibroUsuario(String titulo, String autor, String genero)
    {
        // tomo un solo buscador, ya que asumo que si el libro existe, todo lo demás también.
        for(Libro l: _librosUsuario)
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

    // busqueda en libreria.
    public static Libro buscarLibro(String titulo, String autor, String genero)
    {
        // tomo un solo buscador, ya que asumo que si el libro existe, todo lo demás también.
        // Libro libro = buscarPorTitulo(titulo);
        Optional<Libro> librosBuscados = _libros.stream().filter(l -> l.getTitulo().equals(titulo)).findFirst();

        Libro libro = librosBuscados.get();

        System.out.println("libro encontrado!. " + libro.toString() + " / por titulo: " + libro.getTitulo());

        return libro;
    }

    // public static Libro buscarPorTitulo(String titulo)
    // {
    //     for(Libro l: _libros)
    //     {
    //         if (l.getTitulo().equals(titulo))
    //         {
    //             System.out.println("libro encontrado!. " + l.toString() + " / por titulo: " + l.getTitulo());
    //             return l;
    //         }
    //     }

    //     System.out.println("libro no existente.");
    //     return null;
    // }

    // public static Libro buscarPorAutor(String autor)
    // {
    //     for(Libro l: _libros)
    //     {
    //         if (l.getAutor().equals(autor))
    //         {
    //             System.out.println("libro encontrado!. " + l.toString() + " / del autor: " + l.getAutor());
    //             return l;
    //         }
    //     }

    //     System.out.println("libro no existente.");
    //     return null;
    // }

    // public static Libro buscarPorGenero(String genero)
    // {
    //     for(Libro l: _libros)
    //     {
    //         if (l.getGenero().equals(genero))
    //         {
    //             System.out.println("libro encontrado!. " + l.toString() + " / del genero: " + l.getGenero());
    //             return l;
    //         }
    //     }

    //     System.out.println("libro no existente.");
    //     return null;
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
