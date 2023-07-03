package colecciones_ejercicio5;

import colecciones_ejercicio5.servicios.Ej5Servicio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class Colecciones_Ejercicio5 {
//    Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
//    usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
//    conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
//    si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
//    los servicios en la clase correspondiente)
//    Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//    cómo se ordena un conjunto.
//    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//    buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//    usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//    al usuario.
    
    public static void main(String[] args) {
        HashSet<String> setPaises = new HashSet<>();
        Scanner leer = new Scanner(System.in);
        Ej5Servicio ej5Servicio = new Ej5Servicio();
        
        ej5Servicio.guardarPaises(setPaises);
        System.out.println("-----------------");
        
        ArrayList<String> listaPaises = new ArrayList<>(setPaises);
        Collections.sort(listaPaises);
        System.out.println("Paises ordenados");
        ej5Servicio.mostrarPaises(listaPaises);
        System.out.println("-----------------");
        
        ej5Servicio.eliminarPais(setPaises);
        System.out.println("-----------------");
        
        ej5Servicio.dejarDeLeer();
    }

}
