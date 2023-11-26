package logica;

public class Libro
{
    private String _titulo;
    private String _autor; // -> es irrelevante lo demás del autor, solo el nombre.
    private String _genero; // -> se podría hacer con enum para los tipos de libro.
                            // hago mejor 2 generos, drama y amor. (?)

    public Libro (String titulo, String autor, String genero)
    {
        _titulo = titulo;
        _autor = autor;
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
