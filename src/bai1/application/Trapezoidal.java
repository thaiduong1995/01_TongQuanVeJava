package bai1.application;

import java.util.Scanner;

public class Trapezoidal {
    private double bigBottomEdge;
    private double smallBottomEdge;
    private double height;

    public double getBigBottomEdge() {
        return bigBottomEdge;
    }

    public void setBigBottomEdge(double bigBottomEdge) {
        this.bigBottomEdge = bigBottomEdge;
    }

    public double getSmallBottomEdge() {
        return smallBottomEdge;
    }

    public void setSmallBottomEdge(double smallBottomEdge) {
        this.smallBottomEdge = smallBottomEdge;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Nhập giá trị đáy lớn: ");
        this.bigBottomEdge = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập giá trị đáy nhỏ: ");
        this.smallBottomEdge = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập giá trị chiều cao: ");
        this.height = Double.parseDouble(scanner.nextLine());
    }

    public double area() {
        return 0.5 * (this.bigBottomEdge + this.smallBottomEdge) * this.height;
    }

    @Override
    public String toString() {
        return "Hình thang có kích thước đáy lớn " + String.format("%.2f", this.bigBottomEdge)
                + ", đáy nhỏ " + String.format("%.2f", this.smallBottomEdge)
                + ", chiều cao " + String.format("%.2f", this.height);
    }
}
