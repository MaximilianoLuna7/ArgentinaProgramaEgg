package colecciones_ejercicio4.servicios;

import colecciones_ejercicio4.entidades.Pelicula;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class PeliculaServicio {
    Scanner leer = new Scanner(System.in);
    
    public void guardarPelicula(HashSet<Pelicula> peliculas) {
        boolean salir;
        do {
            Pelicula pelicula = ingresarPelicula();
            peliculas.add(pelicula);
            System.out.println("-----------------");
            
            System.out.println("Ingresar otra película? S/N");
            salir = leer.nextLine().equalsIgnoreCase("N");
        } while (!salir);
    }
    
    public void mostrarPeliculas(Collection<Pelicula> peliculas) {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }
    
    public void mostrarPeliculasMas1Hora(HashSet<Pelicula> peliculas) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracionPelicula() > 1) {
                System.out.println(pelicula.toString());
            }
        }
    }
    
    public Pelicula ingresarPelicula() {
        System.out.println("Ingrese los datos de la película");
        System.out.print("Título -> ");
        String titulo = leer.nextLine();
        
        System.out.print("Director -> ");
        String director = leer.nextLine();
        
        System.out.print("Duración de la película en horas -> ");
        double duracionPelicula = leer.nextDouble();
        leer.nextLine();
        
        return new Pelicula(titulo, director, duracionPelicula);
    }
    
    public void dejarDeLeer() {
        leer.close();
    }
}
