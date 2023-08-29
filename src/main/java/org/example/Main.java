package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Libro> lista_Libros = new ArrayList<>();
        Libro milibro1 = new Libro();
        milibro1.setId(1);
        lista_Libros.add(milibro1);
         for (int i = 1; i < 10; i++){
             milibro1 = new Libro();
             milibro1.setId(i+1);
             milibro1.setNombre("Nombre"+ i+1);
             lista_Libros.add(milibro1);
         }
        lista_Libros.add(milibro1);
        for (Libro libroActual: lista_Libros) {
            if(libroActual.getId() % 2 == 0){
                System.out.println("Id: " + libroActual.getId() + "\nNombre: " + libroActual.getNombre());
                System.out.println("--------------------------------------------------------------");
            }
        }
    }
}