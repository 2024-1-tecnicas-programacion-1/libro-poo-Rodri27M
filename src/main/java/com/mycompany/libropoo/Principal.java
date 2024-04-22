package com.mycompany.libropoo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo = sc.next();
        String autor = sc.next();
        int anoPublicacion = sc.nextInt();
        String genero = sc.next();
        Libro libro = new Libro(titulo, autor, anoPublicacion, genero); 
        System.out.println(libro.mostrarInformacion());
        libro.marcarLeido();
        System.out.println(libro.isLeido());
       
        System.out.println(libro.esAntiguo());
    }
 
}
