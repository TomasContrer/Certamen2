package com.mycompany.certamen2;

import java.util.ArrayList;

public class Novela extends Libro{
    
    private String tipo;

    public Novela(String tipo) {
        this.tipo = tipo;
    }

    public Novela() {
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void AgregarNovela(ArrayList <Novela> Novelas){
        Novela nuevaNovela = new Novela();
        nuevaNovela.crearLibro();
        Novelas.add(nuevaNovela);
    }
    public void mostrarNovela(ArrayList <Novela> Novelas){
        
        System.out.println("Ingrese el identificador: ");
        int identificador = entrada.nextInt();
        for(int i = 0; i < Novelas.size(); i++){
            if(Novelas.get(i).getId() == identificador)
                Novelas.get(i).mostrarLibro(Novelas.get(i).getTipo());
        }
    }
}
