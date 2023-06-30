package clasesutilidad_ejercicio1.servicios;

import clasesutilidad_ejercicio1.entidades.Cadena;

public class CadenaServicio {
    
    public void mostrarVocales(Cadena cadena) {
        String vocales = "AEIOU";
        int cantidadVocales = 0;
        
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (vocales.indexOf(Character.toUpperCase(cadena.getFrase().charAt(i))) != -1) {
                cantidadVocales++;
            }
        }
        
        System.out.println("La frase tiene " + cantidadVocales + " vocales.");
    }
    
    public String invertirFrase(Cadena cadena) {
        String fraseInvertida = "";
        for (int i = cadena.getLongitud()-1; i >= 0; i--) {
            fraseInvertida += cadena.getFrase().charAt(i);
        }
        return fraseInvertida;
    }
    
    public int vecesRepetido(String letra, Cadena cadena) {
        int repeticiones = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(String.valueOf(cadena.getFrase().charAt(i)))) {
                repeticiones++;
            }
        }
        return repeticiones;
    }
    
    public void compararLongitud(String frase, Cadena cadena) {
        if (frase.length() < cadena.getLongitud()) {
            System.out.println("Es más corta que la frase inicial.");
        } else if(frase.length() > cadena.getLongitud()) {
            System.out.println("Es más larga que la frase inicial.");
        } else {
            System.out.println("Tiene la misma longitud que la frase inicial.");
        }
    }
    
    public void unirFrases(String frase, Cadena cadena) {
        System.out.println(cadena.getFrase() + " " + frase);
    }
    
    
    public void reemplazar(String letra, Cadena cadena) {
        System.out.println("Nueva frase: " + cadena.getFrase().replace("a", letra));
    }
    
    public boolean contiene(String letra, Cadena cadena) {
        return cadena.getFrase().contains(letra);
    }
}
