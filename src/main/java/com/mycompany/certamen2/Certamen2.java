package com.mycompany.certamen2;
       
import java.util.ArrayList;
import java.util.Scanner;

public class Certamen2 {

    public static void main(String[] args) {
        
        ArrayList <Academico> Academicos = new ArrayList();
        ArrayList <Novela> Novelas = new ArrayList();
        ArrayList <LibrosPucv> LibrosPucvs = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        
        Academico academico = new Academico();
        Novela novela = new Novela();
        LibrosPucv librosPucv = new LibrosPucv();
        int opcion;
        do{
            System.out.println("Desea trabajar con 1. Agregar Libro 2. Buscar Libro 0.Para Salir.");
            opcion = entrada.nextInt();
            if(opcion == 1){
                
                int opcionLibros;
                do{
                    
                    System.out.println("Desea trabajar con 1. Agregar Academico 2. Agregar Novela 3. Agregar Libros Pucv 0.Para Salir.");
                    opcionLibros = entrada.nextInt();
                    if(opcionLibros == 1)
                        academico.AgregarAcademico(Academicos);
                    if(opcionLibros == 2)
                        novela.AgregarNovela(Novelas);
                    if(opcionLibros == 3)
                        librosPucv.AgregarLibrosPucv(LibrosPucvs);
                }while(opcionLibros != 0);
            }
            if(opcion == 2){
                
                int opcionLibros;
                do{
                    
                    System.out.println("Desea trabajar con 1. Buscar Academico 2. Buscar Novela 3. Buscar Libros Pucv 0.Para Salir.");
                    opcionLibros = entrada.nextInt();
                    if(opcionLibros == 1)
                        academico.mostrarAcademico(Academicos);
                    if(opcionLibros == 2)
                        novela.mostrarNovela(Novelas);
                    if(opcionLibros == 3)
                        librosPucv.mostrarLibrosPucv(LibrosPucvs);
                }while(opcionLibros != 0);
            }
        }while (opcion != 0);
    }
}
