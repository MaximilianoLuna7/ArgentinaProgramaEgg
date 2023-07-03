package colecciones_ejercicio3;

import colecciones_ejercicio3.entidades.Alumno;
import colecciones_ejercicio3.servicios.AlumnoServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class Colecciones_Ejercicio3 {
//    Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
//    alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
//    con sus 3 notas.
//    En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//    toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//    pregunta al usuario si quiere crear otro Alumno o no.
//    Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//    final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//    del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//    promedio final, devuelto por el método y mostrado en el main.
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Alumno> listadoDeAlumnos = new ArrayList<>();
        AlumnoServicio alumnoServicio = new AlumnoServicio();
        
        alumnoServicio.guardarAlumno(listadoDeAlumnos);
        System.out.println("Ingrese el alumno del que quiere calcular su nota final.");
        String alumnoNotaFinal = leer.nextLine();
        boolean encontrado = false;
        for (Alumno alumno : listadoDeAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(alumnoNotaFinal)) {
                alumnoServicio.notaFinal(alumno);
                encontrado = true;
            }
        }
        alumnoServicio.dejarDeLeer();
        if (!encontrado) {
            System.out.println("El alumno " + alumnoNotaFinal + " no está en el listado de alumnos.");
        }
    }
    
}
