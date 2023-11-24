package controlador;

// interface para la busqueda de libros, ambos usuarios las buscan de la misma forma.
public interface BusquedaLibros
{
    public void buscarPorTitulo();

    public void buscarPorAutor();

    public void buscarPorGenero();
}
