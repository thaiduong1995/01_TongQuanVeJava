package bai1.application;

import java.util.Scanner;

public class Rectangular {
    private double width;
    private double length;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangular inputData(Scanner scanner) {
        System.out.print("Nhập kích thước chiều rộng: ");
        this.width = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập kích thước chiều dài: ");
        this.length = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập kích thước chiều cao: ");
        this.height = Double.parseDouble(scanner.nextLine());
        return this;
    }

    public double surroundingArea () {
        return 2 * (this.width + this.length) * this.height;
    }

    public double totalArea() {
        return this.surroundingArea() + 2 * this.width * this.length;
    }

    public double volume() {
        return this.width * this.length * this.height;
    }
}
