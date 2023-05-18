package ClassPack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Select a shape to Compute");
            System.out.println("1. Rectangle");
            System.out.println("2. Square");
            System.out.println("3. Triangle");
            System.out.println("4. Circle");
            System.out.println("0. Exit");

            choice = scanner.nextInt();

            switch (choice){
                case 1:
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();

                Rectangle rectangle = new Rectangle(length, width, height);
                System.out.println("Area: " + rectangle.getArea());
                System.out.println("Volume: " + rectangle.getVolume());
                break;

                case 2:
                System.out.print("Enter side length: ");
                double sideLength = scanner.nextDouble();

                Square square = new Square(sideLength);
                System.out.println("Area: " + square.getArea());
                System.out.println("Volume: " + square.getVolume());
                break;

                case 3:
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height: ");
                double triangleHeight = scanner.nextDouble();

                Triangle triangle = new Triangle(base, triangleHeight);
                System.out.println("Area: " + triangle.getArea());
                System.out.println("Volume: " + triangle.getVolume());
                break;

                case 4:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();

                Circle circle = new Circle(radius);
                System.out.println("Area: " + circle.getArea());
                System.out.println("Volume: " + circle.getVolume());
                break;

                case 0:
                System.out.println("Exiting....");
                break;

                default:
                System.out.println("Mali Ka Nang Pinili. Paki Ulit;)");
                break;
            }
            System.out.println();
        }while (choice !=0);
        scanner.close();     
    }  
}
