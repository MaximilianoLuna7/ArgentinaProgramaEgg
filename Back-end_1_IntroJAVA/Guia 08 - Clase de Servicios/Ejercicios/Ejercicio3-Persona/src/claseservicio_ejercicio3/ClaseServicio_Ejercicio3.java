package claseservicio_ejercicio3;

import claseservicio_ejercicio3.entidades.Persona;
import claseservicio_ejercicio3.servicios.PersonaServicio;
import java.util.Scanner;

public class ClaseServicio_Ejercicio3 {
//    Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: nombre,
//    edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro
//    atributo, puede hacerlo. Agregar constructores, getters y setters.
//    En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
//    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
//    Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después
//    se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo
//    introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
//    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta
//    fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y
//    la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que
//    la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un
//    valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
//    A continuación, en la clase main hacer lo siguiente:
//    Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada
//    objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso
//    ideal e indicar para cada objeto si la persona es mayor de edad.
//    Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays),
//    para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso
//    ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos
//    menores. Para esto, podemos crear unos métodos adicionales.


    public static void main(String[] args) {
        PersonaServicio pServicio = new PersonaServicio();
        
        // Creo una persona con el método y las demás las ingreso previamente
        Persona persona1 = pServicio.crearPersona();
        Persona persona2 = new Persona("Juan Martínez", 15, 'H', 78, 1.80);
        Persona persona3 = new Persona("Andrea López", 27, 'M', 55, 1.65);
        Persona persona4 = new Persona("David Rodríguez", 38, 'H', 85, 1.75);
    //  Persona persona5 = new Persona("Carmen Ramírez", 50, 'M', 70, 1.62);
        System.out.println("------------------");
        
        System.out.println("Personas cargadas:");
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
        System.out.println(persona4.toString());
        System.out.println("------------------");
        
        // Armo arrays con imcs y edades
        int[] imcs = new int[4];
        imcs[0] = pServicio.calcularIMC(persona1);
        imcs[1] = pServicio.calcularIMC(persona2);
        imcs[2] = pServicio.calcularIMC(persona3);
        imcs[3] = pServicio.calcularIMC(persona4);
        
        for (int i = 0; i < 4; i++) {
            System.out.println(imcs[i]);
        }
        
        boolean[] edades = new boolean[4];
        edades[0] = pServicio.esMayorDeEdad(persona1);
        edades[1] = pServicio.esMayorDeEdad(persona2);
        edades[2] = pServicio.esMayorDeEdad(persona3);
        edades[3] = pServicio.esMayorDeEdad(persona4);
        
        // Calculo los porcentajes usando métodos
        double porcentajeBajoPeso = pServicio.calcularPorcentajesImc(imcs, -1);
        double porcentajePesoIdeal = pServicio.calcularPorcentajesImc(imcs, 0);
        double porcentajeSobrePeso = pServicio.calcularPorcentajesImc(imcs, 1);
        double porcentajeMayores = pServicio.calcularPorcentajesEdades(edades, "Mayores");
        double porcentajeMenores = pServicio.calcularPorcentajesEdades(edades, "Menores");
        
        // Muestro los resultados por pantalla
        System.out.println("El " + porcentajeBajoPeso + "% de las personas está por debajo de su peso");
        System.out.println("El " + porcentajePesoIdeal + "% de las personas está en su peso ideal");
        System.out.println("El " + porcentajeSobrePeso + "% de las personas está con sobrepeso");
        System.out.println("El " + porcentajeMayores + "% de las personas son mayores de edad");
        System.out.println("El " + porcentajeMenores + "% de las personas son menores de edad");
    }
    
}
