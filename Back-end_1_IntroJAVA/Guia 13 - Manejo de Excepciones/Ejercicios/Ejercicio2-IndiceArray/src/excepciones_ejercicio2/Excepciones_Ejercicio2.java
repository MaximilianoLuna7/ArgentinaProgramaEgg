package excepciones_ejercicio2;

import excepciones_ejercicio2.entidades.Auto;

/**
 * @author Maximiliano Luna
 */
public class Excepciones_Ejercicio2 {
    
    public static void main(String[] args) {
        Auto a = new Auto();
        
        try{
            System.out.println(a.getMarcaAuto()[6]);
        } catch (Exception e){
            System.out.println("Se salió de rango en el índice ingresado");
        }
    }

}
