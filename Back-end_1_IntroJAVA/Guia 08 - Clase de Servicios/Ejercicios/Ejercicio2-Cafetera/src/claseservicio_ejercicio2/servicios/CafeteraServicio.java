package claseservicio_ejercicio2.servicios;

import claseservicio_ejercicio2.entidades.Cafetera;

public class CafeteraServicio {
    
    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }
    
    public void servirTaza(int tamanoTaza, Cafetera cafetera) {
        if (cafetera.getCantidadActual() >= tamanoTaza) {
            cafetera.setCantidadActual(cafetera.getCantidadActual()-tamanoTaza);
            System.out.println("Se lleno la taza.");
        } else {
            int cafeServido = cafetera.getCantidadActual();
            cafetera.setCantidadActual(0);
            System.out.println("No se pudo llenar la taza, se sirvio una cantidad de " + cafeServido + " ml de cafe.");
        }
    }
    
    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
    }
    
    public void agregarCafe(int cantidadCafe, Cafetera cafetera) {
        int cafeFaltante = cafetera.getCapacidadMaxima()-cafetera.getCantidadActual();
        
        if (cafeFaltante >= cantidadCafe) {
            cafetera.setCantidadActual(cafetera.getCantidadActual()+cantidadCafe);
            System.out.println("Se agrego " + cantidadCafe + " ml de cafe.");
        } else {
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            System.out.println("Se lleno la cafetera y sobraron " + (cantidadCafe-cafeFaltante) + " ml de cafe.");
        }
    }
    
}
