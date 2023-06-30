package clasesutilidad_ejercicio2.entidades;

public class ParDeNumeros {
    private double numero1, numero2;

    public ParDeNumeros() {
        this.numero1 = Math.random()*10;
        this.numero2 = Math.random()*10;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Números: " + "Número 1 = " + numero1 + ", Número 2 = " + numero2;
    }
    
    
}
