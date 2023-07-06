package colecciones_extra4;

import colecciones_extra4.servicios.Extra4Servicio;
import java.util.HashMap;

/**
 * @author Maximiliano Luna
 */
public class Colecciones_Extra4 {
//    Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
//    página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
//    número.
//    • Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
//    • Muestra por pantalla los datos introducidos
//    • Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
//    • Muestra por pantalla los datos
//    • Agregar una ciudad con su código postal correspondiente más al HashMap.
//    • Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
//    • Muestra por pantalla los datos.
        
    public static void main(String[] args) {
        HashMap<String, Integer> ciudades =new HashMap<>(); //La ciudad será la llave porque dos ciudades pueden tener el mismo código postal, el nombre de la ciudad es lo que los haría únicos.
        Extra4Servicio servicio = new Extra4Servicio();
        
//        Ingresar 10 ciudades con su con su código postal
        System.out.println("Ingresar los datos de 10 ciudades:");
        for (int i = 0; i < 10; i++) {
            servicio.ingresarCodigoPostal(ciudades);
            System.out.println("---------------------");
        }
        
//        10 ciudades precargadas para pruebas
//        ciudades.put("Ciudad de Buenos Aires", 1417);
//        ciudades.put("Córdoba", 5001);
//        ciudades.put("Rosario", 2132);
//        ciudades.put("Mendoza", 5500);
//        ciudades.put("La Plata", 1933);
//        ciudades.put("San Miguel de Tucumán", 4101);
//        ciudades.put("Mar del Plata", 7600);
//        ciudades.put("Salta", 4400);
//        ciudades.put("Santa Fe", 3000);
//        ciudades.put("San Juan", 5400);
        
//        Se muestran por pantalla los datos introducidos
        System.out.println("Ciudades guardadas:");
        servicio.mostrarDatos(ciudades);
        System.out.println("---------------------");
        
//        Buscar ciudad por su código postal
        System.out.println("Buscar una ciudad");
        servicio.buscarCiudad(ciudades);
        System.out.println("---------------------");
        
//        Se muestran por pantalla los datos introducidos
        System.out.println("Ciudades guardadas:");
        servicio.mostrarDatos(ciudades);
        System.out.println("---------------------");
        
//        Agregar una ciudad con su código postal
        System.out.println("Agregar una ciudad");
        servicio.ingresarCodigoPostal(ciudades);
        System.out.println("---------------------");
        
//        Eliminar 3 ciudades ingresadas por el usuario
        System.out.println("Se eliminarán 3 ciudades");
        for (int i = 0; i < 3; i++) {
            System.out.println("Eliminando la " + (i+1) + " ciudad...");
            servicio.eliminarCiudad(ciudades);
        }
        servicio.dejarDeLeer();
        System.out.println("---------------------");
        
//        Se muestran por pantalla los datos introducidos
        System.out.println("Ciudades guardadas:");
        servicio.mostrarDatos(ciudades);
        System.out.println("---------------------");
    }

}