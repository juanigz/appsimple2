package controlador;

import java.util.List;

import interfaz.VentanaAdmin;
import logica.Libreria;
import logica.Libro;

public class VentanaAdminControlador
{
    static VentanaAdmin ventanaAdmin = new VentanaAdmin();

    public static void mostrar()
    {
        ventanaAdmin.setVisible(true);
    }

    public static void cerrar()
    {
        ventanaAdmin.setVisible(false);
    }

    public static Libro generarLibro(String titulo, String autor, String genero)
    {
        return Libreria.generarLibro(titulo, autor, genero);
    }

    public static List<Libro> agregarLibro(Libro libro)
    {
        return Libreria.agregarLibro(libro);
    }

    public static List<Libro> eliminarLibro(Libro libro)
    {
        return Libreria.eliminarLibro(libro);
    }
}
