package colecciones_ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class Colecciones_Ejercicio1 {
//    Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//    programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//    después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//    salir, se mostrará todos los perros guardados en el ArrayList.
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        List<String> razas = new ArrayList<>();
        
        System.out.println("Guardar razas de perros");
        String respuesta = "S";
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
            System.out.println(raza);
        }
    }

}
