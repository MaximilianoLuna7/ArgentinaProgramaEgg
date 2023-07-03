package colecciones_ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class Colecciones_Ejercicio2 {
//    Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//    un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//    está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//    ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//    la lista ordenada.
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        List<String> razas = new ArrayList<>();
        
        System.out.println("Guardar razas de perros");
        String respuesta;
        do {
            System.out.print("Ingrese una raza -> ");
            String raza = leer.nextLine();
            razas.add(raza);
            System.out.println("");
            System.out.println("Quiere ingresar otra raza? S/N");
            respuesta = leer.nextLine().toUpperCase();
            System.out.println("-------------------");
        } while (!"N".equals(respuesta));
        
        
        System.out.println("Razas de perros guardadas:");
        for (String raza : razas) {
            System.out.print(raza + "  ");
        }
        System.out.println("");
        System.out.println("-------------------");
        
        System.out.print("Ingrese una raza de perro para eliminar de la lista -> ");
        String razaAEliminar = leer.nextLine();
        if (razas.contains(razaAEliminar)) {
            razas.remove(razaAEliminar);
        } else {
            System.out.println("La raza ingresada no está en la lista.");
        }
        System.out.println("Razas de perros guardadas:");
        for (String raza : razas) {
            System.out.print(raza + "  ");
        }
        System.out.println("");
        System.out.println("-------------------");
        
        leer.close();
    }
    
}
