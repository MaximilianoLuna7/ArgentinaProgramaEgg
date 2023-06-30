package poo_ejercicio2;

import java.util.Scanner;

public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el radio de la circunferencia: ");
        radio = leer.nextDouble();
        
        leer.close();
    }
    
    public Double calcularArea() {
        return (Math.PI * Math.pow(radio, 2)); //Math.pow(a, b) es 'a' elevado a 'b'.
    }
    
    public Double calcularPerimetro() {
        return (2* Math.PI * radio);
    }
}
