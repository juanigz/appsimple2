package logica;

public class Libro
{
    private String _titulo;
    private String _autor;
    private String _genero;

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

    @Override
    public String toString()
    {
        return "Libro: " + _titulo + ", del autor: " + _autor + ", género: " + _genero; 
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_titulo == null) ? 0 : _titulo.hashCode());
        result = prime * result + ((_autor == null) ? 0 : _autor.hashCode());
        result = prime * result + ((_genero == null) ? 0 : _genero.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (_titulo == null) {
            if (other._titulo != null)
                return false;
        } else if (!_titulo.equals(other._titulo))
            return false;
        if (_autor == null) {
            if (other._autor != null)
                return false;
        } else if (!_autor.equals(other._autor))
            return false;
        if (_genero == null) {
            if (other._genero != null)
                return false;
        } else if (!_genero.equals(other._genero))
            return false;
        return true;
    }
    
}