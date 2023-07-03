package colecciones_extra2;

import colecciones_extra2.entidades.CantanteFamoso;
import colecciones_extra2.servicios.CantanteFamosoServicio;
import java.util.ArrayList;

/**
 * @author Maximiliano Luna
 */
public class Colecciones_Extra2 {
//    Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
//    tendrá como atributos el nombre y discoConMasVentas.
//    Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
//    de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
//    y su disco con más ventas por pantalla.
//    Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
//    agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
//    elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
    
    public static void main(String[] args) {
        ArrayList<CantanteFamoso> cantantesFamosos = new ArrayList<>();
        CantanteFamosoServicio cfServicio = new CantanteFamosoServicio();
        
        //Ingreso 5 cantantes famosos
        CantanteFamoso cantante1 = new CantanteFamoso("Michael Jackson", "Thriller");
        CantanteFamoso cantante2 = new CantanteFamoso("Whitney Houston", "El guardaespaldas");
        CantanteFamoso cantante3 = new CantanteFamoso("Eagles", "Their Greatest Hits");
        CantanteFamoso cantante4 = new CantanteFamoso("The Beatles", "Sgt. Pepper's Lonely Hearts Club Band");
        CantanteFamoso cantante5 = new CantanteFamoso("Nirvana", "Nevermind");
        cantantesFamosos.add(cantante1);
        cantantesFamosos.add(cantante2);
        cantantesFamosos.add(cantante3);
        cantantesFamosos.add(cantante4);
        cantantesFamosos.add(cantante5);
        
        cfServicio.menu(cantantesFamosos);
        
        System.out.println("Lista final");
        cfServicio.mostrarCantantes(cantantesFamosos);
    }

}
