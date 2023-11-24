package logica;

public class Libro
{
    private String _autor; // -> es irrelevante lo demás del autor, solo el nombre.
    private String _titulo;
    private String _genero; // -> se podría hacer con enum para los tipos de libro.
                            // hago mejor 2 generos, drama y amor. (?)

    public Libro (String autor, String titulo, String genero)
    {
        _autor = autor;
        _titulo = titulo;
        _genero = genero;
    }

    public String getAutor()
    {
        return _autor;
    }

    public String getTitulo()
    {
        return _titulo;
    }

    public String getGenero()
    {
        return _genero;
    }

    public String toString()
    {
        return "Libro: " + _titulo + ", del autor: " + _autor + ", género: " + _genero; 
    }
}
