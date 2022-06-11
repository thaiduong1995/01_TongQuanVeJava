package bai1.application;

import java.util.Scanner;

public class Cricle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Cricle inputData(Scanner scanner) {
        System.out.print("Nhập kích thước bán kính: ");
        this.radius = Double.parseDouble(scanner.nextLine());
        return this;
    }

    public double diameter() {
        return 2 * Math.PI * this.radius;
    }

    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
