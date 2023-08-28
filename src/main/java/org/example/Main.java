package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


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



}