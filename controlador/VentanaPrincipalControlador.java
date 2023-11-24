package controlador;

import interfaz.VentanaPrincipal;

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

}
