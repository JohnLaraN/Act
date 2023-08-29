package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Libro> lista_Libros = new ArrayList<>();

    Libro milibro1 = new Libro();
    milibro1.setId(1);
    lista_Libros.add(milibro1);
    milibro1 = new Libro();
    milibro1.setId(2);
    lista_Libros.add(milibro1);
    milibro1 = new Libro();
    milibro1.setId(3);
    lista_Libros.add(milibro1);



        for (Libro libroActual: lista_Libros) {
            System.out.println("Id: " + libroActual.getId());
        }


    }



}