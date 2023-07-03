package colecciones_extra1.servicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class Extra1Servicio {
    public void ingresarEnteros(ArrayList<Integer> numeros) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresando números");
        boolean salir = false;
        do {            
            System.out.println("Ingrese un número entero (para salir ingrese -99) -> ");
            Integer numero = leer.nextInt();
            if (numero == -99) {
                salir = true;
            } else {
                numeros.add(numero);
            }
        } while (!salir);
        leer.close();
    }
    
    public void mostrarNumeros(ArrayList<Integer> numeros) {
        System.out.println("Números guardados");
        System.out.print("[");
        for (int i = 0; i < numeros.size()-1; i++) {
            System.out.print(numeros.get(i) + ", ");
        }
        System.out.println(numeros.get(numeros.size()-1) + "]");
    }
    
    public int cantidadNumeros(ArrayList<Integer> numeros) {
        return numeros.size();
    }
    
    public int sumaNumeros(ArrayList<Integer> numeros) {
        int suma = 0;
        for (Integer numero : numeros) {
            suma += numero;
        }
        return suma;
    }
    
    public double promedioNumeros(ArrayList<Integer> numeros) {
        return sumaNumeros(numeros) / cantidadNumeros(numeros);
    }
}
