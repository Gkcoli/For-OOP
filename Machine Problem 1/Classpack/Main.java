package ClassPack;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the length of Rectangle: ");
    double length = scanner.nextDouble();

    System.out.print("Enter the width of Rectangle: ");
    double width = scanner.nextDouble();

    System.out.print("Enter the height of the Box: ");
    double height = scanner.nextDouble();

    Rectangle rectangle = new Rectangle(length, width);
    
    Box box = new Box(length, width, height);
   
    double area = rectangle.getArea();
    double volume = box.getVolume();

    System.out.println("Area: " + area);
    System.out.println("Volume:" + volume);
    scanner.close();



    }   
    
}
