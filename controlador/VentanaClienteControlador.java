package controlador;

import java.util.List;

import interfaz.VentanaCliente;
import logica.Libreria;
import logica.Libro;

public class VentanaClienteControlador 
{
    static VentanaCliente VentanaCliente = new VentanaCliente();

    public static void mostrar()
    {
        VentanaCliente.setVisible(true);
    }

    public static void cerrar()
    {
        VentanaCliente.setVisible(false);
    }

    public static Libro buscarLibro(String titulo, String autor, String genero)
    {
        return Libreria.buscarLibro(titulo, autor, genero);
    }

    public static Libro buscarLibroUsuario(String titulo, String autor, String genero)
    {
        return Libreria.buscarLibroUsuario(titulo, autor, genero);
    }

    // debe devolver excepcion de libro inexistente.
    public static List<Libro> alquilarLibro(Libro libro)
    {
        return Libreria.alquilarLibro(libro);
    }

    public static List<Libro> devolverLibro(Libro libro)
    {
        return Libreria.devolverLibro(libro);
    }
}
