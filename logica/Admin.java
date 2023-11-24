package logica;

import controlador.BusquedaLibros;

public class Admin extends Usuario implements BusquedaLibros
{
    public Admin(String nombre, String contraseña) 
    {
        super(nombre, contraseña);
    }

    @Override
    public void buscarPorTitulo() {
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorTitulo'");
    }

    @Override
    public void buscarPorAutor() {
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorAutor'");
    }

    @Override
    public void buscarPorGenero() {
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorGenero'");
    }
    

}
