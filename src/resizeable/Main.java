package resizeable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Circle circle1=new Circle(5);
        Rectangle rectangle1=new Rectangle(10,2);
        Square square=new Square(5);
        System.out.println(circle1.toString());
        double number=scanner.nextDouble();
        System.out.println("Enter percent");
        circle1.resize(number);
        System.out.println(circle1);

    }
}