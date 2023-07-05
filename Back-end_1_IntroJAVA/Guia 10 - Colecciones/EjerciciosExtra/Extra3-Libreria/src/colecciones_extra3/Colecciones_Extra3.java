package colecciones_extra3;

import colecciones_extra3.entidades.Libro;
import colecciones_extra3.servicios.LibroServicio;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class Colecciones_Extra3 {
//    Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos
//    repetidos. Para ello, se debe crear una clase llamada Libro que guarde la información de
//    cada uno de los libros de una Biblioteca. La clase Libro debe guardar
//    el título del libro, autor, número de ejemplares y número de ejemplares prestados.
//    También se creará en el main un HashSet de tipo Libro que guardará todos los libros
//    creados.
//    En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
//    datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
//    pregunta al usuario si quiere crear otro Libro o no.
//    La clase Librería contendrá además los siguientes métodos:
//    ● Constructor por defecto.
//    ● Constructor con parámetros.
//    ● Métodos Setters/getters
//    ● Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
//    en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
//    método se incrementa de a uno, como un carrito de compras, el atributo ejemplares
//    prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
//    préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
//    disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
//    caso contrario.
//    ● Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
//    busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
//    método decrementa de a uno, como un carrito de compras, el atributo ejemplares
//    prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
//    produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
//    ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
//    caso contrario.
//    ● Método toString para mostrar los datos de los libros.
    
    public static void main(String[] args) {
        HashSet<Libro> libreria = new HashSet<>();
        LibroServicio libroServicio = new LibroServicio();
        
        //Cargo algunos libros ficticios previamente
        Libro libro1 = new Libro("El misterio del jardín", "Ana Gómez", 10, 2);
        Libro libro2 = new Libro("La sombra del pasado", "Carlos Ruiz", 8, 1);
        Libro libro3 = new Libro("Aventuras en el tiempo", "Laura Pérez", 12, 0);
        Libro libro4 = new Libro("El enigma de la esfinge", "Miguel Torres", 5, 3);
        Libro libro5 = new Libro("La isla misteriosa", "Julia López", 15, 5);
        Libro libro6 = new Libro("El secreto del faro", "Roberto García", 7, 2);
        Libro libro7 = new Libro("El tesoro perdido", "Sofía Martínez", 10, 1);
        Libro libro8 = new Libro("La puerta encantada", "Andrés Sánchez", 6, 0);
        Libro libro9 = new Libro("El laberinto de los sueños", "María Rodríguez", 9, 4);
        Libro libro10 = new Libro("El código oculto", "Daniel Ortega", 11, 3);
        libreria.addAll(Arrays.asList(libro1, libro2, libro3, libro4, libro5, libro6, libro7, libro8, libro9,libro10));
        
        //Ejecuto el menu que llama a todos los métodos.
        libroServicio.menu(libreria);
    }

}
