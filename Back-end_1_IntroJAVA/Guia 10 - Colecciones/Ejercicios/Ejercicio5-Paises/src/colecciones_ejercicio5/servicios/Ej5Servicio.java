package colecciones_ejercicio5.servicios;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class Ej5Servicio {
    Scanner leer = new Scanner(System.in);
    
    public void guardarPaises(HashSet<String> setPaises) {
        boolean salir;
        do {
            System.out.print("Ingrese un país -> ");
            String pais = leer.nextLine();
            setPaises.add(pais);
        
            System.out.println("Ingresar otro país? S/N");
            salir = leer.nextLine().equalsIgnoreCase("N");
            System.out.println("-----------------");
        } while (!salir);
        
        System.out.println("Paises guardados");
        mostrarPaises(setPaises);
    }
    
    public void mostrarPaises(Collection<String> paises) {
        for (String pais : paises) {
            System.out.print(pais + "  ");
            System.out.println("");
        }
    }
    
    public void eliminarPais(HashSet<String> setPaises) {
        System.out.println("Ingrese un país para eliminar -> ");
        String pais = leer.nextLine();
        boolean encontrado = false;
        System.out.println("-----------------");
        
        Iterator<String> it = setPaises.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(pais)) {
                it.remove();
                encontrado = true;
                System.out.println("Paises guardados");
                mostrarPaises(setPaises);
            }
        }
        
        if (!encontrado) {
            System.out.println("El pais " + pais + " no se encuentra en la lista.");
        }
    }
    
    public void dejarDeLeer() {
        leer.close();
    }
}
