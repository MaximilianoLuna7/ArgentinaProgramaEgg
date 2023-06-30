package clasesutilidad_extra1;

import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class ClasesUtilidad_Extra1 {
//    Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce
//    meses del año, en minúsculas. A continuación, declara una variable mesSecreto de tipo String, y
//    hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El programa debe pedir al
//    usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace,
//    pedir que vuelva a intentar adivinar el mes secreto.  Un ejemplo de ejecución del programa podría
//    ser este:
//    Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
//    No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
//    ¡Ha acertado!

    public static void main(String[] args) {
        
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[(int) (Math.random() * 12)];
        
        Scanner leer = new Scanner(System.in);
        String mesIngresado = "";
        System.out.println("Adivina el mes secreto");
        do {            
            System.out.println("Cuál es el mes secreto?");
            mesIngresado = leer.nextLine();
            if (mesIngresado.equalsIgnoreCase(mesSecreto)) {
                System.out.println("Adivinaste! El mes es " + mesSecreto);
            } else {
                System.out.println("No, intenta otra vez");
            }
            System.out.println("------------------");
        } while (!mesIngresado.equalsIgnoreCase(mesSecreto));
        
        leer.close();
    }
    
}
