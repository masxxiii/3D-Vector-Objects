package com.vector;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double x,y,z;
        Point p1,p2;
        Vector v1,v2;
        Scanner scan = new Scanner(System.in);

        //reading points and creating vector v1
        System.out.println("Enter point (x):");
        x = scan.nextDouble();
        System.out.println("Enter point (y):");
        y = scan.nextDouble();
        System.out.println("Enter point (z):");
        z = scan.nextDouble();
        p1 = new Point(x, y, z);
        v1 = new Vector(p1);

        //reading points and creating vector v2
        System.out.println("Enter point (x):");
        x = scan.nextDouble();
        System.out.println("Enter point (y):");
        y = scan.nextDouble();
        System.out.println("Enter point (z):");
        z = scan.nextDouble();
        p2 = new Point(x, y, z);
        v2 = new Vector(p2);

        //enhanced switch case for options of the menu
        String choice;
        do {
            System.out.println(menu());
            choice = scan.next();

            switch (choice) {
                case "1" -> {
                    System.out.println();
                    System.out.println(v1);
                    System.out.println(v2);
                    System.out.println();
                }
                case "2" -> {
                    System.out.println("The sum of the vectors:");
                    System.out.println(v1.sum(v2));
                    System.out.println();
                }
                case "3" -> {
                    System.out.println("The difference of the vectors:");
                    System.out.println(v1.diff(v2));
                    System.out.println();
                }
                case "4" -> {
                    System.out.println("Dot product of the vectors:");
                    System.out.println(v1.mul(v2));
                    System.out.println();
                }
                case "5" -> {
                    System.out.println("Length of the vector v1:");
                    System.out.printf("%.2f\n", v1.length());
                    System.out.println();
                    System.out.println("Length of the vector v2:");
                    System.out.printf("%.2f\n", v2.length());
                    System.out.println();
                }
                case "6" -> {
                    System.out.println("The angle of cosine between v1 and v2:");
                    System.out.printf("%.2f\n", v1.angle(v1, v2));
                }
                default -> System.out.println("Choose the correct option!");
            }

        } while (!choice.equals("q"));
    }

    //static method to print menu
    public static String menu()
    {
        return  "---------------------------------------------------------------\n"+
                "Enter ( 1 ) to print the two vectors.\n"+
                "Enter ( 2 ) to calculate the sum of the two vectors.\n"+
                "Enter ( 3 ) to calculate the difference of the two vectors.\n"+
                "Enter ( 4 ) to calculate dot product of the two vectors.\n"+
                "Enter ( 5 ) to calculate the length of the two vectors.\n"+
                "Enter ( 6 ) to calculate the angle of cosine of the two vectors.\n"+
                "Enter ( q ) to quit.\n"+
                "---------------------------------------------------------------";
    }
}
