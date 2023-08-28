package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Libro> Libros = new ArrayList<>();
        int decision = 0;

        decision = Integer.parseInt(JOptionPane.showInputDialog("Que deseas realizar?: " +
                 "\n 1) Ingresar un libro" +
                "\n 2) Mostrar lista de libros"));
        switch (decision){
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
    }
    private static int suma(int n1, int n2){
        return n1+n2;
    }
    private static int suma(int n1, int n2, int n3){
        return suma(suma(n1, n2),n3);
    }
    private static int suma(int n1, int n2, int n3, int n4){
        return suma(suma(n1, n2,n3), n4);
    }


}