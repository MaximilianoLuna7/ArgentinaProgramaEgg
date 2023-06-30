package clasesutilidad_ejercicio6.servicios;

import clasesutilidad_ejercicio6.entidades.Curso;
import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class CursoServicio {
    Scanner leer = new Scanner(System.in);
    
    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];
        System.out.println("Ingrese los nombres de los alumnos");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print((i+1) + "° alumno: ");
            alumnos[i] = leer.nextLine();
        }
        return alumnos;
    }
    
    public Curso creaCurso() {
        System.out.println("Ingresar los datos del curso");
        
        System.out.print("Nombre del curso: ");
        String nombreCurso = leer.nextLine();
        
        System.out.print("Horas al día: ");
        int horasPorDia = leer.nextInt();
        
        System.out.print("Días a la semana: ");
        int diasPorSemana = leer.nextInt();
        
        leer.nextLine();
        System.out.print("Turno (Mañana o Tarde): ");
        String turno = leer.nextLine();
        
        System.out.print("Precio por hora: ");
        double precioPorHora = leer.nextDouble();
        leer.nextLine();
        
        String[] alumnos = cargarAlumnos();
        
        return new Curso(nombreCurso, turno, horasPorDia, diasPorSemana, precioPorHora, alumnos);
    }
    
    public double calcularGananciaSemanal(Curso curso) {
        return curso.getCantidadHorasPorDia() * curso.getCantidadDiasPorSemana() * curso.getPrecioPorHora() * curso.getAlumnos().length;
    }
    
    public void dejarDeLeer() {
        leer.close();
    }
}
