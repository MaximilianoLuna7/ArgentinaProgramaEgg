package colecciones_ejercicio4;

import colecciones_ejercicio4.entidades.Pelicula;
import colecciones_ejercicio4.servicios.PeliculaServicio;
import colecciones_ejercicio4.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author Maximiliano Luna
 */
public class Colecciones_Ejercicio4 {
//    Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
//    tendremos una clase Pelicula con el título, director y duración de la película (en horas).
//    Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
//    que se pide a continuación:
//    En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//    todos sus datos y guardándolos en el objeto Pelicula.
//    Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//    crear otra Pelicula o no.
//    Después de ese bucle realizaremos las siguientes acciones
//    • Mostrar en pantalla todas las películas.
//    • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//    • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//    pantalla.
//    • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//    pantalla.
//    • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//    • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    
    public static void main(String[] args) {
        HashSet<Pelicula> setPeliculas = new HashSet<>();
        PeliculaServicio peliculaServicio = new PeliculaServicio();
        
        peliculaServicio.guardarPelicula(setPeliculas);
        System.out.println("--------------------");
        
        System.out.println("• Películas guardadas");
        peliculaServicio.mostrarPeliculas(setPeliculas);
        System.out.println("--------------------");
        
        System.out.println("• Películas que duran más de 1 hora");
        peliculaServicio.mostrarPeliculasMas1Hora(setPeliculas);
        System.out.println("--------------------");
        
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>(setPeliculas);
        
        System.out.println("• Peliculas ordenadas por duración (mayor a menor");
        Collections.sort(listaPeliculas, Comparadores.ordenarPeliculasDuracion); //Ordeno
        Collections.reverse(listaPeliculas); // Invierto el orden
        peliculaServicio.mostrarPeliculas(listaPeliculas);
        System.out.println("--------------------");
        
        System.out.println("• Peliculas ordenadas por duración (menor a mayor)");
        Collections.sort(listaPeliculas, Comparadores.ordenarPeliculasDuracion);
        peliculaServicio.mostrarPeliculas(listaPeliculas); //Oredeno
        System.out.println("--------------------");
        
        System.out.println("• Peliculas ordenadas por título");
        Collections.sort(listaPeliculas, Comparadores.ordenarPeliculasTitulo);
        peliculaServicio.mostrarPeliculas(listaPeliculas);
        System.out.println("--------------------");
        
        System.out.println("• Peliculas ordenadas por director");
        Collections.sort(listaPeliculas, Comparadores.ordenarPeliculasDirector);
        peliculaServicio.mostrarPeliculas(listaPeliculas);
        System.out.println("--------------------");
    }

}
