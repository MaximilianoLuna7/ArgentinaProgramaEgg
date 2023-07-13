package excepciones_ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class Excepciones_Ejercicio4 {
//    Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
//    causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
//    no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
//    número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
//    utilizando bloques try/catch para las distintas excepciones

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese un número entero: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Ingrese otro número entero: ");
            int num2 = Integer.parseInt(scanner.next());
            
            int resultado = dividir(num1, num2);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número entero válido.");
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena no puede convertirse a entero.");
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
    
    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }

}
