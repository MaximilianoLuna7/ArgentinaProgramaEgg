package poo_extra1;

public class POO_Extra1 {
//    Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se deberá
//    definir además dos constructores: uno vacío que inicializa el título y el autor a
//    cadenas vacías y otro que reciba como parámetros el título y el autor de la canción.
//    Se deberán además definir los métodos getters y setters correspondientes.
    
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("Around the World", "Red Hot Chili Peppers");
        
        System.out.println(cancion1.toString());
    }
    
}
