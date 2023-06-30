package clasesutilidad_ejercicio3.servicios;

import java.util.Arrays;
import java.util.Collections;

public class ArregloServicio {
    public void inicializarA(double[] arregloA) {
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.random()*10;
        }
    }
    
    public void mostrar(double[] arreglo) {
        System.out.print("[");
        for (int i = 0; i < arreglo.length-1; i++) {
            System.out.print(arreglo[i] + ", ");
        }
        System.out.println(arreglo[arreglo.length-1] + "]");
    }
    
    public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);
        Collections.reverse(Arrays.asList(arreglo));
    }
    
    public void inicializarB(double[] arregloA, double[] arregloB) {
        Arrays.fill(arregloB, 0.5);
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
    }
}
