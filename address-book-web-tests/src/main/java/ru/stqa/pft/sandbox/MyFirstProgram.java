package ru.stqa.pft.sandbox;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("Anna");
        hello("Oleg");

        Square s = new Square(5);
        System.out.println("Площадь квадрата sо sтороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(3, 6);
        System.out.println("Площадь прмоугольника so тороной " + r.a + " и " + r.b + " = " + r.area());

        /*Point p1 = new Point (7,7);
        Point p2 = new Point (3,3);*/

        Point d1 = new Point(7,7,3,3);
        Point d2 = new Point (37,37,1,1);


        d1.display();
        System.out.println();
        d2.display();

    }

    //public static double distance (Point p1, Point p2) {
        //return Math.sqrt(((p1.x - p2.x)/2) + ((p1.y - p2.y)/2));
    //}


    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }


        /* d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))*/

}
