package controlador;

import interfaz.VentanaCliente;

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
}
