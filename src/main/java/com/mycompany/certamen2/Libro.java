package com.mycompany.certamen2;

import java.util.Scanner;

public class Libro {
    
    private String titulo; 
    private String autor;
    private int precio;
    private int id;
    Scanner entrada = new Scanner(System.in);

    public Libro(String Título, String autor, int precio, int id) {
        this.titulo = Título;
        this.autor = autor;
        this.precio = precio;
        this.id = id;
    }

    public Libro() {
    }

    public String getTítulo() {
        return titulo;
    }

    public void setTítulo(String Título) {
        this.titulo = Título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void crearLibro(){
        System.out.println("Ingrese un id");
        this.id = entrada.nextInt();
        System.out.println("Ingrese el Titulo");
        entrada.nextLine();
        this.titulo = entrada.nextLine();
        System.out.println("Ingrese un Autor");
        this.autor = entrada.nextLine();
        System.out.println("Ingrese el Precio");
        this.precio = entrada.nextInt();
    }
    public void mostrarLibro(){
        
        System.out.println("El identificador es: " + this.id);
        System.out.println("El Titulo es: " + this.titulo);
        System.out.println("El Autor es: " + this.autor);
        System.out.println("La Precio es: " + this.precio);
        System.out.println("");
        System.out.println("");
    }
    
    public void mostrarLibro(String tipo){
        
        System.out.println("El identificador es: " + this.id);
        System.out.println("El Titulo es: " + this.titulo);
        System.out.println("El Autor es: " + this.autor);
        System.out.println("La Precio es: " + this.precio);
        System.out.println("El Tipo es: " + tipo);
        System.out.println("");
        System.out.println("");
    }
    public void mostrarLibroPucv(String escuela){
        
        System.out.println("El identificador es: " + this.id);
        System.out.println("El Titulo es: " + this.titulo);
        System.out.println("El Autor es: " + this.autor);
        System.out.println("La Precio es: " + this.precio);
        System.out.println("La Escuela es: " + escuela);
        System.out.println("");
        System.out.println("");
    }
    
}
