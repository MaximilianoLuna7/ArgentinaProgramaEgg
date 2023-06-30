package poo_extra4;

public class POO_Extra4 {
//    Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un
//    método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la
//    cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar una
//    transacción de retiro.

    public static void main(String[] args) {
        Cuenta cuentaMaxi = new Cuenta(500, "Maximiliano Luna");
        
        cuentaMaxi.mostrarCuenta();
        System.out.println("-----------------");
        cuentaMaxi.retirarDinero();
        System.out.println("-----------------");
    }
    
}
