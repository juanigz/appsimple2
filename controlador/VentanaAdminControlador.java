package controlador;

import interfaz.VentanaAdmin;

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
}
