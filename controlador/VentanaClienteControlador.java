package controlador;

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

    public static Libro alquilarLibro(String titulo, String autor, String genero)
    {
        return Libreria.alquilarLibro(titulo, autor, genero);
    }

    public static Libro devolverLibro(String titulo, String autor, String genero)
    {
        return Libreria.devolverLibro(titulo, autor, genero);
    }
}
