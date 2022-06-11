package bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HocSinh {
    private String hoTen;
    private Date namSinh;
    private String gioiTinh;
    private float dtb;
    private String hanhKiem;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    public String getHanhKiem() {
        return hanhKiem;
    }

    public void setHanhKiem(String hanhKiem) {
        this.hanhKiem = hanhKiem;
    }

    public HocSinh inputData(Scanner scanner) throws ParseException {
        System.out.print("Nhập họ tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhập ngày tháng năm sinh: ");
        this.namSinh = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
        System.out.print("Nhập giới tính: ");
        this.gioiTinh = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        this.dtb = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập hạnh kiểm: ");
        this.hanhKiem = scanner.nextLine();
        return this;
    }

    @Override
    public String toString() {
        return String.format("%-30s\t%-10s\t%-9s\t%-15.2f\t%-10s",
                this.hoTen, new SimpleDateFormat("dd/MM/yyyy").format(this.namSinh),
                this.gioiTinh, this.dtb, this.hanhKiem);
    }
}
