package poo_ejercicio2;

public class POO_Ejercicio2 {
//    Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo
//    real. A continuación, se deben crear los siguientes métodos:
//    Método constructor que inicialice el radio pasado como parámetro.
//    Métodos get y set para el atributo radio de la clase Circunferencia.
//    Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
//    Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
//    Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

    public static void main(String[] args) {
        Circunferencia circunferencia1 = new Circunferencia();
        circunferencia1.crearCircunferencia();
        System.out.println("-----------------");
        String perimetroRound = String.format("%.2f", circunferencia1.calcularPerimetro()); //perimetro redondeado a 2 decimales
        System.out.println("Perimetro de la circunferencia: " + perimetroRound);
        String areaRound = String.format("%.2f", circunferencia1.calcularArea());
        System.out.println("Area de la circunferencia: " + areaRound);
    }
    
}
