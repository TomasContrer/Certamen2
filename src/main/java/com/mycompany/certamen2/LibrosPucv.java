package com.mycompany.certamen2;

import java.util.ArrayList;

public class LibrosPucv extends Libro{
    
    private String escuela;

    public LibrosPucv(String escuela) {
        this.escuela = escuela;
    }

    public LibrosPucv() {
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    
    public void AgregarLibrosPucv(ArrayList <LibrosPucv> LibrosPucvs){
        LibrosPucv nuevaLibro = new LibrosPucv();
        nuevaLibro.crearLibro();
        LibrosPucvs.add(nuevaLibro);
    }
    public void mostrarLibrosPucv(ArrayList <LibrosPucv> LibrosPucvs){
        
        System.out.println("Ingrese el identificador: ");
        int identificador = entrada.nextInt();
        for(int i = 0; i < LibrosPucvs.size(); i++){
            if(LibrosPucvs.get(i).getId() == identificador)
                LibrosPucvs.get(i).mostrarLibro(LibrosPucvs.get(i).getEscuela());
        }
    }
}
