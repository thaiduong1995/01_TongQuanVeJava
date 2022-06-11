package bai1.application;

import java.util.Scanner;

public class Triangle {
    private double edge1;
    private double edge2;
    private double edge3;

    public double getEdge1() {
        return edge1;
    }

    public void setEdge1(double edge1) {
        this.edge1 = edge1;
    }

    public double getEdge2() {
        return edge2;
    }

    public void setEdge2(double edge2) {
        this.edge2 = edge2;
    }

    public double getEdge3() {
        return edge3;
    }

    public void setEdge3(double edge3) {
        this.edge3 = edge3;
    }

    public Triangle inputData(Scanner scanner) {
        System.out.print("Nhập kích thước cạnh thứ nhất: ");
        this.edge1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập kích thước cạnh thứ hai: ");
        this.edge2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập kích thước cạnh thứ ba: ");
        this.edge3 = Double.parseDouble(scanner.nextLine());
        return this;
    }

    public double diameter() {
        return this.edge1 + this.edge2 + this.edge3;
    }

    public double area() {
        return Math.sqrt(this.diameter() / 2  * (this.diameter() / 2 - this.edge1) * (this.diameter() / 2 - this.edge2)
                * (this.diameter() / 2 - this.edge3));
    }
}
