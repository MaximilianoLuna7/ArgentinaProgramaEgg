package colecciones_ejercicio4.entidades;
/**
 * @author Maximiliano Luna
 */
public class Pelicula {
    private String titulo, director;
    private Double duracionPelicula;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duracionPelicula) {
        this.titulo = titulo;
        this.director = director;
        this.duracionPelicula = duracionPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(Double duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    @Override
    public String toString() {
        return "Título de la película: " + titulo + ", Director: " + director + ", Duración de la película: " + duracionPelicula + " horas.";
    }
    
    
}
