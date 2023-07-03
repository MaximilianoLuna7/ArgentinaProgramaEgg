package colecciones_ejercicio3.servicios;

import colecciones_ejercicio3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Maximiliano Luna
 */
public class AlumnoServicio {
    Scanner leer = new Scanner(System.in);
    
    public void guardarAlumno(ArrayList<Alumno> listaDeAlumnos) {
        boolean salir;
        do {
            Alumno alumno = ingresarAlumno();
            listaDeAlumnos.add(alumno);
            System.out.println("-------------------");
            leer.nextLine();
            
            System.out.println("Ingresar Otro alumno? S/N");
            salir = leer.nextLine().equalsIgnoreCase("N");
        } while (!salir);
    }
    
    public void notaFinal(Alumno alumno) {
        double promedio = promediarNotas(alumno.getNotas());
        System.out.println("El promedio del alumno " + alumno.getNombre() + " es de " + promedio);
    }
    
    
    //Métodos extras necesarios:
    public Alumno ingresarAlumno() {
        System.out.println("Ingrese los datos del alumno");
        System.out.print("Nombre -> ");
        String nombre = leer.nextLine();
        
        int[] notas = ingresarNotas();
        
        return new Alumno(nombre, notas);
    }
    
    public int[] ingresarNotas() {
        System.out.println("Notas");
        int[] notas = new int[3];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la " + (i+1) + "° nota -> ");
            notas[i] = leer.nextInt();
        }
        System.out.println("");
        
        return notas;
    }
    
    public double promediarNotas(int[] notas) {
        int total = 0;
        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }
        
        return total / notas.length;
    }
    
    public void dejarDeLeer() {
        leer.close();
    }
}
