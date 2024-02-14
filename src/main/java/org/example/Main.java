package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Shape1 sh;

        System.out.println("Enter 1 for hexagone and 2 for octagon");


        int choice = sc.nextInt();

        switch (choice){
            case 1 : sh = new Hexagon();

                System.out.println("Enter height for Hexagone");
                int height = sc.nextInt();

                sh.setHeight(height);
                System.out.println("Enter the width of the hexagon");

                int width = sc.nextInt();

                sh.setWidth(width);
                System.out.println(sh.getArea());
                break;
            case 2 : sh = new Octogon();

                System.out.println("Side of octogon");
                int side = sc.nextInt();

                ((Octogon) sh).setSide(side);
                System.out.println(sh.getArea());
            default:  System.out.println("Not a choice");
            break;
        }


        sc.close(); // good practicice
    }
}