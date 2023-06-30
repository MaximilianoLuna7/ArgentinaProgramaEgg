package claseservicio_ejercicio3.servicios;

import claseservicio_ejercicio3.entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    
    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad()>=18;
    }
    
    public Persona crearPersona() {
        System.out.println("Ingrese sus datos");
        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        
        System.out.print("Edad: ");
        int edad = leer.nextInt();
        
        char sexo = 'x';
        do {
            System.out.println("Sexo (H/M/O): ");
            sexo = leer.next().toUpperCase().charAt(0);
            if (sexo != 'H' && sexo != 'M' && sexo != 'O') {
                System.out.println("El sexo ingresado es incorrecto, vuelva a ingresar.");
            }
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');
        
        System.out.print("Peso en kg: ");
        double peso = leer.nextDouble();
        
        System.out.print("Atura en m: ");
        double altura = leer.nextDouble();
        leer.nextLine();
        
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    public int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if(imc >=20 && imc <=25) {
            return 0;
        } else {
            return 1;
        }
    }
    
    // Método que calcula los porcentajes en las listas.
    public double calcularPorcentajesImc(int[] listaImc, int valorObjetivo) {
        int cantidadObjetivo = 0;
        for (int imc : listaImc) {
            if (imc == valorObjetivo) {
                cantidadObjetivo++;
            }
        }
        return (cantidadObjetivo/ (double) listaImc.length) * 100;
    }
    
    public double calcularPorcentajesEdades(boolean [] listaEdades, String objetivo) {
        int cantidadObjetivo = 0;
        boolean esMayor = objetivo.equalsIgnoreCase("Mayores");
        for (int i = 0; i < listaEdades.length; i++) {
            if (esMayor == listaEdades[i]) {
                cantidadObjetivo++;
            }
        }
        return (double) (cantidadObjetivo/ (double) listaEdades.length) * 100;
    }
}
