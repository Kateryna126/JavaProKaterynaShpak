package com.gmail.katerynashpak;

import java.util.List;

public class ShapeCalculatorImpl implements ShapeCalculator{
    @Override
    public double calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes){
            totalArea+= shape.getArea();
        }
        return totalArea;
    }
}
