package BT1;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Nhập bán kính ");
       double radius = scanner.nextDouble();
       Circle circle = new Circle(radius);
       System.out.println("Your Circle \n"+circle.display());
       System.out.println("Perimeter of the Circle :"+circle.getPerimester());
       System.out.println("Area of the Circle :"+circle.getArea());
   }
}
