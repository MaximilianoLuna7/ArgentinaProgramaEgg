package poo_ejercicio4;

import java.util.Scanner;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los valores del rectangulo");
        System.out.print("Base: ");
        base = leer.nextInt();
        System.out.print("Altura: ");
        altura = leer.nextInt();
        
        leer.close();
    }
    
    public int calcularArea() {
        return base * altura;
    }
    
    public int calcularPerimetro() {
        return 2 * (base + altura);
    }
    
    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura-1 || j == 0 || j == base-1 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
