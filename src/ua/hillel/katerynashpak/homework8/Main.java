package ua.hillel.katerynashpak.homework8;

import java.util.Arrays;
import java.util.List;

import static java.lang.String.format;

public class Main {
    public static void main(String[] args) {
        List<Shape>shapes = Arrays.asList(
                new Circle(5),
                new Triangle(3,4,5),
                new Square(4)
        );
        ShapeCalculator shapeCalculator = new ShapeCalculatorImpl();
        double totalArea = shapeCalculator.calculateTotalArea(shapes);
        System.out.println(format("The total area of all shapes: %.2f", totalArea));
    }
}
