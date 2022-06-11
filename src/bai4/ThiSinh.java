package bai4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ThiSinh {
    private String sbd;
    private String hoTen;
    public Date ngaySinh;
    private ArrayList<MonThi> objectLists = new ArrayList<MonThi>();

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
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

    public ArrayList<MonThi> getObjectLists() {
        return objectLists;
    }

    public void setObjectLists(ArrayList<MonThi> objectLists) {
        this.objectLists = objectLists;
    }

    public ThiSinh inputData(Scanner scanner) throws ParseException {
        System.out.print("Nhập số báo danh: ");
        this.sbd = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhập ngày sinh( ngày/ tháng/ năm): ");
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
        System.out.println("Nhập danh sách môn thi: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhập thôn tin môn thi thứ " + (i + 1) + ":");
            objectLists.add(new MonThi().inputData(scanner));
        }
        return this;
    }

    @Override
    public String toString() {
        return String.format("%-11s\t%-30s\t%-10s\nDanh sách các môn thi\n%-52s",
                this.sbd, this.hoTen,
                new SimpleDateFormat("dd/MM/yyyy").format(this.ngaySinh), this.objectLists);
    }
}
