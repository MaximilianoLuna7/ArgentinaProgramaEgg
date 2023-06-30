package logica;

import java.util.Scanner;

public class Libro {
    String isbn;
    String titulo;
    String autor;
    int numeroDePaginas;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int numeroDePaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
    
    public void cargarLibro(){
        System.out.println("Ingrese los datos del libro");
        Scanner leer = new Scanner(System.in);
        
        System.out.print("ISBN: ");
        isbn = leer.nextLine();
        System.out.print("Titulo del libro: ");
        titulo = leer.nextLine();
        System.out.print("Autor: ");
        autor = leer.nextLine();
        System.out.print("Cantidad de paginas del libro: ");
        numeroDePaginas = leer.nextInt();
        
        leer.close();
    }
    
    public void informarLibro() {
        System.out.println("Datos del libro");
        System.out.println("ISBN: " + isbn);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Cantidad de paginas: " + numeroDePaginas);
    }
}
