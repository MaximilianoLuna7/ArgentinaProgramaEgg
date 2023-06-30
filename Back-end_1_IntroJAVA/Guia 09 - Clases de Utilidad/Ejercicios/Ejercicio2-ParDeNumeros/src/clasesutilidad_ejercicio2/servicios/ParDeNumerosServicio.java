package clasesutilidad_ejercicio2.servicios;

import clasesutilidad_ejercicio2.entidades.ParDeNumeros;

public class ParDeNumerosServicio {
    public void mostrarValores(ParDeNumeros numeros) {
        System.out.println(numeros.toString());
    }
    
    public double devolverMayor(ParDeNumeros numeros) {
        return Math.max(numeros.getNumero1(), numeros.getNumero2());
    }
    
    public double calcularPotencia(ParDeNumeros numeros) {
        int mayor = (int) Math.round(devolverMayor(numeros));
        int menor = (int) Math.round(Math.min(numeros.getNumero1(), numeros.getNumero2()));
        return Math.pow(mayor, menor);
    }
    
    public double calcularRaiz(ParDeNumeros numeros) {
        double menor = Math.abs(Math.min(numeros.getNumero1(), numeros.getNumero2()));
        return Math.sqrt(menor);
    }
}
