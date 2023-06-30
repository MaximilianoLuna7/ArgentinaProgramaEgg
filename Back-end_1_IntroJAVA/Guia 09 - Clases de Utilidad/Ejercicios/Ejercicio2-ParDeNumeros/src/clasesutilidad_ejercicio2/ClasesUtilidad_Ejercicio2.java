package clasesutilidad_ejercicio2;

import clasesutilidad_ejercicio2.entidades.ParDeNumeros;
import clasesutilidad_ejercicio2.servicios.ParDeNumerosServicio;

public class ClasesUtilidad_Ejercicio2 {
//    Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se
//    realizarán diferentes operaciones matemáticas. La clase debe tener un constructor vacío, getters y
//    setters.  En el constructor vacío se usará el Math.random para generar los dos números. Crear una
//    clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
//    Método mostrarValores que muestra cuáles son los dos números guardados.
//    Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
//    Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número.
//    Previamente se deben redondear ambos valores.
//    Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la
//    raíz cuadrada se debe obtener el valor absoluto del número.

    public static void main(String[] args) {
        ParDeNumeros numeros = new ParDeNumeros();
        ParDeNumerosServicio numServicio = new ParDeNumerosServicio();
        
        //Método mostrarValores()
        numServicio.mostrarValores(numeros);
        System.out.println("----------------");
        //Método devolverMayor()
        System.out.println("El mayor de los números es: " + numServicio.devolverMayor(numeros));
        System.out.println("----------------");
        //Método calcularPotencia()
        System.out.println("Mayor elevado al menor: " + numServicio.calcularPotencia(numeros));
        System.out.println("----------------");
        //Método calcularRaiz()
        System.out.println("Raiz cuadrada del menor: " + numServicio.calcularRaiz(numeros));
    }
    
}
