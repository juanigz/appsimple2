package controlador;

import interfaz.VentanaPrincipal;
import logica.TipoUsuario;

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

    // segun el tipo de usuario que se elija, abrira un tipo de ventana u otra.
    public static void setTipoUsuario(TipoUsuario user)
    {
        cerrar();
        VentanaUsuarioControlador.setTipoUsuario(user);
    }
}
