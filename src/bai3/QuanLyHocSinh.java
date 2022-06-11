package bai3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHocSinh {
    ArrayList<HocSinh> listStudents = new ArrayList<HocSinh>();

    public ArrayList<HocSinh> getListStudents() {
        return listStudents;
    }

    public void setListStudents(ArrayList<HocSinh> listStudents) {
        this.listStudents = listStudents;
    }

    public void inputData() throws ParseException {
        System.out.println("Nhập danh sách học sinh:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Nhập học sinh thứ " + (i + 1) + " :");
            listStudents.add(new HocSinh().inputData(new Scanner(System.in)));
        }
    }

    public void showData() {
        System.out.println("Danh sách học sinh:");
        System.out.println("STT\tHọ tên\t\t\t\t\t\t\tNăm sinh\tGiới tính\tĐiểm trung bình\tHạnh kiểm");
        for (int i = 0; i < listStudents.size(); i++) {
            System.out.printf("%-3d\t%-74s", i + 1, listStudents.get(i));
        }
    }
}
