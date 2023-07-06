package colecciones_extra4.servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class Extra4Servicio {
    Scanner leer = new Scanner(System.in);
    
    public void ingresarCodigoPostal(HashMap<String, Integer> ciudades) {
        System.out.print("Ingrese el nombre de la ciudad -> ");
        String nombre = leer.nextLine();
        
        System.out.print("Ingrese el código postal -> ");
        Integer codigoPostal = leer.nextInt();
        leer.nextLine();
        
        ciudades.put(nombre, codigoPostal);
    }
    
    public void mostrarDatos(HashMap<String, Integer> ciudades) {
        for (Map.Entry<String, Integer> entry : ciudades.entrySet()) {
            System.out.println("Ciudad: " + entry.getKey());
            System.out.println("Código Postal: " + entry.getValue());
        }
    }
    
    public void buscarCiudad(HashMap<String, Integer> ciudades) {
        System.out.print("Ingrese un codigo postal para buscar -> ");
        int codigoBuscar = leer.nextInt();
        leer.nextLine();
        boolean existe = false;
        for (Map.Entry<String, Integer> entry : ciudades.entrySet()) {
            if (entry.getValue() == codigoBuscar) {
                existe = true;
                System.out.println("El código postal " + codigoBuscar + " es de la ciudad de " + entry.getKey());
            }
        }
        if (!existe) {
            System.out.println("El código " + codigoBuscar + " no pertenece a niguna ciudad guardada.");
        }
    }
    
    public void eliminarCiudad(HashMap<String, Integer> ciudades) {
        System.out.print("Ingrese el nombre de la ciudad que quiere eliminar -> ");
        String ciudadEliminar = leer.nextLine();
        
        if (ciudades.containsKey(ciudadEliminar)) {
            ciudades.remove(ciudadEliminar);
        } else {
            System.out.println("La ciudad de " + ciudadEliminar + " no está guardada.");
        }
    }
    
    public void dejarDeLeer() {
        leer.close();
    }
}
