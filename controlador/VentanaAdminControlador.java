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

    public static List<Libro> agregarLibro(String titulo, String autor, String genero)
    {
        return Libreria.agregarLibro(titulo, autor, genero);
    }

    public static List<Libro> eliminarLibro(String titulo, String autor, String genero)
    {
        return Libreria.eliminarLibro(titulo, autor, genero);
    }
}
