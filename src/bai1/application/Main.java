package bai1.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Trapezoidal trapezoidal = new Trapezoidal();
        trapezoidal.inputData(new Scanner(System.in));
        System.out.println(trapezoidal + " có diện tích là: " + String.format("%.2f", trapezoidal.area()));
        Cricle cricle = new Cricle();
        cricle.inputData(new Scanner(System.in));
        System.out.printf("Chu vi hình tròn là %.2f\n", cricle.diameter());
        System.out.printf("Diện tích hình tròn là %.2f\n", cricle.area());
        Triangle triangle = new Triangle();
        triangle.inputData(new Scanner(System.in));
        System.out.printf("Chu vi hình tam giác là %.2f\n", triangle.diameter());
        System.out.printf("Diện tích hình tam giác là %.2f\n", triangle.area());*/
        Rectangular rectangular = new Rectangular();
        rectangular.inputData(new Scanner(System.in));
        System.out.printf("Diện tích xung quanh là %.2f\n", rectangular.surroundingArea());
        System.out.printf("Diện tích toàn phần là %.2f\n", rectangular.totalArea());
        System.out.printf("Thể tích là %.2f\n", rectangular.volume());
    }
}
