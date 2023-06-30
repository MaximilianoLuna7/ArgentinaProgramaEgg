package poo_extra5;

public class POO_Extra5 {
//    Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". Luego,
//    crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en
//    función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado
//    tiene más de 30 años o del 5% si tiene menos de 30 años.
    
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Pablo Marmol", 25, 10000);
        Empleado emp2 = new Empleado("Pedro Picapiedra", 35, 10000);
        
        System.out.println("Primer empleado: " + emp1.toString());
        System.out.println("Recibira un aumento de $" + emp1.calcularAumento());
        System.out.println("-----------------");
        System.out.println("Segundo empleado" + emp2.toString());
        System.out.println("Recibira un aumento de $" + emp2.calcularAumento());
    }
    
}
