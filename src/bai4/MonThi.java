package bai4;

import java.util.Scanner;

public class MonThi {
    private String maMT;
    private String tenMT;
    private int heSo;
    private float diem;

    public String getMaMT() {
        return maMT;
    }

    public void setMaMT(String maMT) {
        this.maMT = maMT;
    }

    public String getTenMT() {
        return tenMT;
    }

    public void setTenMT(String tenMT) {
        this.tenMT = tenMT;
    }

    public int getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public MonThi inputData(Scanner scanner) {
        System.out.print("Nhập mã môn thi: ");
        this.maMT = scanner.nextLine();
        System.out.print("Nhập tên môn thi: ");
        this.tenMT = scanner.nextLine();
        System.out.print("Nhập hệ số môn: ");
        this.heSo = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập điểm môn thi: ");
        this.diem = Float.parseFloat(scanner.nextLine());
        return this;
    }

    @Override
    public String toString() {
        return String.format("%-10s\t%-30s\t%-8d\t%-4.2f", this.maMT, this.tenMT, this.heSo, this.diem);
    }
}
