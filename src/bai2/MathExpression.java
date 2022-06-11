package bai2;

import java.util.Scanner;

public class MathExpression {
    public static void main(String[] args) {
        int a, b;
        double x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a= ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập b= ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap x= ");
        x = Double.parseDouble(scanner.nextLine());
        System.out.printf("Kết quả của biểu thức là %.2f", a / 10.0 + Math.pow(a, b) -
                Math.sin(Math.PI * x / 3) / Math.sqrt(Math.pow((a + b), 2) + 5) + Math.log(a * a + 1) -
                Math.log(4 * Math.pow(x, 2 * a) + 3) / Math.log(3) / 2.55);
    }
}
