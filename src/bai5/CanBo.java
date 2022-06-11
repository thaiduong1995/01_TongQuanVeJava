package bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CanBo {
    private String maCB;
    private String hoTen;
    private Date ngaySinh;
    private int soNC;
    private int gioLT;

    public String getMaCB() {
        return maCB;
    }

    public void setMaCB(String maCB) {
        this.maCB = maCB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getSoNC() {
        return soNC;
    }

    public void setSoNC(int soNC) {
        this.soNC = soNC;
    }

    public int getGioLT() {
        return gioLT;
    }

    public void setGioLT(int gioLT) {
        this.gioLT = gioLT;
    }

    public CanBo inputData(Scanner scanner) throws ParseException {
        System.out.print("Nhập mã cán bộ: ");
        this.maCB = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhập ngày sinh(ngày/tháng/năm): ");
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
        System.out.print("Số ngày công: ");
        this.soNC = Integer.parseInt(scanner.nextLine());
        System.out.print("Số giờ làm thêm: ");
        this.gioLT = Integer.parseInt(scanner.nextLine());
        return this;
    }

    @Override
    public String toString() {
        return String.format("%-9s\t%-30s\t%-10s\t%-27d\t%-15d", this.maCB, this.hoTen,
                new SimpleDateFormat("dd/MM/yyyy").format(this.ngaySinh), this.soNC, this.gioLT);
    }
}
