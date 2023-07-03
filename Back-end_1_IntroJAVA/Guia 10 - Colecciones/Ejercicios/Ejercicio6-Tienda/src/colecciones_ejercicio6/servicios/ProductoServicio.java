package colecciones_ejercicio6.servicios;

import colecciones_ejercicio6.entidades.Producto;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class ProductoServicio {
    Scanner leer = new Scanner(System.in);
    
    public void agregarProducto(HashMap<String, Double> productos) {
        Producto nuevoProducto = crearProducto();
        productos.put(nuevoProducto.getNombre(), nuevoProducto.getPrecio());
    }
    
    public Producto crearProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = leer.nextLine();
        
        System.out.print("Ingrese el precio del producto: ");
        Double precio = leer.nextDouble();
        leer.nextLine();
        
        return new Producto(nombre, precio);
    }
    
    public void modificarPrecio(HashMap<String, Double> productos) {
        System.out.println("A qué producto le quiere modificar el precio?");
        String nombreProducto = leer.nextLine();
        if (productos.containsKey(nombreProducto)) {
            System.out.println("Ingrese el nuevo precio para " + nombreProducto);
            Double precioModificado = leer.nextDouble();
            leer.nextLine();
            
            productos.put(nombreProducto, precioModificado);
        } else {
            System.out.println("El producto " + nombreProducto + " no está almacenado.");
        } 
    }
    
    public void eliminarProducto(HashMap<String, Double> productos) {
        System.out.println("Ingrese el producto que quiere eliminar");
        String nombreProducto = leer.nextLine();
        if (productos.containsKey(nombreProducto)) {
            productos.remove(nombreProducto);
            System.out.println("Se eliminó " + nombreProducto);
        } else {
            System.out.println("El producto " + nombreProducto + " no está almacenado.");
        }
    }
    
    public void mostrarProductos(HashMap<String, Double> productos) {
        for (String nombre : productos.keySet()) {
            double precio = productos.get(nombre);
            System.out.println(nombre + ": " + precio);
        }
    }
    
    public void menu(HashMap<String, Double> productos) {
        int opcion;
        
        do {
            mostrarMenu();
            opcion = leer.nextInt();
            leer.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println("Agregando un nuevo producto...");
                    agregarProducto(productos);
                    break;
                case 2:
                    System.out.println("Modificación de precio...");
                    modificarPrecio(productos);
                    break;
                case 3:
                    System.out.println("Eliminando un producto...");
                    eliminarProducto(productos);
                    break;
                case 4:
                    System.out.println("Productos guardados...");
                    mostrarProductos(productos);
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            
            System.out.println("----------------------"); // Separador entre iteraciones del menú

        } while (opcion != 6);
        
        leer.close();
    }
    
    public void mostrarMenu() {
        System.out.println("========== MENÚ ==========");
        System.out.println("1. Agregar un producto");
        System.out.println("2. Modificar precio");
        System.out.println("3. Eliminar un producto");
        System.out.println("4. Mostrar productos");
        System.out.println("6. Salir");
        System.out.print("Ingrese su opción: ");
    }
}
