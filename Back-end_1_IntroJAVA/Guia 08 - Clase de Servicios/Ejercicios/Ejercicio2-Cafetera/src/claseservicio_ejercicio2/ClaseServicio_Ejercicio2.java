package claseservicio_ejercicio2;

import claseservicio_ejercicio2.entidades.Cafetera;
import claseservicio_ejercicio2.servicios.CafeteraServicio;
import java.util.Scanner;

public class ClaseServicio_Ejercicio2 {
//    Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos
//    capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y cantidadActual
//    (la cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con parámetro
//    así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
//    Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
//    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la
//    taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de
//    café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario
//    si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
//    Método vaciarCafetera(): pone la cantidad de café actual en cero. 
//    Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se
//    añade a la cafetera la cantidad de café indicada.

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Cafetera cafet1 = new Cafetera(1000, 600);
        CafeteraServicio cafetServ = new CafeteraServicio();
        
        System.out.println("Estado cafetera");
        System.out.println(cafet1.toString());
        System.out.println("-------------------");
        
        System.out.print("Ingrese el tamano de la taza: ");
        int tamanoTaza = leer.nextInt();
        cafetServ.servirTaza(tamanoTaza, cafet1);
        System.out.println("Estado cafetera");
        System.out.println(cafet1.toString());
        System.out.println("-------------------");
       
        System.out.print("Ingrese la cantidad de cafe para agregar: ");
        int cantidadCafe = leer.nextInt();
        cafetServ.agregarCafe(cantidadCafe, cafet1);
        System.out.println("Estado cafetera");
        System.out.println(cafet1.toString());
        System.out.println("-------------------");
        
        System.out.println("Vaciando cafetera...");
        cafetServ.vaciarCafetera(cafet1);
        System.out.println("Estado cafetera");
        System.out.println(cafet1.toString());
        System.out.println("-------------------");
        
        System.out.println("Llenando cafetera...");
        cafetServ.llenarCafetera(cafet1);
        System.out.println("Estado cafetera");
        System.out.println(cafet1.toString());
    }
    
}
