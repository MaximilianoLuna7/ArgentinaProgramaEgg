package colecciones_extra2.servicios;

import colecciones_extra2.entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class CantanteFamosoServicio {
    Scanner leer = new Scanner(System.in);
    
    public void mostrarCantantes(ArrayList<CantanteFamoso> cantantesFamosos) {
        for (CantanteFamoso cantanteFamoso : cantantesFamosos) {
            System.out.println(cantanteFamoso.toString());
        }
    }
    
    public void agregarCantante(ArrayList<CantanteFamoso> cantantesFamosos) {
        CantanteFamoso nuevoCantante = crearCantante();
        cantantesFamosos.add(nuevoCantante);
    }
    
    public void eliminarCantante(ArrayList<CantanteFamoso> cantantesFamosos) {
        System.out.println("Ingrese el nombre del cantante que quiere eliminar -> ");
        String cantanteAEliminar = leer.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < cantantesFamosos.size(); i++) {
            CantanteFamoso cantante = cantantesFamosos.get(i);
            if (cantante.getNombre().equalsIgnoreCase(cantanteAEliminar)) {
                cantantesFamosos.remove(cantante);
                System.out.println("Se eliminó de la lista a " + cantante.getNombre());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El cantante " + cantanteAEliminar + " no está guardado en la lista");
        }
    }
    
    public void menu(ArrayList<CantanteFamoso> cantantesFamosos) {
        int opcion;
        
        do {
            mostrarMenu();
            opcion = leer.nextInt();
            leer.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println("------------------");
                    System.out.println("Ingresando un cantante...");
                    agregarCantante(cantantesFamosos);
                    break;
                case 2:
                    System.out.println("------------------");
                    System.out.println("Cantantes guardados");
                    mostrarCantantes(cantantesFamosos);
                    break;
                case 3:
                    System.out.println("------------------");
                    System.out.println("Eliminando un cantante");
                    eliminarCantante(cantantesFamosos);
                    break;
                case 4:
                    System.out.println("------------------");
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            
            System.out.println(""); // Separador entre iteraciones del menú

        } while (opcion != 4);
        
        leer.close();
    }
    
    public void mostrarMenu() {
        System.out.println("========== MENÚ ==========");
        System.out.println("1. Agregar un cantante");
        System.out.println("2. Mostrar los cantantes");
        System.out.println("3. Eliminar un cantante");
        System.out.println("4. Salir");
        System.out.print("Ingrese su opción: ");
    }
    
    public CantanteFamoso crearCantante() {
        System.out.print("Ingrese el nombre del cantante -> ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese su disco con más ventas -> ");
        String discoMasVendido = leer.nextLine();
        return new CantanteFamoso(nombre, discoMasVendido);
    }
}
