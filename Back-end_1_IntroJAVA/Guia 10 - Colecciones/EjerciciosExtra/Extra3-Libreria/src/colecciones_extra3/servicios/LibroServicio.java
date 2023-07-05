package colecciones_extra3.servicios;

import colecciones_extra3.entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class LibroServicio {
    Scanner leer = new Scanner(System.in);
    
    public void guardarLibro(HashSet<Libro> libreria) {
        boolean salir = false;
        do {
            Libro nuevoLibro = crearLibro();
            libreria.add(nuevoLibro);
            System.out.println("--------------------");
        
            System.out.print("Guardar otro libro? S/N -> ");
            if (leer.nextLine().equalsIgnoreCase("N")) {
                salir = true;
            }
        } while (!salir);
    }
    
    public void prestamo(String tituloLibro, HashSet<Libro> libreria) {
        boolean existe = false;
        for (Libro libro : libreria) {
            if (tituloLibro.equalsIgnoreCase(libro.getTitulo())) {
                existe = true;
                if (libro.getEjemplares()>0) {
                    libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()+1);
                    libro.setEjemplares(libro.getEjemplares()-1);
                } else {
                    System.out.println("No quedan ejemplares del libro " + libro.getTitulo());
                }
            }
        }
        if (!existe) {
            System.out.println("No tenemos un libro con el título " + tituloLibro + " en la biblioteca.");
        }
    }
    
    public void devolucion(String tituloLibro, HashSet<Libro> libreria) {
        boolean existe = false;
        for (Libro libro : libreria) {
            if (tituloLibro.equalsIgnoreCase(libro.getTitulo())) {
                existe = true;
                if (libro.getEjemplaresPrestados()>0) {
                    libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()-1);
                    libro.setEjemplares(libro.getEjemplares()+1);
                } else {
                    System.out.println("No hemos prestado ejemplares del libro " + libro.getTitulo());
                }
            }
        }
        if (!existe) {
            System.out.println("No tenemos un libro con el título " + tituloLibro + " en la biblioteca.");
        }
    }
    
    public void mostrarLibros(HashSet<Libro> libreria) {
        for (Libro libro : libreria) {
            System.out.println(libro.toString());
        }
    }
    
    public void mostrarUnLibro(String tituloLibro, HashSet<Libro> libreria) {
        boolean existe = false;
        for (Libro libro : libreria) {
            if (tituloLibro.equalsIgnoreCase(libro.getTitulo())) {
                existe = true;
                System.out.println(libro.toString());
            }
        }
        if (!existe) {
            System.out.println("No tenemos un libro con el título " + tituloLibro + " en la biblioteca.");
        }
    }
    
    public void menu(HashSet<Libro> libreria) {
        int opcion;
        
        do {
            mostrarMenu();
            opcion = leer.nextInt();
            leer.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println("Guardando libros");
                    guardarLibro(libreria);
                    break;
                case 2:
                    System.out.println("Libros guardados en la librería:");
                    mostrarLibros(libreria);
                    break;
                case 3:
                    System.out.println("Ingrese el título del libro que quiere revisar");
                    String libroBuscar = leer.nextLine();
                    mostrarUnLibro(libroBuscar, libreria);
                    break;
                case 4:
                    System.out.println("Ingrese el título del libro que se va a prestar");
                    String libroPrestar = leer.nextLine();
                    prestamo(libroPrestar, libreria);
                    break;
                case 5:
                    System.out.println("Ingrese el libro que se va a devolver");
                    String libroDevolver = leer.nextLine();
                    devolucion(libroDevolver, libreria);
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            
            System.out.println("----------------------"); // Separador entre iteraciones del menú

        } while (opcion != 6);
        
        leer.close();
    }
    
    public void mostrarMenu() {
        System.out.println("========== MENÚ ==========");
        System.out.println("1. Guardar libros");
        System.out.println("2. Mostrar libros");
        System.out.println("3. Ver datos de un libro");
        System.out.println("4. Prestar libro");
        System.out.println("5. Devolver libro");
        System.out.println("6. Salir");
        System.out.print("Ingrese su opción: ");
    }
    
    public Libro crearLibro() {
        System.out.print("Ingrese el título del libro -> ");
        String titulo = leer.nextLine();
        
        System.out.print("Ingrese el nombre del autor -> ");
        String autor = leer.nextLine();
        
        System.out.println("Cuántos ejemplares hay disponibles?");
        Integer ejemplares = leer.nextInt();
        leer.nextLine();
        
        System.out.println("Cuántos ejemplares se han prestado?");
        Integer ejemplaresPrestados = leer.nextInt();
        leer.nextLine();
        
        return new Libro(titulo, autor, ejemplares, ejemplaresPrestados);
    }
}
