package controlador;

import interfaz.VentanaUsuario;
import logica.TipoUsuario;

public class VentanaUsuarioControlador 
{
    static VentanaUsuario ventanaUsuario = new VentanaUsuario();

    public static void mostrar()
    {
        ventanaUsuario.setVisible(true);
    }

    public static void cerrar()
    {
        ventanaUsuario.setVisible(false);
    }

    public static void setTipoUsuario(TipoUsuario user)
    {
        switch(user)
        {
        case ADMIN:
            ventanaUsuario.inicializarAdmin();
            break;
        case CLIENTE:
            ventanaUsuario.inicializarCliente();
            break;
        }
        mostrar();
    }
}
