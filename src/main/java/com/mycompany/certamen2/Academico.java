package com.mycompany.certamen2;

import java.util.ArrayList;
import java.util.Scanner;

public class Academico extends Libro{

    Scanner entrada = new Scanner(System.in);
    
    public Academico() {
    }
    
    public void AgregarAcademico(ArrayList <Academico> Academico){
        Academico nuevoAcademico = new Academico();
        nuevoAcademico.crearLibro();
        Academico.add(nuevoAcademico);
    }
    public void mostrarAcademico(ArrayList <Academico> Academico){
        
        System.out.println("Ingrese el identificador: ");
        int identificador = entrada.nextInt();
        for(int i = 0; i < Academico.size(); i++){
            if(Academico.get(i).getId() == identificador)
                Academico.get(i).mostrarLibro();
        }
    }
}
