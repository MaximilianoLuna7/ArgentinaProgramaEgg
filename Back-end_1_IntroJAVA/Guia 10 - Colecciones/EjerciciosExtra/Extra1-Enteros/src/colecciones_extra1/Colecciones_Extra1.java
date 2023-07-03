package colecciones_extra1;

import colecciones_extra1.servicios.Extra1Servicio;
import java.util.ArrayList;

/**
 * @author Maximiliano Luna
 */
public class Colecciones_Extra1 {
//    Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
//    los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
//    introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
//    programa mostrará por pantalla el número de valores que se han leído, su suma y su
//    media (promedio).
    
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Extra1Servicio servicio = new Extra1Servicio();
        
        servicio.ingresarEnteros(numeros);
        servicio.mostrarNumeros(numeros);
        System.out.println("---------------------");
        
        System.out.println("Cantidad de números ingresados: " + servicio.cantidadNumeros(numeros));
        System.out.println("Suma de los números ingresados: " + servicio.sumaNumeros(numeros));
        System.out.println("Promedio de los números ingresados: " + servicio.promedioNumeros(numeros));
    }

}
