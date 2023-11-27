package controlador;

import java.util.List;

import interfaz.VentanaPrincipal;
import logica.Cliente;
import logica.Libreria;

public class VentanaPrincipalControlador 
{
    static VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();

    public static void mostrar()
    {
        ventanaPrincipal.setVisible(true);
    }

    public static void cerrar()
    {
        ventanaPrincipal.setVisible(false);
    }

    public static Cliente generarUsuario(String nombre, String contraseña)
    {
        return Libreria.generarUsuario(nombre, contraseña);
    }

    public static List<Cliente> registrarClientes(Cliente usuario)
    {
        return Libreria.registrarUsuario(usuario);
    }
    
}
