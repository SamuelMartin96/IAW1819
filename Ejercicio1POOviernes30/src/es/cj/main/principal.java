package es.cj.main;

import java.util.Scanner;

import es.cj.clases.libro;

	//Escribe un programa para probar el funcionamiento de la clase Libro.//

public class principal {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String titulo, autor;
        int ejemplares;
        int prestados;
        
        libro L1 = new libro();
		
        System.out.print("Título: ");
        titulo = sc.nextLine();
        System.out.print("Autor: ");
        autor = sc.nextLine();
        System.out.print("Nº de ejemplares: ");
        ejemplares = sc.nextInt();
        System.out.print("Nº de prestados: ");
        prestados = sc.nextInt();
        
        L1.setTitulo(titulo);
        L1.setAutor(autor);
        L1.setEjemplares(ejemplares);
        L1.setPrestados(prestados);

        System.out.println();
        
        System.out.println("Libro");
        System.out.println("-----");
        System.out.println("Titulo: " + L1.getTitulo());
        System.out.println("Autor: " + L1.getAutor());
        System.out.println("Ejemplares: " + L1.getEjemplares());
        System.out.println("Prestados: " + L1.getPrestados());
        
        System.out.println();

        //Prestamos un libro//
        if (L1.incrementarAtributos()) {
            System.out.println("Libro Prestado: " + L1.getTitulo());
        } else {
            System.out.println("Del libro " + L1.getTitulo() + " no quedan ejemplares.");
        }
        
        System.out.println();
        
        System.out.println("Libro");
        System.out.println("-----");
        System.out.println("Titulo: " + L1.getTitulo());
        System.out.println("Autor: " + L1.getAutor());
        System.out.println("Ejemplares: " + L1.getEjemplares());
        System.out.println("Prestados: " + L1.getPrestados());
        
        System.out.println();
        
        //Devolvemos un libro//
        if (L1.decrementarAtributos()) {
            System.out.println("Se ha devuelto el libro " + L1.getTitulo());
        } else {
            System.out.println("No hay ejemplares del libro " + L1.getTitulo() + " prestados");
        }
        
        System.out.println();
        
        System.out.println("Libro");
        System.out.println("-----");
        System.out.println("Titulo: " + L1.getTitulo());
        System.out.println("Autor: " + L1.getAutor());
        System.out.println("Ejemplares: " + L1.getEjemplares());
        System.out.println("Prestados: " + L1.getPrestados());
	sc.close();
	}
}