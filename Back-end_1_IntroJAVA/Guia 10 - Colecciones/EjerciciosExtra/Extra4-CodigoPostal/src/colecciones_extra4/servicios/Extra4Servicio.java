package colecciones_extra4.servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class Extra4Servicio {
    Scanner leer = new Scanner(System.in);
    
    public void ingresarCodigoPostal(HashMap<Integer, String> ciudades) {
        System.out.print("Ingrese el nombre de la ciudad -> ");
        String nombre = leer.nextLine();
        
        System.out.print("Ingrese el código postal -> ");
        Integer codigoPostal = leer.nextInt();
        leer.nextLine();
        
        ciudades.put(codigoPostal, nombre);
    }
    
    public void mostrarDatos(HashMap<Integer, String> ciudades) {
        for (Integer codigoPostal : ciudades.keySet()) {
            System.out.println("Ciudad: " + ciudades.get(codigoPostal));
            System.out.println("Codigo Postal: " + codigoPostal);
        }
    }
    
    public void buscarCiudad(HashMap<String, Integer> ciudades) {
        System.out.print("Ingrese un codigo postal para buscar -> ");
        Integer codigoBuscar = leer.nextInt();
        if (ciudades.containsKey(codigoBuscar)) {
            System.out.println("Este codigo postal es de la ciudad de " + ciudades.get(codigoBuscar));
        } else {
            System.out.println("No hay ninguna ciudad con este codigo postal.");
        }
    }
    
    
}
