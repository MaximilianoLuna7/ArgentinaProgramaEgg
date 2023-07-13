package excepciones_ejercicio5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class Excepciones_Ejercicio5 {
//    Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
//    debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
//    ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
//    número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
//    consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
//    ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
//    controlar esa excepción e indicarlo
        
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(500) + 1;
        int numeroIngresado = 0;
        int intentos = 8;
        
        System.out.println("Tenés " + intentos + " intentos para adivinar el número secreto");
        do {            
            System.out.print("Adiviná el número: ");
            try {
                numeroIngresado = leer.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número entero");
                leer.nextLine(); // Descartar el valor no válido del búfer de entrada
                intentos--;
                System.out.println("---------------------");
                continue; // Volver al inicio del bucle
            }
    
            if (numeroIngresado < numeroSecreto) {
                System.out.println("No... El número secreto es mayor que " + numeroIngresado);
                intentos--;
            } else if (numeroIngresado > numeroSecreto) {
                System.out.println("No... El número secreto es menor que " + numeroIngresado);
                intentos--;
            } else {
                System.out.println("Adivinaste!");
            }
            System.out.println("---------------------");
        } while (intentos != 0 && numeroIngresado != numeroSecreto);

        if (intentos == 0) {
            System.out.println("Te quedaste sin intentos, perdiste");
        }
        System.out.println(" El número secreto es " + numeroSecreto);
    }

}
