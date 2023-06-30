package clasesservicio_extra1.servicios;

import clasesservicio_extra1.entidades.Raices;

public class RaicesServicio {
    public double getDiscriminante(Raices raices) {
        return (Math.pow(raices.getB(), 2)) - 4 * raices.getA() * raices.getC();
    }
    
    public boolean tieneRaices(Raices raices) {
        return getDiscriminante(raices) > 0;
    }
    
    public boolean tieneRaiz(Raices raices) {
        return getDiscriminante(raices) == 0;
    }
    
    public void obtenerRaices(Raices raices) {
        if (tieneRaices(raices)) {
            double r1 = -(raices.getB() - (Math.sqrt(getDiscriminante(raices)))) / 2*raices.getA();
            double r2 = -(raices.getB() + (Math.sqrt(getDiscriminante(raices)))) / 2*raices.getA();
            System.out.println("Las soluciones de esta ecuación son " + r1 + " y " + r2);
        }
    }
    
    public void obtenerRaiz(Raices raices) {
        if (tieneRaiz(raices)) {
            double r = -raices.getB() / 2*raices.getA();
            System.out.println("La solución de esta ecuación es " + r);
        }
    }
    
    public void calcular(Raices raices) {
        if (tieneRaices(raices)) {
            System.out.println("La ecuación tiene dos soluciones:");
            obtenerRaices(raices);
        } else if (tieneRaiz(raices)) {
            System.out.println("La ecuación tiene una solución:");
            obtenerRaiz(raices);
        } else {
            System.out.println("La ecuación no tiene solución real.");
        }
    }
    
    // Método extra para mostrar la ecuación
    public void mostrarEcuación(Raices raices) {
        System.out.println("(" + raices.getA() + ")x^2 + (" + raices.getB() + ")x + (" + raices.getC() + ")");
    }
}
