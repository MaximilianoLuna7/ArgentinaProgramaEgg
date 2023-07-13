package herencia_extra1;

import herencia_extra1.entidades.AMotor;
import herencia_extra1.entidades.Alquiler;
import herencia_extra1.entidades.Barco;
import herencia_extra1.entidades.Cliente;
import herencia_extra1.entidades.Velero;
import herencia_extra1.entidades.Yate;
import herencia_extra1.servicios.ServicioAlquiler;
import java.util.ArrayList;

/**
 * @author Maximiliano Luna
 */
public class Herencia_Extra1 {
//    En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
//    nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
//    amarre y el barco que lo ocupará.
//    Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
//    Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
//    • Número de mástiles para veleros.
//    • Potencia en CV para barcos a motor.
//    • Potencia en CV y número de camarotes para yates de lujo.
//    Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
//    alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
//    multiplicando por 10 los metros de eslora).
//    En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
//    sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
//    en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
//    el número de camarotes.
//    Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
//    métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
//    precio final de su alquiler.
    
    public static void main(String[] args) {
        ArrayList<Barco> barcosDisponibles = new ArrayList<>();
        ServicioAlquiler serv = new ServicioAlquiler();
        
        // Barcos veleros
        Velero velero1 = new Velero(2, "V001", 10.5, 2005);
        Velero velero2 = new Velero(3, "V002", 12.2, 2010);
        Velero velero3 = new Velero(1, "V003", 8.7, 2018);
        
        //Barcos a motor
        AMotor motor1 = new AMotor(200, "M001", 15.8, 2008);
        AMotor motor2 = new AMotor(250, "M002", 14.6, 2015);
        AMotor motor3 = new AMotor(180, "M003", 16.2, 2019);
        
        // Yates de lujo
        Yate yate1 = new Yate(500, 5, "Y001", 20.5, 2012);
        Yate yate2 = new Yate(400, 4, "Y002", 18.9, 2016);
        Yate yate3 = new Yate(600, 6, "Y003", 22.0, 2019);
        
        // Agregar los barcos a la lista de barcos disponibles
        barcosDisponibles.add(velero1);
        barcosDisponibles.add(velero2);
        barcosDisponibles.add(velero3);
        barcosDisponibles.add(motor1);
        barcosDisponibles.add(motor2);
        barcosDisponibles.add(motor3);
        barcosDisponibles.add(yate1);
        barcosDisponibles.add(yate2);
        barcosDisponibles.add(yate3);
        
        System.out.println("Bienvenido al alquiler de barcos");
        Cliente cliente1 = serv.ingresarCliente();
        System.out.println("-------------------------");
        
        System.out.println("Procederemos a realizar el trámite del alquiler");
        Alquiler nuevoAlquiler = serv.alquilarBarco(cliente1, barcosDisponibles);
        System.out.println("-------------------------");
        
        System.out.println("Se realizó el alquiler, esta es la información de su operación:");
        serv.mostrarAlquiler(nuevoAlquiler);
    }

}
