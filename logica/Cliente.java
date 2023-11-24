package logica;

import controlador.BusquedaLibros;

public class Cliente extends Usuario implements BusquedaLibros
{

    public Cliente(String nombre, String contraseña)
    {
        super(nombre, contraseña);
    }

    @Override
    public void buscarPorTitulo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorTitulo'");
    }

    @Override
    public void buscarPorAutor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorAutor'");
    }

    @Override
    public void buscarPorGenero() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorGenero'");
    }
        
    
}
