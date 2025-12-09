package aula_143.application;

import aula_143.entities.Circle;
import aula_143.entities.Rectangle;
import aula_143.entities.Shape;
import aula_143.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the number of shapes: ");
        int N = sc.nextInt();

        List<Shape> shapeList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.println("Shape #" + i+1 + " data: ");
            System.out.printf("Rectangle or Circle (r/c): ");
            char ch = sc.next().charAt(0);
            System.out.printf("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r') {
                System.out.printf("Width: ");
                double width = sc.nextDouble();
                System.out.printf("Height: ");
                double height = sc.nextDouble();
                shapeList.add(new Rectangle(color, width, height));
            } else {
                System.out.printf("Radius: ");
                double radius = sc.nextDouble();
                shapeList.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : shapeList) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}
