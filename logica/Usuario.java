package logica;

// esta clase deberá ser abstracta, para que admin y cliente extiendan de ella.

// mismos parametros, pero cambian las acciones. el rol se definirá segun como ingrese en la 
// pantalla principal al registrarse. -> el posible enum. 1- admin, 2- cliente.
public abstract class Usuario
{
    private String _nombre;
    private String _contraseña;

    public Usuario(String nombre, String contraseña)
    {
        _nombre = nombre;
        _contraseña = contraseña;
    }

    public String getNombre()
    {
        return _nombre;
    }

    public String getContraseña()
    {
        return _contraseña;
    }
}