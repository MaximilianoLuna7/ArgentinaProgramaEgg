package colecciones_ejercicio4.utilidades;

import colecciones_ejercicio4.entidades.Pelicula;
import java.util.Comparator;

/**
 * @author Maximiliano Luna
 */
public class Comparadores {
    public static Comparator<Pelicula> ordenarPeliculasDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracionPelicula().compareTo(o2.getDuracionPelicula());
        }
    };
    
    public static Comparator<Pelicula> ordenarPeliculasTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> ordenarPeliculasDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };
}
